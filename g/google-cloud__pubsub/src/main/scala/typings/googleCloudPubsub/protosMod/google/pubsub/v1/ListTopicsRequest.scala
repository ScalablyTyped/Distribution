package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListTopicsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsRequest")
@js.native
/**
  * Constructs a new ListTopicsRequest.
  * @param [properties] Properties to set
  */
class ListTopicsRequest () extends IListTopicsRequest {
  def this(properties: IListTopicsRequest) = this()
  /** ListTopicsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListTopicsRequest: Double = js.native
  /** ListTopicsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListTopicsRequest: String = js.native
  /** ListTopicsRequest project. */
  @JSName("project")
  var project_ListTopicsRequest: String = js.native
  /**
    * Converts this ListTopicsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsRequest")
@js.native
object ListTopicsRequest extends js.Object {
  /**
    * Creates a new ListTopicsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsRequest instance
    */
  def create(): ListTopicsRequest = js.native
  def create(properties: IListTopicsRequest): ListTopicsRequest = js.native
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ListTopicsRequest = js.native
  def decode(reader: Reader, length: Double): ListTopicsRequest = js.native
  def decode(reader: Uint8Array): ListTopicsRequest = js.native
  def decode(reader: Uint8Array, length: Double): ListTopicsRequest = js.native
  /**
    * Decodes a ListTopicsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ListTopicsRequest = js.native
  def decodeDelimited(reader: Uint8Array): ListTopicsRequest = js.native
  /**
    * Encodes the specified ListTopicsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListTopicsRequest): Writer = js.native
  def encode(message: IListTopicsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListTopicsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
    * @param message ListTopicsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListTopicsRequest): Writer = js.native
  def encodeDelimited(message: IListTopicsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListTopicsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicsRequest = js.native
  /**
    * Creates a plain object from a ListTopicsRequest message. Also converts values to other types if specified.
    * @param message ListTopicsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ListTopicsRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ListTopicsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListTopicsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

