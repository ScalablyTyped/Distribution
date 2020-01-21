package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ModifyAckDeadlineRequest. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ModifyAckDeadlineRequest")
@js.native
/**
  * Constructs a new ModifyAckDeadlineRequest.
  * @param [properties] Properties to set
  */
class ModifyAckDeadlineRequest () extends IModifyAckDeadlineRequest {
  def this(properties: IModifyAckDeadlineRequest) = this()
  /** ModifyAckDeadlineRequest ackDeadlineSeconds. */
  @JSName("ackDeadlineSeconds")
  var ackDeadlineSeconds_ModifyAckDeadlineRequest: Double = js.native
  /** ModifyAckDeadlineRequest ackIds. */
  @JSName("ackIds")
  var ackIds_ModifyAckDeadlineRequest: js.Array[String] = js.native
  /** ModifyAckDeadlineRequest subscription. */
  @JSName("subscription")
  var subscription_ModifyAckDeadlineRequest: String = js.native
  /**
    * Converts this ModifyAckDeadlineRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ModifyAckDeadlineRequest")
@js.native
object ModifyAckDeadlineRequest extends js.Object {
  /**
    * Creates a new ModifyAckDeadlineRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ModifyAckDeadlineRequest instance
    */
  def create(): ModifyAckDeadlineRequest = js.native
  def create(properties: IModifyAckDeadlineRequest): ModifyAckDeadlineRequest = js.native
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ModifyAckDeadlineRequest = js.native
  def decode(reader: Reader, length: Double): ModifyAckDeadlineRequest = js.native
  def decode(reader: Uint8Array): ModifyAckDeadlineRequest = js.native
  def decode(reader: Uint8Array, length: Double): ModifyAckDeadlineRequest = js.native
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ModifyAckDeadlineRequest = js.native
  def decodeDelimited(reader: Uint8Array): ModifyAckDeadlineRequest = js.native
  /**
    * Encodes the specified ModifyAckDeadlineRequest message. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IModifyAckDeadlineRequest): Writer = js.native
  def encode(message: IModifyAckDeadlineRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ModifyAckDeadlineRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IModifyAckDeadlineRequest): Writer = js.native
  def encodeDelimited(message: IModifyAckDeadlineRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ModifyAckDeadlineRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ModifyAckDeadlineRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): ModifyAckDeadlineRequest = js.native
  /**
    * Creates a plain object from a ModifyAckDeadlineRequest message. Also converts values to other types if specified.
    * @param message ModifyAckDeadlineRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ModifyAckDeadlineRequest): StringDictionary[js.Any] = js.native
  def toObject(message: ModifyAckDeadlineRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ModifyAckDeadlineRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

