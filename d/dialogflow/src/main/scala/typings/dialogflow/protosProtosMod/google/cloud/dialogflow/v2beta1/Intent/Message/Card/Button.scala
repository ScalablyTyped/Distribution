package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Card

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Button. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button")
@js.native
/**
  * Constructs a new Button.
  * @param [properties] Properties to set
  */
class Button () extends IButton {
  def this(properties: IButton) = this()
  /** Button postback. */
  @JSName("postback")
  var postback_Button: String = js.native
  /** Button text. */
  @JSName("text")
  var text_Button: String = js.native
  /**
    * Converts this Button to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button")
@js.native
object Button extends js.Object {
  /**
    * Creates a new Button instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Button instance
    */
  def create(): Button = js.native
  def create(properties: IButton): Button = js.native
  /**
    * Decodes a Button message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Button
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Button = js.native
  def decode(reader: Reader, length: Double): Button = js.native
  def decode(reader: Uint8Array): Button = js.native
  def decode(reader: Uint8Array, length: Double): Button = js.native
  /**
    * Decodes a Button message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Button
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Button = js.native
  def decodeDelimited(reader: Uint8Array): Button = js.native
  /**
    * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button.verify|verify} messages.
    * @param message Button message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IButton): Writer = js.native
  def encode(message: IButton, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button.verify|verify} messages.
    * @param message Button message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IButton): Writer = js.native
  def encodeDelimited(message: IButton, writer: Writer): Writer = js.native
  /**
    * Creates a Button message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Button
    */
  def fromObject(`object`: StringDictionary[js.Any]): Button = js.native
  /**
    * Creates a plain object from a Button message. Also converts values to other types if specified.
    * @param message Button
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Button): StringDictionary[js.Any] = js.native
  def toObject(message: Button, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Button message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

