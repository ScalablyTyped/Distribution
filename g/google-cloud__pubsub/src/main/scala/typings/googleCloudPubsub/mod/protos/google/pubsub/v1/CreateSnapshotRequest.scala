package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ICreateSnapshotRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CreateSnapshotRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.CreateSnapshotRequest")
@js.native
/**
  * Constructs a new CreateSnapshotRequest.
  * @param [properties] Properties to set
  */
class CreateSnapshotRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest {
  def this(properties: ICreateSnapshotRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.CreateSnapshotRequest")
@js.native
object CreateSnapshotRequest extends js.Object {
  /**
    * Creates a new CreateSnapshotRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CreateSnapshotRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  def create(properties: ICreateSnapshotRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  /**
    * Decodes a CreateSnapshotRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CreateSnapshotRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  /**
    * Encodes the specified CreateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICreateSnapshotRequest): Writer = js.native
  def encode(message: ICreateSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CreateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
    * @param message CreateSnapshotRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICreateSnapshotRequest): Writer = js.native
  def encodeDelimited(message: ICreateSnapshotRequest, writer: Writer): Writer = js.native
  /**
    * Creates a CreateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateSnapshotRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest = js.native
  /**
    * Creates a plain object from a CreateSnapshotRequest message. Also converts values to other types if specified.
    * @param message CreateSnapshotRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.CreateSnapshotRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CreateSnapshotRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

