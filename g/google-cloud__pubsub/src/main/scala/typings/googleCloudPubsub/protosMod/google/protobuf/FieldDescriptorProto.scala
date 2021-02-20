package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label
import typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto () extends IFieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
  
  /** FieldDescriptorProto defaultValue. */
  @JSName("defaultValue")
  var defaultValue_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto extendee. */
  @JSName("extendee")
  var extendee_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto jsonName. */
  @JSName("jsonName")
  var jsonName_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto label. */
  @JSName("label")
  var label_FieldDescriptorProto: Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String) = js.native
  
  /** FieldDescriptorProto name. */
  @JSName("name")
  var name_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto number. */
  @JSName("number")
  var number_FieldDescriptorProto: Double = js.native
  
  /** FieldDescriptorProto oneofIndex. */
  @JSName("oneofIndex")
  var oneofIndex_FieldDescriptorProto: Double = js.native
  
  /** FieldDescriptorProto proto3Optional. */
  @JSName("proto3Optional")
  var proto3Optional_FieldDescriptorProto: Boolean = js.native
  
  /**
    * Converts this FieldDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** FieldDescriptorProto typeName. */
  @JSName("typeName")
  var typeName_FieldDescriptorProto: String = js.native
  
  /** FieldDescriptorProto type. */
  @JSName("type")
  var type_FieldDescriptorProto: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String) = js.native
}
object FieldDescriptorProto {
  
  @js.native
  sealed trait Label extends StObject
  /** Label enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.Label")
  @js.native
  object Label extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Label with Double] = js.native
    
    @js.native
    sealed trait LABEL_OPTIONAL extends Label
    /* 1 */ val LABEL_OPTIONAL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL with Double = js.native
    
    @js.native
    sealed trait LABEL_REPEATED extends Label
    /* 3 */ val LABEL_REPEATED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED with Double = js.native
    
    @js.native
    sealed trait LABEL_REQUIRED extends Label
    /* 2 */ val LABEL_REQUIRED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED with Double = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  /** Type enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
    
    @js.native
    sealed trait TYPE_BOOL extends Type
    /* 8 */ val TYPE_BOOL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BOOL with Double = js.native
    
    @js.native
    sealed trait TYPE_BYTES extends Type
    /* 12 */ val TYPE_BYTES: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BYTES with Double = js.native
    
    @js.native
    sealed trait TYPE_DOUBLE extends Type
    /* 1 */ val TYPE_DOUBLE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_DOUBLE with Double = js.native
    
    @js.native
    sealed trait TYPE_ENUM extends Type
    /* 14 */ val TYPE_ENUM: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_ENUM with Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED32 extends Type
    /* 7 */ val TYPE_FIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED32 with Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED64 extends Type
    /* 6 */ val TYPE_FIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED64 with Double = js.native
    
    @js.native
    sealed trait TYPE_FLOAT extends Type
    /* 2 */ val TYPE_FLOAT: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FLOAT with Double = js.native
    
    @js.native
    sealed trait TYPE_GROUP extends Type
    /* 10 */ val TYPE_GROUP: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_GROUP with Double = js.native
    
    @js.native
    sealed trait TYPE_INT32 extends Type
    /* 5 */ val TYPE_INT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_INT64 extends Type
    /* 3 */ val TYPE_INT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT64 with Double = js.native
    
    @js.native
    sealed trait TYPE_MESSAGE extends Type
    /* 11 */ val TYPE_MESSAGE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_MESSAGE with Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED32 extends Type
    /* 15 */ val TYPE_SFIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED32 with Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED64 extends Type
    /* 16 */ val TYPE_SFIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED64 with Double = js.native
    
    @js.native
    sealed trait TYPE_SINT32 extends Type
    /* 17 */ val TYPE_SINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_SINT64 extends Type
    /* 18 */ val TYPE_SINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT64 with Double = js.native
    
    @js.native
    sealed trait TYPE_STRING extends Type
    /* 9 */ val TYPE_STRING: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_STRING with Double = js.native
    
    @js.native
    sealed trait TYPE_UINT32 extends Type
    /* 13 */ val TYPE_UINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT32 with Double = js.native
    
    @js.native
    sealed trait TYPE_UINT64 extends Type
    /* 4 */ val TYPE_UINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT64 with Double = js.native
  }
  
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.create")
  @js.native
  def create(): FieldDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.create")
  @js.native
  def create(properties: IFieldDescriptorProto): FieldDescriptorProto = js.native
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): FieldDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): FieldDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): FieldDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): FieldDescriptorProto = js.native
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FieldDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): FieldDescriptorProto = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.encode")
  @js.native
  def encode(message: IFieldDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.encode")
  @js.native
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FieldDescriptorProto = js.native
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.toObject")
  @js.native
  def toObject(message: FieldDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.toObject")
  @js.native
  def toObject(message: FieldDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
