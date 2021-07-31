package typings.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.IFieldDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldDescriptorProto. */
@JSImport("google-gax", "IamProtos.google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto ()
  extends typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
}
object FieldDescriptorProto {
  
  @JSImport("google-gax", "IamProtos.google.protobuf.FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Label enum. */
  @JSImport("google-gax", "IamProtos.google.protobuf.FieldDescriptorProto.Label")
  @js.native
  object Label extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Label & Double
      ] = js.native
    
    /* 1 */ val LABEL_OPTIONAL: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL & Double = js.native
    
    /* 3 */ val LABEL_REPEATED: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED & Double = js.native
    
    /* 2 */ val LABEL_REQUIRED: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED & Double = js.native
  }
  
  /** Type enum. */
  @JSImport("google-gax", "IamProtos.google.protobuf.FieldDescriptorProto.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type & Double
      ] = js.native
    
    /* 8 */ val TYPE_BOOL: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BOOL & Double = js.native
    
    /* 12 */ val TYPE_BYTES: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_BYTES & Double = js.native
    
    /* 1 */ val TYPE_DOUBLE: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_DOUBLE & Double = js.native
    
    /* 14 */ val TYPE_ENUM: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_ENUM & Double = js.native
    
    /* 7 */ val TYPE_FIXED32: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED32 & Double = js.native
    
    /* 6 */ val TYPE_FIXED64: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED64 & Double = js.native
    
    /* 2 */ val TYPE_FLOAT: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_FLOAT & Double = js.native
    
    /* 10 */ val TYPE_GROUP: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_GROUP & Double = js.native
    
    /* 5 */ val TYPE_INT32: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT32 & Double = js.native
    
    /* 3 */ val TYPE_INT64: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT64 & Double = js.native
    
    /* 11 */ val TYPE_MESSAGE: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_MESSAGE & Double = js.native
    
    /* 15 */ val TYPE_SFIXED32: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED32 & Double = js.native
    
    /* 16 */ val TYPE_SFIXED64: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED64 & Double = js.native
    
    /* 17 */ val TYPE_SINT32: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT32 & Double = js.native
    
    /* 18 */ val TYPE_SINT64: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT64 & Double = js.native
    
    /* 9 */ val TYPE_STRING: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_STRING & Double = js.native
    
    /* 13 */ val TYPE_UINT32: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT32 & Double = js.native
    
    /* 4 */ val TYPE_UINT64: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT64 & Double = js.native
  }
  
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  @scala.inline
  def create(properties: IFieldDescriptorProto): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IFieldDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IFieldDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto]
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.iamServiceMod.google.protobuf.FieldDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
