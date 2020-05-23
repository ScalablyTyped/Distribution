package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PullRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullRequest")
@js.native
/**
  * Constructs a new PullRequest.
  * @param [properties] Properties to set
  */
class PullRequest () extends IPullRequest {
  def this(properties: IPullRequest) = this()
  /** PullRequest maxMessages. */
  @JSName("maxMessages")
  var maxMessages_PullRequest: Double = js.native
  /** PullRequest returnImmediately. */
  @JSName("returnImmediately")
  var returnImmediately_PullRequest: Boolean = js.native
  /** PullRequest subscription. */
  @JSName("subscription")
  var subscription_PullRequest: String = js.native
  /**
    * Converts this PullRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PullRequest")
@js.native
object PullRequest extends js.Object {
  /**
    * Creates a new PullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PullRequest instance
    */
  def create(): PullRequest = js.native
  def create(properties: IPullRequest): PullRequest = js.native
  /**
    * Decodes a PullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PullRequest = js.native
  def decode(reader: Reader, length: Double): PullRequest = js.native
  def decode(reader: Uint8Array): PullRequest = js.native
  def decode(reader: Uint8Array, length: Double): PullRequest = js.native
  /**
    * Decodes a PullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PullRequest = js.native
  def decodeDelimited(reader: Uint8Array): PullRequest = js.native
  /**
    * Encodes the specified PullRequest message. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
    * @param message PullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPullRequest): Writer = js.native
  def encode(message: IPullRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
    * @param message PullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPullRequest): Writer = js.native
  def encodeDelimited(message: IPullRequest, writer: Writer): Writer = js.native
  /**
    * Creates a PullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PullRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): PullRequest = js.native
  /**
    * Creates a plain object from a PullRequest message. Also converts values to other types if specified.
    * @param message PullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PullRequest): StringDictionary[js.Any] = js.native
  def toObject(message: PullRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

