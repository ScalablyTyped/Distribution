package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSnapshotsResponse
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSnapshotsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse")
@js.native
/**
  * Constructs a new ListSnapshotsResponse.
  * @param [properties] Properties to set
  */
class ListSnapshotsResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse {
  def this(properties: IListSnapshotsResponse) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSnapshotsResponse")
@js.native
object ListSnapshotsResponse extends js.Object {
  /**
    * Creates a new ListSnapshotsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSnapshotsResponse instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def create(properties: IListSnapshotsResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Decodes a ListSnapshotsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSnapshotsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Encodes the specified ListSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSnapshotsResponse): Writer = js.native
  def encode(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
    * @param message ListSnapshotsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSnapshotsResponse): Writer = js.native
  def encodeDelimited(message: IListSnapshotsResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ListSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSnapshotsResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse = js.native
  /**
    * Creates a plain object from a ListSnapshotsResponse message. Also converts values to other types if specified.
    * @param message ListSnapshotsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSnapshotsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSnapshotsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

