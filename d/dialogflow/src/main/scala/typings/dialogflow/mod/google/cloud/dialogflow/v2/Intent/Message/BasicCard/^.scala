package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new BasicCard instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BasicCard instance
    */
  def create(): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  def create(properties: IBasicCard): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  /**
    * Decodes a BasicCard message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BasicCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  def decode(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  /**
    * Decodes a BasicCard message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BasicCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  /**
    * Encodes the specified BasicCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
    * @param message BasicCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBasicCard): Writer = js.native
  def encode(message: IBasicCard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BasicCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
    * @param message BasicCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBasicCard): Writer = js.native
  def encodeDelimited(message: IBasicCard, writer: Writer): Writer = js.native
  /**
    * Creates a BasicCard message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BasicCard
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard = js.native
  /**
    * Creates a plain object from a BasicCard message. Also converts values to other types if specified.
    * @param message BasicCard
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BasicCard message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

