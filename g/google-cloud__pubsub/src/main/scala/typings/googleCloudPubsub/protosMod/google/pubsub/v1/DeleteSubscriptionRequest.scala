package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteSubscriptionRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSubscriptionRequest")
@js.native
/**
  * Constructs a new DeleteSubscriptionRequest.
  * @param [properties] Properties to set
  */
class DeleteSubscriptionRequest () extends IDeleteSubscriptionRequest {
  def this(properties: IDeleteSubscriptionRequest) = this()
  /** DeleteSubscriptionRequest subscription. */
  @JSName("subscription")
  var subscription_DeleteSubscriptionRequest: String = js.native
  /**
    * Converts this DeleteSubscriptionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteSubscriptionRequest")
@js.native
object DeleteSubscriptionRequest extends js.Object {
  /**
    * Creates a new DeleteSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSubscriptionRequest instance
    */
  def create(): DeleteSubscriptionRequest = js.native
  def create(properties: IDeleteSubscriptionRequest): DeleteSubscriptionRequest = js.native
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteSubscriptionRequest = js.native
  def decode(reader: Reader, length: Double): DeleteSubscriptionRequest = js.native
  def decode(reader: Uint8Array): DeleteSubscriptionRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteSubscriptionRequest = js.native
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteSubscriptionRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteSubscriptionRequest = js.native
  /**
    * Encodes the specified DeleteSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteSubscriptionRequest): Writer = js.native
  def encode(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteSubscriptionRequest): Writer = js.native
  def encodeDelimited(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSubscriptionRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteSubscriptionRequest = js.native
  /**
    * Creates a plain object from a DeleteSubscriptionRequest message. Also converts values to other types if specified.
    * @param message DeleteSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteSubscriptionRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteSubscriptionRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

