package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IUpdateSubscriptionRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UpdateSubscriptionRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSubscriptionRequest")
@js.native
/**
  * Constructs a new UpdateSubscriptionRequest.
  * @param [properties] Properties to set
  */
class UpdateSubscriptionRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest {
  def this(properties: IUpdateSubscriptionRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.UpdateSubscriptionRequest")
@js.native
object UpdateSubscriptionRequest extends js.Object {
  /**
    * Creates a new UpdateSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSubscriptionRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  def create(properties: IUpdateSubscriptionRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  /**
    * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  /**
    * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  /**
    * Encodes the specified UpdateSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
    * @param message UpdateSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IUpdateSubscriptionRequest): Writer = js.native
  def encode(message: IUpdateSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified UpdateSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
    * @param message UpdateSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IUpdateSubscriptionRequest): Writer = js.native
  def encodeDelimited(message: IUpdateSubscriptionRequest, writer: Writer): Writer = js.native
  /**
    * Creates an UpdateSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSubscriptionRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest = js.native
  /**
    * Creates a plain object from an UpdateSubscriptionRequest message. Also converts values to other types if specified.
    * @param message UpdateSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.UpdateSubscriptionRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an UpdateSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

