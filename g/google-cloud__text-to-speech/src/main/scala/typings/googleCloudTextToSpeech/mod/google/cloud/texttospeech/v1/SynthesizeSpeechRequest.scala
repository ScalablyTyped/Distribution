package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechRequest. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechRequest")
@js.native
/**
  * Constructs a new SynthesizeSpeechRequest.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechRequest ()
  extends StObject
     with ISynthesizeSpeechRequest {
  def this(properties: ISynthesizeSpeechRequest) = this()
  
  /**
    * Converts this SynthesizeSpeechRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SynthesizeSpeechRequest {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeSpeechRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechRequest instance
    */
  /* static member */
  @scala.inline
  def create(): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeSpeechRequest]
  @scala.inline
  def create(properties: ISynthesizeSpeechRequest): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  
  /**
    * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechRequest]
  @scala.inline
  def decode(reader: Uint8Array): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechRequest]
  
  /**
    * Decodes a SynthesizeSpeechRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  
  /**
    * Encodes the specified SynthesizeSpeechRequest message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechRequest.verify|verify} messages.
    * @param message SynthesizeSpeechRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeSpeechRequest message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechRequest.verify|verify} messages.
    * @param message SynthesizeSpeechRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeSpeechRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechRequest]
  
  /**
    * Creates a plain object from a SynthesizeSpeechRequest message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SynthesizeSpeechRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SynthesizeSpeechRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SynthesizeSpeechRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
