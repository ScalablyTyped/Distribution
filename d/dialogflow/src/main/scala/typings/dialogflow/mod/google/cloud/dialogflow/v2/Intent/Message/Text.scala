package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Text. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text")
@js.native
/**
  * Constructs a new Text.
  * @param [properties] Properties to set
  */
class Text () extends IText {
  def this(properties: IText) = this()
  /** Text text. */
  @JSName("text")
  var text_Text: js.Array[String] = js.native
  /**
    * Converts this Text to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text")
@js.native
object Text extends js.Object {
  /**
    * Creates a new Text instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Text instance
    */
  def create(): Text = js.native
  def create(properties: IText): Text = js.native
  /**
    * Decodes a Text message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Text
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Text = js.native
  def decode(reader: Reader, length: Double): Text = js.native
  def decode(reader: Uint8Array): Text = js.native
  def decode(reader: Uint8Array, length: Double): Text = js.native
  /**
    * Decodes a Text message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Text
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Text = js.native
  def decodeDelimited(reader: Uint8Array): Text = js.native
  /**
    * Encodes the specified Text message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
    * @param message Text message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IText): Writer = js.native
  def encode(message: IText, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Text message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
    * @param message Text message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IText): Writer = js.native
  def encodeDelimited(message: IText, writer: Writer): Writer = js.native
  /**
    * Creates a Text message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Text
    */
  def fromObject(`object`: StringDictionary[js.Any]): Text = js.native
  /**
    * Creates a plain object from a Text message. Also converts values to other types if specified.
    * @param message Text
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Text): StringDictionary[js.Any] = js.native
  def toObject(message: Text, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Text message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

