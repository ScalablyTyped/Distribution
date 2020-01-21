package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSubscriptionsResponse. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ListSubscriptionsResponse")
@js.native
/**
  * Constructs a new ListSubscriptionsResponse.
  * @param [properties] Properties to set
  */
class ListSubscriptionsResponse () extends IListSubscriptionsResponse {
  def this(properties: IListSubscriptionsResponse) = this()
  /** ListSubscriptionsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListSubscriptionsResponse: String = js.native
  /** ListSubscriptionsResponse subscriptions. */
  @JSName("subscriptions")
  var subscriptions_ListSubscriptionsResponse: js.Array[ISubscription] = js.native
  /**
    * Converts this ListSubscriptionsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ListSubscriptionsResponse")
@js.native
object ListSubscriptionsResponse extends js.Object {
  /**
    * Creates a new ListSubscriptionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSubscriptionsResponse instance
    */
  def create(): ListSubscriptionsResponse = js.native
  def create(properties: IListSubscriptionsResponse): ListSubscriptionsResponse = js.native
  /**
    * Decodes a ListSubscriptionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListSubscriptionsResponse = js.native
  def decode(reader: Reader, length: Double): ListSubscriptionsResponse = js.native
  def decode(reader: Uint8Array): ListSubscriptionsResponse = js.native
  def decode(reader: Uint8Array, length: Double): ListSubscriptionsResponse = js.native
  /**
    * Decodes a ListSubscriptionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListSubscriptionsResponse = js.native
  def decodeDelimited(reader: Uint8Array): ListSubscriptionsResponse = js.native
  /**
    * Encodes the specified ListSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
    * @param message ListSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSubscriptionsResponse): Writer = js.native
  def encode(message: IListSubscriptionsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
    * @param message ListSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSubscriptionsResponse): Writer = js.native
  def encodeDelimited(message: IListSubscriptionsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSubscriptionsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListSubscriptionsResponse = js.native
  /**
    * Creates a plain object from a ListSubscriptionsResponse message. Also converts values to other types if specified.
    * @param message ListSubscriptionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListSubscriptionsResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ListSubscriptionsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSubscriptionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

