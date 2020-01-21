package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmText. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmText")
@js.native
/**
  * Constructs a new RbmText.
  * @param [properties] Properties to set
  */
class RbmText () extends IRbmText {
  def this(properties: IRbmText) = this()
  /** RbmText rbmSuggestion. */
  @JSName("rbmSuggestion")
  var rbmSuggestion_RbmText: js.Array[IRbmSuggestion] = js.native
  /** RbmText text. */
  @JSName("text")
  var text_RbmText: String = js.native
  /**
    * Converts this RbmText to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmText")
@js.native
object RbmText extends js.Object {
  /**
    * Creates a new RbmText instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmText instance
    */
  def create(): RbmText = js.native
  def create(properties: IRbmText): RbmText = js.native
  /**
    * Decodes a RbmText message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmText
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmText = js.native
  def decode(reader: Reader, length: Double): RbmText = js.native
  def decode(reader: Uint8Array): RbmText = js.native
  def decode(reader: Uint8Array, length: Double): RbmText = js.native
  /**
    * Decodes a RbmText message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmText
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmText = js.native
  def decodeDelimited(reader: Uint8Array): RbmText = js.native
  /**
    * Encodes the specified RbmText message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmText.verify|verify} messages.
    * @param message RbmText message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmText): Writer = js.native
  def encode(message: IRbmText, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmText message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmText.verify|verify} messages.
    * @param message RbmText message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmText): Writer = js.native
  def encodeDelimited(message: IRbmText, writer: Writer): Writer = js.native
  /**
    * Creates a RbmText message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmText
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmText = js.native
  /**
    * Creates a plain object from a RbmText message. Also converts values to other types if specified.
    * @param message RbmText
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmText): StringDictionary[js.Any] = js.native
  def toObject(message: RbmText, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmText message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

