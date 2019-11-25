package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateSnapshotRequest. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.UpdateSnapshotRequest")
@js.native
/**
  * Constructs a new UpdateSnapshotRequest.
  * @param [properties] Properties to set
  */
class UpdateSnapshotRequest () extends IUpdateSnapshotRequest {
  def this(properties: IUpdateSnapshotRequest) = this()
  /**
    * Converts this UpdateSnapshotRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.UpdateSnapshotRequest")
@js.native
object UpdateSnapshotRequest extends js.Object {
  /**
    * Creates a new UpdateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSnapshotRequest instance
    */
  def create(): UpdateSnapshotRequest = js.native
  def create(properties: IUpdateSnapshotRequest): UpdateSnapshotRequest = js.native
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): UpdateSnapshotRequest = js.native
  def decode(reader: Reader, length: Double): UpdateSnapshotRequest = js.native
  def decode(reader: Uint8Array): UpdateSnapshotRequest = js.native
  def decode(reader: Uint8Array, length: Double): UpdateSnapshotRequest = js.native
  /**
    * Decodes an UpdateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): UpdateSnapshotRequest = js.native
  def decodeDelimited(reader: Uint8Array): UpdateSnapshotRequest = js.native
  /**
    * Encodes the specified UpdateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateSnapshotRequest): Writer = js.native
  def encode(message: IUpdateSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
    * @param message UpdateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateSnapshotRequest): Writer = js.native
  def encodeDelimited(message: IUpdateSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSnapshotRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): UpdateSnapshotRequest = js.native
  /**
    * Creates a plain object from an UpdateSnapshotRequest message. Also converts values to other types if specified.
    * @param message UpdateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: UpdateSnapshotRequest): StringDictionary[js.Any] = js.native
  def toObject(message: UpdateSnapshotRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

