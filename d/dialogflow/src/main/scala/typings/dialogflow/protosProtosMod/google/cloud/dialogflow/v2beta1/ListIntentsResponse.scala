package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListIntentsResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse")
@js.native
/**
  * Constructs a new ListIntentsResponse.
  * @param [properties] Properties to set
  */
class ListIntentsResponse () extends IListIntentsResponse {
  def this(properties: IListIntentsResponse) = this()
  /** ListIntentsResponse intents. */
  @JSName("intents")
  var intents_ListIntentsResponse: js.Array[IIntent] = js.native
  /** ListIntentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListIntentsResponse: String = js.native
  /**
    * Converts this ListIntentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.ListIntentsResponse")
@js.native
object ListIntentsResponse extends js.Object {
  /**
    * Creates a new ListIntentsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListIntentsResponse instance
    */
  def create(): ListIntentsResponse = js.native
  def create(properties: IListIntentsResponse): ListIntentsResponse = js.native
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListIntentsResponse = js.native
  def decode(reader: Reader, length: Double): ListIntentsResponse = js.native
  def decode(reader: Uint8Array): ListIntentsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListIntentsResponse = js.native
  /**
    * Decodes a ListIntentsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListIntentsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListIntentsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListIntentsResponse = js.native
  /**
    * Encodes the specified ListIntentsResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListIntentsResponse): Writer = js.native
  def encode(message: IListIntentsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListIntentsResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.ListIntentsResponse.verify|verify} messages.
    * @param message ListIntentsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListIntentsResponse): Writer = js.native
  def encodeDelimited(message: IListIntentsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListIntentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIntentsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListIntentsResponse = js.native
  /**
    * Creates a plain object from a ListIntentsResponse message. Also converts values to other types if specified.
    * @param message ListIntentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListIntentsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListIntentsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListIntentsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

