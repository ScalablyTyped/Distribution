package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListContextsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsResponse")
@js.native
/**
  * Constructs a new ListContextsResponse.
  * @param [properties] Properties to set
  */
class ListContextsResponse () extends IListContextsResponse {
  def this(properties: IListContextsResponse) = this()
  /** ListContextsResponse contexts. */
  @JSName("contexts")
  var contexts_ListContextsResponse: js.Array[IContext] = js.native
  /** ListContextsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListContextsResponse: String = js.native
  /**
    * Converts this ListContextsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListContextsResponse")
@js.native
object ListContextsResponse extends js.Object {
  /**
    * Creates a new ListContextsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListContextsResponse instance
    */
  def create(): ListContextsResponse = js.native
  def create(properties: IListContextsResponse): ListContextsResponse = js.native
  /**
    * Decodes a ListContextsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListContextsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListContextsResponse = js.native
  def decode(reader: Reader, length: Double): ListContextsResponse = js.native
  def decode(reader: Uint8Array): ListContextsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListContextsResponse = js.native
  /**
    * Decodes a ListContextsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListContextsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListContextsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListContextsResponse = js.native
  /**
    * Encodes the specified ListContextsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsResponse.verify|verify} messages.
    * @param message ListContextsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListContextsResponse): Writer = js.native
  def encode(message: IListContextsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListContextsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListContextsResponse.verify|verify} messages.
    * @param message ListContextsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListContextsResponse): Writer = js.native
  def encodeDelimited(message: IListContextsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListContextsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListContextsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListContextsResponse = js.native
  /**
    * Creates a plain object from a ListContextsResponse message. Also converts values to other types if specified.
    * @param message ListContextsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListContextsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListContextsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListContextsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

