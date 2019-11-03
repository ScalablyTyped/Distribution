package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.ICarouselSelect
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new CarouselSelect instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CarouselSelect instance
    */
  def create(): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  def create(properties: ICarouselSelect): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  /**
    * Decodes a CarouselSelect message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CarouselSelect
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  def decode(reader: Reader, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  def decode(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  def decode(reader: Uint8Array, length: Double): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  /**
    * Decodes a CarouselSelect message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CarouselSelect
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  def decodeDelimited(reader: Uint8Array): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  /**
    * Encodes the specified CarouselSelect message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.verify|verify} messages.
    * @param message CarouselSelect message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICarouselSelect): Writer = js.native
  def encode(message: ICarouselSelect, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CarouselSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.verify|verify} messages.
    * @param message CarouselSelect message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICarouselSelect): Writer = js.native
  def encodeDelimited(message: ICarouselSelect, writer: Writer): Writer = js.native
  /**
    * Creates a CarouselSelect message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CarouselSelect
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect = js.native
  /**
    * Creates a plain object from a CarouselSelect message. Also converts values to other types if specified.
    * @param message CarouselSelect
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CarouselSelect message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

