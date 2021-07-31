package typings.googleCloudTextToSpeech.srcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.protobuf.IOneofDescriptorProto
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.OneofDescriptorProto")
@js.native
/**
  * Constructs a new OneofDescriptorProto.
  * @param [properties] Properties to set
  */
class OneofDescriptorProto ()
  extends typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto {
  def this(properties: IOneofDescriptorProto) = this()
}
object OneofDescriptorProto {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.OneofDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OneofDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofDescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  @scala.inline
  def create(properties: IOneofDescriptorProto): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  
  /**
    * Decodes an OneofDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  
  /**
    * Encodes the specified OneofDescriptorProto message. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IOneofDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IOneofDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OneofDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
    * @param message OneofDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IOneofDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IOneofDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofDescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto]
  
  /**
    * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
    * @param message OneofDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleCloudTextToSpeech.mod.google.protobuf.OneofDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an OneofDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
