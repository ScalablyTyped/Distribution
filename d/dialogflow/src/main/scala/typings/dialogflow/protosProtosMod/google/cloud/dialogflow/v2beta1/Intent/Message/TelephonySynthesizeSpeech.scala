package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.ssml
import typings.dialogflow.dialogflowStrings.text
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TelephonySynthesizeSpeech. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech")
@js.native
/**
  * Constructs a new TelephonySynthesizeSpeech.
  * @param [properties] Properties to set
  */
class TelephonySynthesizeSpeech () extends ITelephonySynthesizeSpeech {
  def this(properties: ITelephonySynthesizeSpeech) = this()
  /** TelephonySynthesizeSpeech source. */
  var source: js.UndefOr[text | ssml] = js.native
  /** TelephonySynthesizeSpeech ssml. */
  @JSName("ssml")
  var ssml_TelephonySynthesizeSpeech: String = js.native
  /** TelephonySynthesizeSpeech text. */
  @JSName("text")
  var text_TelephonySynthesizeSpeech: String = js.native
  /**
    * Converts this TelephonySynthesizeSpeech to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech")
@js.native
object TelephonySynthesizeSpeech extends js.Object {
  /**
    * Creates a new TelephonySynthesizeSpeech instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TelephonySynthesizeSpeech instance
    */
  def create(): TelephonySynthesizeSpeech = js.native
  def create(properties: ITelephonySynthesizeSpeech): TelephonySynthesizeSpeech = js.native
  /**
    * Decodes a TelephonySynthesizeSpeech message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TelephonySynthesizeSpeech
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TelephonySynthesizeSpeech = js.native
  def decode(reader: Reader, length: Double): TelephonySynthesizeSpeech = js.native
  def decode(reader: Uint8Array): TelephonySynthesizeSpeech = js.native
  def decode(reader: Uint8Array, length: Double): TelephonySynthesizeSpeech = js.native
  /**
    * Decodes a TelephonySynthesizeSpeech message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TelephonySynthesizeSpeech
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TelephonySynthesizeSpeech = js.native
  def decodeDelimited(reader: Uint8Array): TelephonySynthesizeSpeech = js.native
  /**
    * Encodes the specified TelephonySynthesizeSpeech message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech.verify|verify} messages.
    * @param message TelephonySynthesizeSpeech message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITelephonySynthesizeSpeech): Writer = js.native
  def encode(message: ITelephonySynthesizeSpeech, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TelephonySynthesizeSpeech message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech.verify|verify} messages.
    * @param message TelephonySynthesizeSpeech message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITelephonySynthesizeSpeech): Writer = js.native
  def encodeDelimited(message: ITelephonySynthesizeSpeech, writer: Writer): Writer = js.native
  /**
    * Creates a TelephonySynthesizeSpeech message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TelephonySynthesizeSpeech
    */
  def fromObject(`object`: StringDictionary[js.Any]): TelephonySynthesizeSpeech = js.native
  /**
    * Creates a plain object from a TelephonySynthesizeSpeech message. Also converts values to other types if specified.
    * @param message TelephonySynthesizeSpeech
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TelephonySynthesizeSpeech): StringDictionary[js.Any] = js.native
  def toObject(message: TelephonySynthesizeSpeech, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TelephonySynthesizeSpeech message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

