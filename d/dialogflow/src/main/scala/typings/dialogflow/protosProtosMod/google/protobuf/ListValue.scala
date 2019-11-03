package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListValue. */
@JSImport("dialogflow/protos/protos", "google.protobuf.ListValue")
@js.native
/**
  * Constructs a new ListValue.
  * @param [properties] Properties to set
  */
class ListValue () extends IListValue {
  def this(properties: IListValue) = this()
  /** ListValue values. */
  @JSName("values")
  var values_ListValue: js.Array[IValue] = js.native
  /**
    * Converts this ListValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.protobuf.ListValue")
@js.native
object ListValue extends js.Object {
  /**
    * Creates a new ListValue instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListValue instance
    */
  def create(): ListValue = js.native
  def create(properties: IListValue): ListValue = js.native
  /**
    * Decodes a ListValue message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListValue
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListValue = js.native
  def decode(reader: Reader, length: Double): ListValue = js.native
  def decode(reader: Uint8Array): ListValue = js.native
  def decode(reader: Uint8Array, length: Double): ListValue = js.native
  /**
    * Decodes a ListValue message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListValue
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListValue = js.native
  def decodeDelimited(reader: Uint8Array): ListValue = js.native
  /**
    * Encodes the specified ListValue message. Does not implicitly {@link google.protobuf.ListValue.verify|verify} messages.
    * @param message ListValue message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListValue): Writer = js.native
  def encode(message: IListValue, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListValue message, length delimited. Does not implicitly {@link google.protobuf.ListValue.verify|verify} messages.
    * @param message ListValue message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListValue): Writer = js.native
  def encodeDelimited(message: IListValue, writer: Writer): Writer = js.native
  /**
    * Creates a ListValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListValue
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListValue = js.native
  /**
    * Creates a plain object from a ListValue message. Also converts values to other types if specified.
    * @param message ListValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListValue): StringDictionary[js.Any] = js.native
  def toObject(message: ListValue, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListValue message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

