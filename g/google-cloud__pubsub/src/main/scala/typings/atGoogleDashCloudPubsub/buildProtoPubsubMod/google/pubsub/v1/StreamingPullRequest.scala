package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a StreamingPullRequest. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.StreamingPullRequest")
@js.native
/**
  * Constructs a new StreamingPullRequest.
  * @param [properties] Properties to set
  */
class StreamingPullRequest () extends IStreamingPullRequest {
  def this(properties: IStreamingPullRequest) = this()
  /** StreamingPullRequest ackIds. */
  @JSName("ackIds")
  var ackIds_StreamingPullRequest: js.Array[String] = js.native
  /** StreamingPullRequest modifyDeadlineAckIds. */
  @JSName("modifyDeadlineAckIds")
  var modifyDeadlineAckIds_StreamingPullRequest: js.Array[String] = js.native
  /** StreamingPullRequest modifyDeadlineSeconds. */
  @JSName("modifyDeadlineSeconds")
  var modifyDeadlineSeconds_StreamingPullRequest: js.Array[Double] = js.native
  /** StreamingPullRequest streamAckDeadlineSeconds. */
  @JSName("streamAckDeadlineSeconds")
  var streamAckDeadlineSeconds_StreamingPullRequest: Double = js.native
  /** StreamingPullRequest subscription. */
  @JSName("subscription")
  var subscription_StreamingPullRequest: String = js.native
  /**
    * Converts this StreamingPullRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.StreamingPullRequest")
@js.native
object StreamingPullRequest extends js.Object {
  /**
    * Creates a new StreamingPullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullRequest instance
    */
  def create(): StreamingPullRequest = js.native
  def create(properties: IStreamingPullRequest): StreamingPullRequest = js.native
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StreamingPullRequest = js.native
  def decode(reader: Reader, length: Double): StreamingPullRequest = js.native
  def decode(reader: Uint8Array): StreamingPullRequest = js.native
  def decode(reader: Uint8Array, length: Double): StreamingPullRequest = js.native
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StreamingPullRequest = js.native
  def decodeDelimited(reader: Uint8Array): StreamingPullRequest = js.native
  /**
    * Encodes the specified StreamingPullRequest message. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStreamingPullRequest): Writer = js.native
  def encode(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StreamingPullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStreamingPullRequest): Writer = js.native
  def encodeDelimited(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  /**
    * Creates a StreamingPullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): StreamingPullRequest = js.native
  /**
    * Creates a plain object from a StreamingPullRequest message. Also converts values to other types if specified.
    * @param message StreamingPullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StreamingPullRequest): StringDictionary[js.Any] = js.native
  def toObject(message: StreamingPullRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StreamingPullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

