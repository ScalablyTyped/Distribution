package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an AudioConfig. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.AudioConfig")
@js.native
/**
  * Constructs a new AudioConfig.
  * @param [properties] Properties to set
  */
open class AudioConfig ()
  extends StObject
     with IAudioConfig {
  def this(properties: IAudioConfig) = this()
  
  /** AudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_AudioConfig: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1beta1.AudioEncoding * / any */ String) = js.native
  
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
  def toJSON(): StringDictionary[Any] = js.native
  
  /** AudioConfig volumeGainDb. */
  @JSName("volumeGainDb")
  var volumeGainDb_AudioConfig: Double = js.native
}
object AudioConfig {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.AudioConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new AudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns AudioConfig instance
    */
  /* static member */
  inline def create(): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AudioConfig]
  inline def create(properties: IAudioConfig): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AudioConfig]
  /**
    * Decodes an AudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns AudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  inline def decode(reader: Reader, length: Double): AudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AudioConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  /**
    * Decodes an AudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns AudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  
  /**
    * Encodes the specified AudioConfig message. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
    * @param message AudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified AudioConfig message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1beta1.AudioConfig.verify|verify} messages.
    * @param message AudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an AudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns AudioConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): AudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AudioConfig]
  
  /**
    * Gets the default type url for AudioConfig
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an AudioConfig message. Also converts values to other types if specified.
    * @param message AudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: AudioConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: AudioConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an AudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
