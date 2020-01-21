package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OpenUriAction. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction")
@js.native
/**
  * Constructs a new OpenUriAction.
  * @param [properties] Properties to set
  */
class OpenUriAction () extends IOpenUriAction {
  def this(properties: IOpenUriAction) = this()
  /** OpenUriAction uri. */
  @JSName("uri")
  var uri_OpenUriAction: String = js.native
  /**
    * Converts this OpenUriAction to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction")
@js.native
object OpenUriAction extends js.Object {
  /**
    * Creates a new OpenUriAction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OpenUriAction instance
    */
  def create(): OpenUriAction = js.native
  def create(properties: IOpenUriAction): OpenUriAction = js.native
  /**
    * Decodes an OpenUriAction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OpenUriAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): OpenUriAction = js.native
  def decode(reader: Reader, length: Double): OpenUriAction = js.native
  def decode(reader: Uint8Array): OpenUriAction = js.native
  def decode(reader: Uint8Array, length: Double): OpenUriAction = js.native
  /**
    * Decodes an OpenUriAction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OpenUriAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): OpenUriAction = js.native
  def decodeDelimited(reader: Uint8Array): OpenUriAction = js.native
  /**
    * Encodes the specified OpenUriAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
    * @param message OpenUriAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOpenUriAction): Writer = js.native
  def encode(message: IOpenUriAction, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OpenUriAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
    * @param message OpenUriAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOpenUriAction): Writer = js.native
  def encodeDelimited(message: IOpenUriAction, writer: Writer): Writer = js.native
  /**
    * Creates an OpenUriAction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OpenUriAction
    */
  def fromObject(`object`: StringDictionary[js.Any]): OpenUriAction = js.native
  /**
    * Creates a plain object from an OpenUriAction message. Also converts values to other types if specified.
    * @param message OpenUriAction
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: OpenUriAction): StringDictionary[js.Any] = js.native
  def toObject(message: OpenUriAction, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OpenUriAction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

