package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSnapshotsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicSnapshotsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest")
@js.native
/**
  * Constructs a new ListTopicSnapshotsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSnapshotsRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest {
  def this(properties: IListTopicSnapshotsRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsRequest")
@js.native
object ListTopicSnapshotsRequest extends js.Object {
  /**
    * Creates a new ListTopicSnapshotsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSnapshotsRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  def create(properties: IListTopicSnapshotsRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  /**
    * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  /**
    * Encodes the specified ListTopicSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicSnapshotsRequest): Writer = js.native
  def encode(message: IListTopicSnapshotsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
    * @param message ListTopicSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicSnapshotsRequest): Writer = js.native
  def encodeDelimited(message: IListTopicSnapshotsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSnapshotsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest = js.native
  /**
    * Creates a plain object from a ListTopicSnapshotsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSnapshotsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicSnapshotsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

