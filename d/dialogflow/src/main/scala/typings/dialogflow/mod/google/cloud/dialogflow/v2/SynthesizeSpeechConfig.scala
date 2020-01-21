package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SynthesizeSpeechConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SynthesizeSpeechConfig")
@js.native
/**
  * Constructs a new SynthesizeSpeechConfig.
  * @param [properties] Properties to set
  */
class SynthesizeSpeechConfig () extends ISynthesizeSpeechConfig {
  def this(properties: ISynthesizeSpeechConfig) = this()
  /** SynthesizeSpeechConfig effectsProfileId. */
  @JSName("effectsProfileId")
  var effectsProfileId_SynthesizeSpeechConfig: js.Array[String] = js.native
  /** SynthesizeSpeechConfig pitch. */
  @JSName("pitch")
  var pitch_SynthesizeSpeechConfig: Double = js.native
  /** SynthesizeSpeechConfig speakingRate. */
  @JSName("speakingRate")
  var speakingRate_SynthesizeSpeechConfig: Double = js.native
  /** SynthesizeSpeechConfig volumeGainDb. */
  @JSName("volumeGainDb")
  var volumeGainDb_SynthesizeSpeechConfig: Double = js.native
  /**
    * Converts this SynthesizeSpeechConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SynthesizeSpeechConfig")
@js.native
object SynthesizeSpeechConfig extends js.Object {
  /**
    * Creates a new SynthesizeSpeechConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechConfig instance
    */
  def create(): SynthesizeSpeechConfig = js.native
  def create(properties: ISynthesizeSpeechConfig): SynthesizeSpeechConfig = js.native
  /**
    * Decodes a SynthesizeSpeechConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SynthesizeSpeechConfig = js.native
  def decode(reader: Reader, length: Double): SynthesizeSpeechConfig = js.native
  def decode(reader: Uint8Array): SynthesizeSpeechConfig = js.native
  def decode(reader: Uint8Array, length: Double): SynthesizeSpeechConfig = js.native
  /**
    * Decodes a SynthesizeSpeechConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SynthesizeSpeechConfig = js.native
  def decodeDelimited(reader: Uint8Array): SynthesizeSpeechConfig = js.native
  /**
    * Encodes the specified SynthesizeSpeechConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.SynthesizeSpeechConfig.verify|verify} messages.
    * @param message SynthesizeSpeechConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISynthesizeSpeechConfig): Writer = js.native
  def encode(message: ISynthesizeSpeechConfig, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SynthesizeSpeechConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.SynthesizeSpeechConfig.verify|verify} messages.
    * @param message SynthesizeSpeechConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISynthesizeSpeechConfig): Writer = js.native
  def encodeDelimited(message: ISynthesizeSpeechConfig, writer: Writer): Writer = js.native
  /**
    * Creates a SynthesizeSpeechConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechConfig
    */
  def fromObject(`object`: StringDictionary[js.Any]): SynthesizeSpeechConfig = js.native
  /**
    * Creates a plain object from a SynthesizeSpeechConfig message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SynthesizeSpeechConfig): StringDictionary[js.Any] = js.native
  def toObject(message: SynthesizeSpeechConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SynthesizeSpeechConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

