package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSnapshotsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsRequest")
@js.native
/**
  * Constructs a new ListSnapshotsRequest.
  * @param [properties] Properties to set
  */
class ListSnapshotsRequest () extends IListSnapshotsRequest {
  def this(properties: IListSnapshotsRequest) = this()
  /** ListSnapshotsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListSnapshotsRequest: Double = js.native
  /** ListSnapshotsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListSnapshotsRequest: String = js.native
  /** ListSnapshotsRequest project. */
  @JSName("project")
  var project_ListSnapshotsRequest: String = js.native
  /**
    * Converts this ListSnapshotsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListSnapshotsRequest")
@js.native
object ListSnapshotsRequest extends js.Object {
  /**
    * Creates a new ListSnapshotsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSnapshotsRequest instance
    */
  def create(): ListSnapshotsRequest = js.native
  def create(properties: IListSnapshotsRequest): ListSnapshotsRequest = js.native
  /**
    * Decodes a ListSnapshotsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListSnapshotsRequest = js.native
  def decode(reader: Reader, length: Double): ListSnapshotsRequest = js.native
  def decode(reader: Uint8Array): ListSnapshotsRequest = js.native
  def decode(reader: Uint8Array, length: Double): ListSnapshotsRequest = js.native
  /**
    * Decodes a ListSnapshotsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSnapshotsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListSnapshotsRequest = js.native
  def decodeDelimited(reader: Uint8Array): ListSnapshotsRequest = js.native
  /**
    * Encodes the specified ListSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsRequest.verify|verify} messages.
    * @param message ListSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSnapshotsRequest): Writer = js.native
  def encode(message: IListSnapshotsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsRequest.verify|verify} messages.
    * @param message ListSnapshotsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSnapshotsRequest): Writer = js.native
  def encodeDelimited(message: IListSnapshotsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSnapshotsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListSnapshotsRequest = js.native
  /**
    * Creates a plain object from a ListSnapshotsRequest message. Also converts values to other types if specified.
    * @param message ListSnapshotsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListSnapshotsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ListSnapshotsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSnapshotsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

