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

/** Represents an AudioConfig. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig")
@js.native
/**
  * Constructs a new AudioConfig.
  * @param [properties] Properties to set
  */
class AudioConfig () extends IAudioConfig {
  def this(properties: IAudioConfig) = this()
  
  /** AudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_AudioConfig: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.AudioEncoding * / any */ String) = js.native
  
  /** AudioConfig effectsProfileId. */
  @JSName("effectsProfileId")
  var effectsProfileId_AudioConfig: js.Array[String] = js.native
  
  /** AudioConfig pitch. */
  @JSName("pitch")
  var pitch_AudioConfig: Double = js.native
  
  /** AudioConfig sampleRateHertz. */
  @JSName("sampleRateHertz")
  var sampleRateHertz_AudioConfig: Double = js.native
  
  /** AudioConfig speakingRate. */
  @JSName("speakingRate")
  var speakingRate_AudioConfig: Double = js.native
  
  /**
    * Converts this AudioConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** AudioConfig volumeGainDb. */
  @JSName("volumeGainDb")
  var volumeGainDb_AudioConfig: Double = js.native
}
object AudioConfig {
  
  /**
    * Creates a new AudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AudioConfig instance
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.create")
  @js.native
  def create(): AudioConfig = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.create")
  @js.native
  def create(properties: IAudioConfig): AudioConfig = js.native
  
  /**
    * Decodes an AudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decode")
  @js.native
  def decode(reader: Reader): AudioConfig = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): AudioConfig = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array): AudioConfig = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): AudioConfig = js.native
  
  /**
    * Decodes an AudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): AudioConfig = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): AudioConfig = js.native
  
  /**
    * Encodes the specified AudioConfig message. Does not implicitly {@link google.cloud.texttospeech.v1.AudioConfig.verify|verify} messages.
    * @param message AudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.encode")
  @js.native
  def encode(message: IAudioConfig): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.encode")
  @js.native
  def encode(message: IAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified AudioConfig message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.AudioConfig.verify|verify} messages.
    * @param message AudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAudioConfig): Writer = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAudioConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates an AudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AudioConfig
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): AudioConfig = js.native
  
  /**
    * Creates a plain object from an AudioConfig message. Also converts values to other types if specified.
    * @param message AudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.toObject")
  @js.native
  def toObject(message: AudioConfig): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.toObject")
  @js.native
  def toObject(message: AudioConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an AudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.AudioConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
