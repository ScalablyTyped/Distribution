package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a StreamingPullResponse. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.StreamingPullResponse")
@js.native
/**
  * Constructs a new StreamingPullResponse.
  * @param [properties] Properties to set
  */
class StreamingPullResponse () extends IStreamingPullResponse {
  def this(properties: IStreamingPullResponse) = this()
  /** StreamingPullResponse receivedMessages. */
  @JSName("receivedMessages")
  var receivedMessages_StreamingPullResponse: js.Array[IReceivedMessage] = js.native
  /**
    * Converts this StreamingPullResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.StreamingPullResponse")
@js.native
object StreamingPullResponse extends js.Object {
  /**
    * Creates a new StreamingPullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullResponse instance
    */
  def create(): StreamingPullResponse = js.native
  def create(properties: IStreamingPullResponse): StreamingPullResponse = js.native
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StreamingPullResponse = js.native
  def decode(reader: Reader, length: Double): StreamingPullResponse = js.native
  def decode(reader: Uint8Array): StreamingPullResponse = js.native
  def decode(reader: Uint8Array, length: Double): StreamingPullResponse = js.native
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StreamingPullResponse = js.native
  def decodeDelimited(reader: Uint8Array): StreamingPullResponse = js.native
  /**
    * Encodes the specified StreamingPullResponse message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStreamingPullResponse): Writer = js.native
  def encode(message: IStreamingPullResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StreamingPullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStreamingPullResponse): Writer = js.native
  def encodeDelimited(message: IStreamingPullResponse, writer: Writer): Writer = js.native
  /**
    * Creates a StreamingPullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): StreamingPullResponse = js.native
  /**
    * Creates a plain object from a StreamingPullResponse message. Also converts values to other types if specified.
    * @param message StreamingPullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StreamingPullResponse): StringDictionary[js.Any] = js.native
  def toObject(message: StreamingPullResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StreamingPullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

