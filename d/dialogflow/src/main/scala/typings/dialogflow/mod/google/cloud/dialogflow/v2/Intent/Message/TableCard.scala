package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.IButton
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TableCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard")
@js.native
/**
  * Constructs a new TableCard.
  * @param [properties] Properties to set
  */
class TableCard () extends ITableCard {
  def this(properties: ITableCard) = this()
  /** TableCard buttons. */
  @JSName("buttons")
  var buttons_TableCard: js.Array[IButton] = js.native
  /** TableCard columnProperties. */
  @JSName("columnProperties")
  var columnProperties_TableCard: js.Array[IColumnProperties] = js.native
  /** TableCard rows. */
  @JSName("rows")
  var rows_TableCard: js.Array[ITableCardRow] = js.native
  /** TableCard subtitle. */
  @JSName("subtitle")
  var subtitle_TableCard: String = js.native
  /** TableCard title. */
  @JSName("title")
  var title_TableCard: String = js.native
  /**
    * Converts this TableCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard")
@js.native
object TableCard extends js.Object {
  /**
    * Creates a new TableCard instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TableCard instance
    */
  def create(): TableCard = js.native
  def create(properties: ITableCard): TableCard = js.native
  /**
    * Decodes a TableCard message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TableCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TableCard = js.native
  def decode(reader: Reader, length: Double): TableCard = js.native
  def decode(reader: Uint8Array): TableCard = js.native
  def decode(reader: Uint8Array, length: Double): TableCard = js.native
  /**
    * Decodes a TableCard message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TableCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TableCard = js.native
  def decodeDelimited(reader: Uint8Array): TableCard = js.native
  /**
    * Encodes the specified TableCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
    * @param message TableCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITableCard): Writer = js.native
  def encode(message: ITableCard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TableCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
    * @param message TableCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITableCard): Writer = js.native
  def encodeDelimited(message: ITableCard, writer: Writer): Writer = js.native
  /**
    * Creates a TableCard message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TableCard
    */
  def fromObject(`object`: StringDictionary[js.Any]): TableCard = js.native
  /**
    * Creates a plain object from a TableCard message. Also converts values to other types if specified.
    * @param message TableCard
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TableCard): StringDictionary[js.Any] = js.native
  def toObject(message: TableCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TableCard message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

