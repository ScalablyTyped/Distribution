package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.snapshot
import typings.googleCloudPubsub.googleCloudPubsubStrings.time
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SeekRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest")
@js.native
/**
  * Constructs a new SeekRequest.
  * @param [properties] Properties to set
  */
class SeekRequest () extends ISeekRequest {
  def this(properties: ISeekRequest) = this()
  /** SeekRequest snapshot. */
  @JSName("snapshot")
  var snapshot_SeekRequest: String = js.native
  /** SeekRequest subscription. */
  @JSName("subscription")
  var subscription_SeekRequest: String = js.native
  /** SeekRequest target. */
  var target: js.UndefOr[time | snapshot] = js.native
  /**
    * Converts this SeekRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SeekRequest")
@js.native
object SeekRequest extends js.Object {
  /**
    * Creates a new SeekRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SeekRequest instance
    */
  def create(): SeekRequest = js.native
  def create(properties: ISeekRequest): SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): SeekRequest = js.native
  def decode(reader: Reader, length: Double): SeekRequest = js.native
  def decode(reader: Uint8Array): SeekRequest = js.native
  def decode(reader: Uint8Array, length: Double): SeekRequest = js.native
  /**
    * Decodes a SeekRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SeekRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): SeekRequest = js.native
  def decodeDelimited(reader: Uint8Array): SeekRequest = js.native
  /**
    * Encodes the specified SeekRequest message. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISeekRequest): Writer = js.native
  def encode(message: ISeekRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SeekRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
    * @param message SeekRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISeekRequest): Writer = js.native
  def encodeDelimited(message: ISeekRequest, writer: Writer): Writer = js.native
  /**
    * Creates a SeekRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SeekRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): SeekRequest = js.native
  /**
    * Creates a plain object from a SeekRequest message. Also converts values to other types if specified.
    * @param message SeekRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: SeekRequest): StringDictionary[js.Any] = js.native
  def toObject(message: SeekRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SeekRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

