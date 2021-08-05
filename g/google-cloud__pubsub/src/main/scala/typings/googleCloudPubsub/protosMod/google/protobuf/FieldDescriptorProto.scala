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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto ()
  extends StObject
     with IFieldDescriptorProto {
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
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Label extends StObject
  /** Label enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.Label")
  @js.native
  object Label extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Label & Double] = js.native
    
    @js.native
    sealed trait LABEL_OPTIONAL
      extends StObject
         with Label
    /* 1 */ val LABEL_OPTIONAL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL & Double = js.native
    
    @js.native
    sealed trait LABEL_REPEATED
      extends StObject
         with Label
    /* 3 */ val LABEL_REPEATED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED & Double = js.native
    
    @js.native
    sealed trait LABEL_REQUIRED
      extends StObject
         with Label
    /* 2 */ val LABEL_REQUIRED: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED & Double = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  /** Type enum. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.FieldDescriptorProto.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type & Double] = js.native
    
    @js.native
    sealed trait TYPE_BOOL
      extends StObject
         with Type
    /* 8 */ val TYPE_BOOL: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BOOL & Double = js.native
    
    @js.native
    sealed trait TYPE_BYTES
      extends StObject
         with Type
    /* 12 */ val TYPE_BYTES: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BYTES & Double = js.native
    
    @js.native
    sealed trait TYPE_DOUBLE
      extends StObject
         with Type
    /* 1 */ val TYPE_DOUBLE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_DOUBLE & Double = js.native
    
    @js.native
    sealed trait TYPE_ENUM
      extends StObject
         with Type
    /* 14 */ val TYPE_ENUM: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_ENUM & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED32
      extends StObject
         with Type
    /* 7 */ val TYPE_FIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED64
      extends StObject
         with Type
    /* 6 */ val TYPE_FIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_FLOAT
      extends StObject
         with Type
    /* 2 */ val TYPE_FLOAT: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FLOAT & Double = js.native
    
    @js.native
    sealed trait TYPE_GROUP
      extends StObject
         with Type
    /* 10 */ val TYPE_GROUP: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_GROUP & Double = js.native
    
    @js.native
    sealed trait TYPE_INT32
      extends StObject
         with Type
    /* 5 */ val TYPE_INT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_INT64
      extends StObject
         with Type
    /* 3 */ val TYPE_INT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_MESSAGE
      extends StObject
         with Type
    /* 11 */ val TYPE_MESSAGE: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_MESSAGE & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED32
      extends StObject
         with Type
    /* 15 */ val TYPE_SFIXED32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED64
      extends StObject
         with Type
    /* 16 */ val TYPE_SFIXED64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT32
      extends StObject
         with Type
    /* 17 */ val TYPE_SINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT64
      extends StObject
         with Type
    /* 18 */ val TYPE_SINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_STRING
      extends StObject
         with Type
    /* 9 */ val TYPE_STRING: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_STRING & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT32
      extends StObject
         with Type
    /* 13 */ val TYPE_UINT32: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT64
      extends StObject
         with Type
    /* 4 */ val TYPE_UINT64: typings.googleCloudPubsub.protosMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT64 & Double = js.native
  }
  
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  /* static member */
  inline def create(): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FieldDescriptorProto]
  inline def create(properties: IFieldDescriptorProto): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def decode(reader: Reader, length: Double): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  inline def decode(reader: Uint8Array): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def decode(reader: Uint8Array, length: Double): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def decodeDelimited(reader: Uint8Array): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IFieldDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IFieldDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IFieldDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: FieldDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
