package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
@js.native
/**
  * Constructs a new SynthesizeSpeechResponse.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechResponse () extends ISynthesizeSpeechResponse {
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
  
  /**
    * Creates a new SynthesizeSpeechResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.create")
  @js.native
  def create(): SynthesizeSpeechResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.create")
  @js.native
  def create(properties: ISynthesizeSpeechResponse): SynthesizeSpeechResponse = js.native
  
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
  @js.native
  def decode(reader: Reader): SynthesizeSpeechResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): SynthesizeSpeechResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
  @js.native
  def decode(reader: Uint8Array): SynthesizeSpeechResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechResponse = js.native
  
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SynthesizeSpeechResponse = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechResponse = js.native
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encode")
  @js.native
  def encode(message: ISynthesizeSpeechResponse): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encode")
  @js.native
  def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechResponse
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechResponse = js.native
  
  /**
    * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.toObject")
  @js.native
  def toObject(message: SynthesizeSpeechResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.toObject")
  @js.native
  def toObject(message: SynthesizeSpeechResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SynthesizeSpeechResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
