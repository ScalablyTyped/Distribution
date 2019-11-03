package typings.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListOperationsResponse. */
@JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsResponse")
@js.native
/**
  * Constructs a new ListOperationsResponse.
  * @param [properties] Properties to set
  */
class ListOperationsResponse () extends IListOperationsResponse {
  def this(properties: IListOperationsResponse) = this()
  /** ListOperationsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListOperationsResponse: String = js.native
  /** ListOperationsResponse operations. */
  @JSName("operations")
  var operations_ListOperationsResponse: js.Array[IOperation] = js.native
  /**
    * Converts this ListOperationsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsResponse")
@js.native
object ListOperationsResponse extends js.Object {
  /**
    * Creates a new ListOperationsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsResponse instance
    */
  def create(): ListOperationsResponse = js.native
  def create(properties: IListOperationsResponse): ListOperationsResponse = js.native
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListOperationsResponse = js.native
  def decode(reader: Reader, length: Double): ListOperationsResponse = js.native
  def decode(reader: Uint8Array): ListOperationsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListOperationsResponse = js.native
  /**
    * Decodes a ListOperationsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListOperationsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListOperationsResponse = js.native
  /**
    * Encodes the specified ListOperationsResponse message. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListOperationsResponse): Writer = js.native
  def encode(message: IListOperationsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListOperationsResponse message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsResponse.verify|verify} messages.
    * @param message ListOperationsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListOperationsResponse): Writer = js.native
  def encodeDelimited(message: IListOperationsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListOperationsResponse = js.native
  /**
    * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
    * @param message ListOperationsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListOperationsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListOperationsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListOperationsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

