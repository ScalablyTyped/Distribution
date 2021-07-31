package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
@js.native
/**
  * Constructs a new SynthesizeSpeechResponse.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechResponse ()
  extends StObject
     with ISynthesizeSpeechResponse {
  def this(properties: ISynthesizeSpeechResponse) = this()
  
  /** SynthesizeSpeechResponse audioContent. */
  @JSName("audioContent")
  var audioContent_SynthesizeSpeechResponse: Uint8Array | String = js.native
  
  /**
    * Converts this SynthesizeSpeechResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SynthesizeSpeechResponse {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeSpeechResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechResponse instance
    */
  /* static member */
  @scala.inline
  def create(): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeSpeechResponse]
  @scala.inline
  def create(properties: ISynthesizeSpeechResponse): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechResponse]
  @scala.inline
  def decode(reader: Uint8Array): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechResponse
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: SynthesizeSpeechResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: SynthesizeSpeechResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a SynthesizeSpeechResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
