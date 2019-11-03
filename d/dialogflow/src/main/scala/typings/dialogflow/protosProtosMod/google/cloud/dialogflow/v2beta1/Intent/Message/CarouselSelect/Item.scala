package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Item. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item")
@js.native
/**
  * Constructs a new Item.
  * @param [properties] Properties to set
  */
class Item () extends IItem {
  def this(properties: IItem) = this()
  /** Item description. */
  @JSName("description")
  var description_Item: String = js.native
  /** Item title. */
  @JSName("title")
  var title_Item: String = js.native
  /**
    * Converts this Item to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item")
@js.native
object Item extends js.Object {
  /**
    * Creates a new Item instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Item instance
    */
  def create(): Item = js.native
  def create(properties: IItem): Item = js.native
  /**
    * Decodes an Item message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Item
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Item = js.native
  def decode(reader: Reader, length: Double): Item = js.native
  def decode(reader: Uint8Array): Item = js.native
  def decode(reader: Uint8Array, length: Double): Item = js.native
  /**
    * Decodes an Item message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Item
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Item = js.native
  def decodeDelimited(reader: Uint8Array): Item = js.native
  /**
    * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item.verify|verify} messages.
    * @param message Item message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IItem): Writer = js.native
  def encode(message: IItem, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item.verify|verify} messages.
    * @param message Item message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IItem): Writer = js.native
  def encodeDelimited(message: IItem, writer: Writer): Writer = js.native
  /**
    * Creates an Item message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Item
    */
  def fromObject(`object`: StringDictionary[js.Any]): Item = js.native
  /**
    * Creates a plain object from an Item message. Also converts values to other types if specified.
    * @param message Item
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Item): StringDictionary[js.Any] = js.native
  def toObject(message: Item, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Item message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

