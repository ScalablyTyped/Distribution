package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSnapshotsResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicSnapshotsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsResponse")
@js.native
/**
  * Constructs a new ListTopicSnapshotsResponse.
  * @param [properties] Properties to set
  */
class ListTopicSnapshotsResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse {
  def this(properties: IListTopicSnapshotsResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSnapshotsResponse")
@js.native
object ListTopicSnapshotsResponse extends js.Object {
  /**
    * Creates a new ListTopicSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSnapshotsResponse instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  def create(properties: IListTopicSnapshotsResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  /**
    * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  /**
    * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  /**
    * Encodes the specified ListTopicSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
    * @param message ListTopicSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicSnapshotsResponse): Writer = js.native
  def encode(message: IListTopicSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
    * @param message ListTopicSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicSnapshotsResponse): Writer = js.native
  def encodeDelimited(message: IListTopicSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSnapshotsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse = js.native
  /**
    * Creates a plain object from a ListTopicSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListTopicSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSnapshotsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

