package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TelephonyPlayAudio. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio")
@js.native
/**
  * Constructs a new TelephonyPlayAudio.
  * @param [properties] Properties to set
  */
class TelephonyPlayAudio () extends ITelephonyPlayAudio {
  def this(properties: ITelephonyPlayAudio) = this()
  /** TelephonyPlayAudio audioUri. */
  @JSName("audioUri")
  var audioUri_TelephonyPlayAudio: String = js.native
  /**
    * Converts this TelephonyPlayAudio to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio")
@js.native
object TelephonyPlayAudio extends js.Object {
  /**
    * Creates a new TelephonyPlayAudio instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TelephonyPlayAudio instance
    */
  def create(): TelephonyPlayAudio = js.native
  def create(properties: ITelephonyPlayAudio): TelephonyPlayAudio = js.native
  /**
    * Decodes a TelephonyPlayAudio message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TelephonyPlayAudio
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TelephonyPlayAudio = js.native
  def decode(reader: Reader, length: Double): TelephonyPlayAudio = js.native
  def decode(reader: Uint8Array): TelephonyPlayAudio = js.native
  def decode(reader: Uint8Array, length: Double): TelephonyPlayAudio = js.native
  /**
    * Decodes a TelephonyPlayAudio message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TelephonyPlayAudio
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TelephonyPlayAudio = js.native
  def decodeDelimited(reader: Uint8Array): TelephonyPlayAudio = js.native
  /**
    * Encodes the specified TelephonyPlayAudio message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio.verify|verify} messages.
    * @param message TelephonyPlayAudio message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITelephonyPlayAudio): Writer = js.native
  def encode(message: ITelephonyPlayAudio, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TelephonyPlayAudio message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio.verify|verify} messages.
    * @param message TelephonyPlayAudio message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITelephonyPlayAudio): Writer = js.native
  def encodeDelimited(message: ITelephonyPlayAudio, writer: Writer): Writer = js.native
  /**
    * Creates a TelephonyPlayAudio message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TelephonyPlayAudio
    */
  def fromObject(`object`: StringDictionary[js.Any]): TelephonyPlayAudio = js.native
  /**
    * Creates a plain object from a TelephonyPlayAudio message. Also converts values to other types if specified.
    * @param message TelephonyPlayAudio
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TelephonyPlayAudio): StringDictionary[js.Any] = js.native
  def toObject(message: TelephonyPlayAudio, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TelephonyPlayAudio message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

