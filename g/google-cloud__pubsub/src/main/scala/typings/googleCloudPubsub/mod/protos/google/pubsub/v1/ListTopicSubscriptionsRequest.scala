package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest {
  def this(properties: IListTopicSubscriptionsRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest")
@js.native
object ListTopicSubscriptionsRequest extends js.Object {
  /**
    * Creates a new ListTopicSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  def create(properties: IListTopicSubscriptionsRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicSubscriptionsRequest): Writer = js.native
  def encode(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicSubscriptionsRequest): Writer = js.native
  def encodeDelimited(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  /**
    * Creates a plain object from a ListTopicSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

