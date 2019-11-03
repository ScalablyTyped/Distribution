package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Button instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Button instance
    */
  def create(): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  def create(properties: IButton): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  /**
    * Decodes a Button message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Button
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  def decode(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  /**
    * Decodes a Button message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Button
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  /**
    * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.verify|verify} messages.
    * @param message Button message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IButton): Writer = js.native
  def encode(message: IButton, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.verify|verify} messages.
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
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button = js.native
  /**
    * Creates a plain object from a Button message. Also converts values to other types if specified.
    * @param message Button
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Button message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

