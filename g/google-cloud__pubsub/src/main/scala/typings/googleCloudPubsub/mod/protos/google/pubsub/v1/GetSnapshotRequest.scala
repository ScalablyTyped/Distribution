package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSnapshotRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest")
@js.native
/**
  * Constructs a new GetSnapshotRequest.
  * @param [properties] Properties to set
  */
class GetSnapshotRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest {
  def this(properties: IGetSnapshotRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSnapshotRequest")
@js.native
object GetSnapshotRequest extends js.Object {
  /**
    * Creates a new GetSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSnapshotRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  def create(properties: IGetSnapshotRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Decodes a GetSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Encodes the specified GetSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetSnapshotRequest): Writer = js.native
  def encode(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
    * @param message GetSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetSnapshotRequest): Writer = js.native
  def encodeDelimited(message: IGetSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSnapshotRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest = js.native
  /**
    * Creates a plain object from a GetSnapshotRequest message. Also converts values to other types if specified.
    * @param message GetSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

