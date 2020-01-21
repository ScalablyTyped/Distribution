package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TableCardCell. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell")
@js.native
/**
  * Constructs a new TableCardCell.
  * @param [properties] Properties to set
  */
class TableCardCell () extends ITableCardCell {
  def this(properties: ITableCardCell) = this()
  /** TableCardCell text. */
  @JSName("text")
  var text_TableCardCell: String = js.native
  /**
    * Converts this TableCardCell to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell")
@js.native
object TableCardCell extends js.Object {
  /**
    * Creates a new TableCardCell instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TableCardCell instance
    */
  def create(): TableCardCell = js.native
  def create(properties: ITableCardCell): TableCardCell = js.native
  /**
    * Decodes a TableCardCell message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TableCardCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TableCardCell = js.native
  def decode(reader: Reader, length: Double): TableCardCell = js.native
  def decode(reader: Uint8Array): TableCardCell = js.native
  def decode(reader: Uint8Array, length: Double): TableCardCell = js.native
  /**
    * Decodes a TableCardCell message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TableCardCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TableCardCell = js.native
  def decodeDelimited(reader: Uint8Array): TableCardCell = js.native
  /**
    * Encodes the specified TableCardCell message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell.verify|verify} messages.
    * @param message TableCardCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITableCardCell): Writer = js.native
  def encode(message: ITableCardCell, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TableCardCell message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell.verify|verify} messages.
    * @param message TableCardCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITableCardCell): Writer = js.native
  def encodeDelimited(message: ITableCardCell, writer: Writer): Writer = js.native
  /**
    * Creates a TableCardCell message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TableCardCell
    */
  def fromObject(`object`: StringDictionary[js.Any]): TableCardCell = js.native
  /**
    * Creates a plain object from a TableCardCell message. Also converts values to other types if specified.
    * @param message TableCardCell
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TableCardCell): StringDictionary[js.Any] = js.native
  def toObject(message: TableCardCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TableCardCell message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

