package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmSuggestedAction
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new RbmSuggestedAction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmSuggestedAction instance
    */
  def create(): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  def create(properties: IRbmSuggestedAction): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  /**
    * Decodes a RbmSuggestedAction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmSuggestedAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  def decode(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  /**
    * Decodes a RbmSuggestedAction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmSuggestedAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  /**
    * Encodes the specified RbmSuggestedAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.verify|verify} messages.
    * @param message RbmSuggestedAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmSuggestedAction): Writer = js.native
  def encode(message: IRbmSuggestedAction, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmSuggestedAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.verify|verify} messages.
    * @param message RbmSuggestedAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmSuggestedAction): Writer = js.native
  def encodeDelimited(message: IRbmSuggestedAction, writer: Writer): Writer = js.native
  /**
    * Creates a RbmSuggestedAction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmSuggestedAction
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction = js.native
  /**
    * Creates a plain object from a RbmSuggestedAction message. Also converts values to other types if specified.
    * @param message RbmSuggestedAction
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmSuggestedAction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

