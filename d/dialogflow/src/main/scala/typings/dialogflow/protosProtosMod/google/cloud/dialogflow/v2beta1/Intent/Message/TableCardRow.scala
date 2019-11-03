package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a TableCardRow. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow")
@js.native
/**
  * Constructs a new TableCardRow.
  * @param [properties] Properties to set
  */
class TableCardRow () extends ITableCardRow {
  def this(properties: ITableCardRow) = this()
  /** TableCardRow cells. */
  @JSName("cells")
  var cells_TableCardRow: js.Array[ITableCardCell] = js.native
  /** TableCardRow dividerAfter. */
  @JSName("dividerAfter")
  var dividerAfter_TableCardRow: Boolean = js.native
  /**
    * Converts this TableCardRow to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow")
@js.native
object TableCardRow extends js.Object {
  /**
    * Creates a new TableCardRow instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TableCardRow instance
    */
  def create(): TableCardRow = js.native
  def create(properties: ITableCardRow): TableCardRow = js.native
  /**
    * Decodes a TableCardRow message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TableCardRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TableCardRow = js.native
  def decode(reader: Reader, length: Double): TableCardRow = js.native
  def decode(reader: Uint8Array): TableCardRow = js.native
  def decode(reader: Uint8Array, length: Double): TableCardRow = js.native
  /**
    * Decodes a TableCardRow message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TableCardRow
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TableCardRow = js.native
  def decodeDelimited(reader: Uint8Array): TableCardRow = js.native
  /**
    * Encodes the specified TableCardRow message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow.verify|verify} messages.
    * @param message TableCardRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITableCardRow): Writer = js.native
  def encode(message: ITableCardRow, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TableCardRow message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow.verify|verify} messages.
    * @param message TableCardRow message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITableCardRow): Writer = js.native
  def encodeDelimited(message: ITableCardRow, writer: Writer): Writer = js.native
  /**
    * Creates a TableCardRow message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TableCardRow
    */
  def fromObject(`object`: StringDictionary[js.Any]): TableCardRow = js.native
  /**
    * Creates a plain object from a TableCardRow message. Also converts values to other types if specified.
    * @param message TableCardRow
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TableCardRow): StringDictionary[js.Any] = js.native
  def toObject(message: TableCardRow, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TableCardRow message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

