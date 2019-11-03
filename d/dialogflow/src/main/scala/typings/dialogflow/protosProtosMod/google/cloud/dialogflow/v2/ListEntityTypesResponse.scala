package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListEntityTypesResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesResponse")
@js.native
/**
  * Constructs a new ListEntityTypesResponse.
  * @param [properties] Properties to set
  */
class ListEntityTypesResponse () extends IListEntityTypesResponse {
  def this(properties: IListEntityTypesResponse) = this()
  /** ListEntityTypesResponse entityTypes. */
  @JSName("entityTypes")
  var entityTypes_ListEntityTypesResponse: js.Array[IEntityType] = js.native
  /** ListEntityTypesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListEntityTypesResponse: String = js.native
  /**
    * Converts this ListEntityTypesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.ListEntityTypesResponse")
@js.native
object ListEntityTypesResponse extends js.Object {
  /**
    * Creates a new ListEntityTypesResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListEntityTypesResponse instance
    */
  def create(): ListEntityTypesResponse = js.native
  def create(properties: IListEntityTypesResponse): ListEntityTypesResponse = js.native
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListEntityTypesResponse = js.native
  def decode(reader: Reader, length: Double): ListEntityTypesResponse = js.native
  def decode(reader: Uint8Array): ListEntityTypesResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListEntityTypesResponse = js.native
  /**
    * Decodes a ListEntityTypesResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListEntityTypesResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListEntityTypesResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListEntityTypesResponse = js.native
  /**
    * Encodes the specified ListEntityTypesResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListEntityTypesResponse): Writer = js.native
  def encode(message: IListEntityTypesResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListEntityTypesResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.ListEntityTypesResponse.verify|verify} messages.
    * @param message ListEntityTypesResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListEntityTypesResponse): Writer = js.native
  def encodeDelimited(message: IListEntityTypesResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListEntityTypesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListEntityTypesResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListEntityTypesResponse = js.native
  /**
    * Creates a plain object from a ListEntityTypesResponse message. Also converts values to other types if specified.
    * @param message ListEntityTypesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListEntityTypesResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListEntityTypesResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListEntityTypesResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

