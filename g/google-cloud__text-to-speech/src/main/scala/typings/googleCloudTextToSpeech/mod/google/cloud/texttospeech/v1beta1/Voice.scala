package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Voice. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice")
@js.native
/**
  * Constructs a new Voice.
  * @param [properties] Properties to set
  */
class Voice () extends IVoice {
  def this(properties: IVoice) = this()
  
  /** Voice languageCodes. */
  @JSName("languageCodes")
  var languageCodes_Voice: js.Array[String] = js.native
  
  /** Voice name. */
  @JSName("name")
  var name_Voice: String = js.native
  
  /** Voice naturalSampleRateHertz. */
  @JSName("naturalSampleRateHertz")
  var naturalSampleRateHertz_Voice: Double = js.native
  
  /** Voice ssmlGender. */
  @JSName("ssmlGender")
  var ssmlGender_Voice: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.SsmlVoiceGender * / any */ String) = js.native
  
  /**
    * Converts this Voice to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Voice {
  
  /**
    * Creates a new Voice instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Voice instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.create")
  @js.native
  def create(): Voice = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.create")
  @js.native
  def create(properties: IVoice): Voice = js.native
  
  /**
    * Decodes a Voice message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Voice
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decode")
  @js.native
  def decode(reader: Reader): Voice = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decode")
  @js.native
  def decode(reader: Reader, length: Double): Voice = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decode")
  @js.native
  def decode(reader: Uint8Array): Voice = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Voice = js.native
  
  /**
    * Decodes a Voice message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Voice
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Voice = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Voice = js.native
  
  /**
    * Encodes the specified Voice message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
    * @param message Voice message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.encode")
  @js.native
  def encode(message: IVoice): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.encode")
  @js.native
  def encode(message: IVoice, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Voice message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.Voice.verify|verify} messages.
    * @param message Voice message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.encodeDelimited")
  @js.native
  def encodeDelimited(message: IVoice): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.encodeDelimited")
  @js.native
  def encodeDelimited(message: IVoice, writer: Writer): Writer = js.native
  
  /**
    * Creates a Voice message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Voice
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Voice = js.native
  
  /**
    * Creates a plain object from a Voice message. Also converts values to other types if specified.
    * @param message Voice
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.toObject")
  @js.native
  def toObject(message: Voice): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.toObject")
  @js.native
  def toObject(message: Voice, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Voice message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.Voice.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
