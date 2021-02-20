package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.ssml
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.text
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesisInput. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput")
@js.native
/**
  * Constructs a new SynthesisInput.
  * @param [properties] Properties to set
  */
class SynthesisInput () extends ISynthesisInput {
  def this(properties: ISynthesisInput) = this()
  
  /** SynthesisInput inputSource. */
  var inputSource: js.UndefOr[text | ssml] = js.native
  
  /** SynthesisInput ssml. */
  @JSName("ssml")
  var ssml_SynthesisInput: String = js.native
  
  /** SynthesisInput text. */
  @JSName("text")
  var text_SynthesisInput: String = js.native
  
  /**
    * Converts this SynthesisInput to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SynthesisInput {
  
  /**
    * Creates a new SynthesisInput instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesisInput instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.create")
  @js.native
  def create(): SynthesisInput = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.create")
  @js.native
  def create(properties: ISynthesisInput): SynthesisInput = js.native
  
  /**
    * Decodes a SynthesisInput message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesisInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decode")
  @js.native
  def decode(reader: Reader): SynthesisInput = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decode")
  @js.native
  def decode(reader: Reader, length: Double): SynthesisInput = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decode")
  @js.native
  def decode(reader: Uint8Array): SynthesisInput = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SynthesisInput = js.native
  
  /**
    * Decodes a SynthesisInput message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesisInput
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SynthesisInput = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SynthesisInput = js.native
  
  /**
    * Encodes the specified SynthesisInput message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
    * @param message SynthesisInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.encode")
  @js.native
  def encode(message: ISynthesisInput): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.encode")
  @js.native
  def encode(message: ISynthesisInput, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SynthesisInput message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.SynthesisInput.verify|verify} messages.
    * @param message SynthesisInput message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesisInput): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISynthesisInput, writer: Writer): Writer = js.native
  
  /**
    * Creates a SynthesisInput message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesisInput
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SynthesisInput = js.native
  
  /**
    * Creates a plain object from a SynthesisInput message. Also converts values to other types if specified.
    * @param message SynthesisInput
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.toObject")
  @js.native
  def toObject(message: SynthesisInput): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.toObject")
  @js.native
  def toObject(message: SynthesisInput, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SynthesisInput message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.SynthesisInput.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
