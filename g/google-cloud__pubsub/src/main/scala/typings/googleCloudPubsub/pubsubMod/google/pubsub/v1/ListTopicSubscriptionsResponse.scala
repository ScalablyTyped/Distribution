package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicSubscriptionsResponse. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ListTopicSubscriptionsResponse")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsResponse.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsResponse () extends IListTopicSubscriptionsResponse {
  def this(properties: IListTopicSubscriptionsResponse) = this()
  /** ListTopicSubscriptionsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListTopicSubscriptionsResponse: String = js.native
  /** ListTopicSubscriptionsResponse subscriptions. */
  @JSName("subscriptions")
  var subscriptions_ListTopicSubscriptionsResponse: js.Array[String] = js.native
  /**
    * Converts this ListTopicSubscriptionsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ListTopicSubscriptionsResponse")
@js.native
object ListTopicSubscriptionsResponse extends js.Object {
  /**
    * Creates a new ListTopicSubscriptionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsResponse instance
    */
  def create(): ListTopicSubscriptionsResponse = js.native
  def create(properties: IListTopicSubscriptionsResponse): ListTopicSubscriptionsResponse = js.native
  /**
    * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListTopicSubscriptionsResponse = js.native
  def decode(reader: Reader, length: Double): ListTopicSubscriptionsResponse = js.native
  def decode(reader: Uint8Array): ListTopicSubscriptionsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListTopicSubscriptionsResponse = js.native
  /**
    * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListTopicSubscriptionsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListTopicSubscriptionsResponse = js.native
  /**
    * Encodes the specified ListTopicSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
    * @param message ListTopicSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicSubscriptionsResponse): Writer = js.native
  def encode(message: IListTopicSubscriptionsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
    * @param message ListTopicSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicSubscriptionsResponse): Writer = js.native
  def encodeDelimited(message: IListTopicSubscriptionsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicSubscriptionsResponse = js.native
  /**
    * Creates a plain object from a ListTopicSubscriptionsResponse message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListTopicSubscriptionsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListTopicSubscriptionsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicSubscriptionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

