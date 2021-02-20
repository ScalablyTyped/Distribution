package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IFieldDescriptorProto
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto")
@js.native
/**
  * Constructs a new FieldDescriptorProto.
  * @param [properties] Properties to set
  */
class FieldDescriptorProto ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto {
  def this(properties: IFieldDescriptorProto) = this()
}
object FieldDescriptorProto {
  
  /** Label enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.Label")
  @js.native
  object Label extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Label with Double
      ] = js.native
    
    /* 1 */ val LABEL_OPTIONAL: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL with Double = js.native
    
    /* 3 */ val LABEL_REPEATED: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED with Double = js.native
    
    /* 2 */ val LABEL_REQUIRED: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED with Double = js.native
  }
  
  /** Type enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type with Double
      ] = js.native
    
    /* 8 */ val TYPE_BOOL: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_BOOL with Double = js.native
    
    /* 12 */ val TYPE_BYTES: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_BYTES with Double = js.native
    
    /* 1 */ val TYPE_DOUBLE: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_DOUBLE with Double = js.native
    
    /* 14 */ val TYPE_ENUM: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_ENUM with Double = js.native
    
    /* 7 */ val TYPE_FIXED32: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED32 with Double = js.native
    
    /* 6 */ val TYPE_FIXED64: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_FIXED64 with Double = js.native
    
    /* 2 */ val TYPE_FLOAT: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_FLOAT with Double = js.native
    
    /* 10 */ val TYPE_GROUP: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_GROUP with Double = js.native
    
    /* 5 */ val TYPE_INT32: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT32 with Double = js.native
    
    /* 3 */ val TYPE_INT64: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_INT64 with Double = js.native
    
    /* 11 */ val TYPE_MESSAGE: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_MESSAGE with Double = js.native
    
    /* 15 */ val TYPE_SFIXED32: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED32 with Double = js.native
    
    /* 16 */ val TYPE_SFIXED64: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_SFIXED64 with Double = js.native
    
    /* 17 */ val TYPE_SINT32: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT32 with Double = js.native
    
    /* 18 */ val TYPE_SINT64: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_SINT64 with Double = js.native
    
    /* 9 */ val TYPE_STRING: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_STRING with Double = js.native
    
    /* 13 */ val TYPE_UINT32: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT32 with Double = js.native
    
    /* 4 */ val TYPE_UINT64: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type.TYPE_UINT64 with Double = js.native
  }
  
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.create")
  @js.native
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.create")
  @js.native
  def create(properties: IFieldDescriptorProto): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.encode")
  @js.native
  def encode(message: IFieldDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.encode")
  @js.native
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto = js.native
  
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.toObject")
  @js.native
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
