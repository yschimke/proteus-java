// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/netifi/proteus/rpc/simpleservice.proto

package io.netifi.proteus.rpc;

public final class SimpleServiceProto {
  private SimpleServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_netifi_proteus_rpc_SimpleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_netifi_proteus_rpc_SimpleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_netifi_proteus_rpc_SimpleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_netifi_proteus_rpc_SimpleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)io/netifi/proteus/rpc/simpleservice.pr" +
      "oto\022\025io.netifi.proteus.rpc\032\033google/proto" +
      "buf/empty.proto\"\'\n\rSimpleRequest\022\026\n\016requ" +
      "estMessage\030\001 \001(\t\")\n\016SimpleResponse\022\027\n\017re" +
      "sponseMessage\030\001 \001(\t2\206\004\n\rSimpleService\022]\n" +
      "\014RequestReply\022$.io.netifi.proteus.rpc.Si" +
      "mpleRequest\032%.io.netifi.proteus.rpc.Simp" +
      "leResponse\"\000\022O\n\rFireAndForget\022$.io.netif" +
      "i.proteus.rpc.SimpleRequest\032\026.google.pro" +
      "tobuf.Empty\"\000\022`\n\rRequestStream\022$.io.neti" +
      "fi.proteus.rpc.SimpleRequest\032%.io.netifi" +
      ".proteus.rpc.SimpleResponse\"\0000\001\022q\n\036Strea" +
      "mingRequestSingleResponse\022$.io.netifi.pr" +
      "oteus.rpc.SimpleRequest\032%.io.netifi.prot" +
      "eus.rpc.SimpleResponse\"\000(\001\022p\n\033StreamingR" +
      "equestAndResponse\022$.io.netifi.proteus.rp" +
      "c.SimpleRequest\032%.io.netifi.proteus.rpc." +
      "SimpleResponse\"\000(\0010\001B-\n\025io.netifi.proteu" +
      "s.rpcB\022SimpleServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_io_netifi_proteus_rpc_SimpleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_netifi_proteus_rpc_SimpleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_netifi_proteus_rpc_SimpleRequest_descriptor,
        new java.lang.String[] { "RequestMessage", });
    internal_static_io_netifi_proteus_rpc_SimpleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_netifi_proteus_rpc_SimpleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_netifi_proteus_rpc_SimpleResponse_descriptor,
        new java.lang.String[] { "ResponseMessage", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
