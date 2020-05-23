package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse")
@js.native
/**
  * Constructs a new ListTopicsResponse.
  * @param [properties] Properties to set
  */
class ListTopicsResponse () extends IListTopicsResponse {
  def this(properties: IListTopicsResponse) = this()
  /** ListTopicsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListTopicsResponse: String = js.native
  /** ListTopicsResponse topics. */
  @JSName("topics")
  var topics_ListTopicsResponse: js.Array[ITopic] = js.native
  /**
    * Converts this ListTopicsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse")
@js.native
object ListTopicsResponse extends js.Object {
  /**
    * Creates a new ListTopicsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsResponse instance
    */
  def create(): ListTopicsResponse = js.native
  def create(properties: IListTopicsResponse): ListTopicsResponse = js.native
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListTopicsResponse = js.native
  def decode(reader: Reader, length: Double): ListTopicsResponse = js.native
  def decode(reader: Uint8Array): ListTopicsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListTopicsResponse = js.native
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListTopicsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListTopicsResponse = js.native
  /**
    * Encodes the specified ListTopicsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicsResponse): Writer = js.native
  def encode(message: IListTopicsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicsResponse): Writer = js.native
  def encodeDelimited(message: IListTopicsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicsResponse = js.native
  /**
    * Creates a plain object from a ListTopicsResponse message. Also converts values to other types if specified.
    * @param message ListTopicsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListTopicsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListTopicsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

