package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typings.googleCloudTextToSpeech.mod.google.protobuf.IEnumDescriptorProto
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
}
object EnumDescriptorProto {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an EnumReservedRange. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto.EnumReservedRange")
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  class EnumReservedRange ()
    extends typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange {
    def this(properties: IEnumReservedRange) = this()
  }
  object EnumReservedRange {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto.EnumReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    @scala.inline
    def create(properties: IEnumReservedRange): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto.EnumReservedRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  @scala.inline
  def create(properties: IEnumDescriptorProto): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.EnumDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
