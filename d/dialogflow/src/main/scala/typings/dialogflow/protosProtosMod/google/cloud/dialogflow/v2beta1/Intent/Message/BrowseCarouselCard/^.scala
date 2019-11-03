package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.IBrowseCarouselCard
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new BrowseCarouselCard instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BrowseCarouselCard instance
    */
  def create(): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  def create(properties: IBrowseCarouselCard): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  /**
    * Decodes a BrowseCarouselCard message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BrowseCarouselCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  def decode(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  /**
    * Decodes a BrowseCarouselCard message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BrowseCarouselCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  /**
    * Encodes the specified BrowseCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.verify|verify} messages.
    * @param message BrowseCarouselCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IBrowseCarouselCard): Writer = js.native
  def encode(message: IBrowseCarouselCard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified BrowseCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.verify|verify} messages.
    * @param message BrowseCarouselCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IBrowseCarouselCard): Writer = js.native
  def encodeDelimited(message: IBrowseCarouselCard, writer: Writer): Writer = js.native
  /**
    * Creates a BrowseCarouselCard message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BrowseCarouselCard
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard = js.native
  /**
    * Creates a plain object from a BrowseCarouselCard message. Also converts values to other types if specified.
    * @param message BrowseCarouselCard
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a BrowseCarouselCard message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

