package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetTopicRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetTopicRequest")
@js.native
/**
  * Constructs a new GetTopicRequest.
  * @param [properties] Properties to set
  */
class GetTopicRequest () extends IGetTopicRequest {
  def this(properties: IGetTopicRequest) = this()
  /** GetTopicRequest topic. */
  @JSName("topic")
  var topic_GetTopicRequest: String = js.native
  /**
    * Converts this GetTopicRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetTopicRequest")
@js.native
object GetTopicRequest extends js.Object {
  /**
    * Creates a new GetTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetTopicRequest instance
    */
  def create(): GetTopicRequest = js.native
  def create(properties: IGetTopicRequest): GetTopicRequest = js.native
  /**
    * Decodes a GetTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetTopicRequest = js.native
  def decode(reader: Reader, length: Double): GetTopicRequest = js.native
  def decode(reader: Uint8Array): GetTopicRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetTopicRequest = js.native
  /**
    * Decodes a GetTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetTopicRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetTopicRequest = js.native
  /**
    * Encodes the specified GetTopicRequest message. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
    * @param message GetTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetTopicRequest): Writer = js.native
  def encode(message: IGetTopicRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
    * @param message GetTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetTopicRequest): Writer = js.native
  def encodeDelimited(message: IGetTopicRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetTopicRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetTopicRequest = js.native
  /**
    * Creates a plain object from a GetTopicRequest message. Also converts values to other types if specified.
    * @param message GetTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetTopicRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetTopicRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

