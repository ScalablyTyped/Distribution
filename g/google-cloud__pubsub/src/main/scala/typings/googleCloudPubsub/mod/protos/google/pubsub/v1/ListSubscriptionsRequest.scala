package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSubscriptionsRequest
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListSubscriptionsRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest {
  def this(properties: IListSubscriptionsRequest) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListSubscriptionsRequest")
@js.native
object ListSubscriptionsRequest extends js.Object {
  /**
    * Creates a new ListSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListSubscriptionsRequest instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  def create(properties: IListSubscriptionsRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  /**
    * Decodes a ListSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  /**
    * Decodes a ListSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  /**
    * Encodes the specified ListSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
    * @param message ListSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IListSubscriptionsRequest): Writer = js.native
  def encode(message: IListSubscriptionsRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ListSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
    * @param message ListSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IListSubscriptionsRequest): Writer = js.native
  def encodeDelimited(message: IListSubscriptionsRequest, writer: Writer): Writer = js.native
  /**
    * Creates a ListSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListSubscriptionsRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest = js.native
  /**
    * Creates a plain object from a ListSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListSubscriptionsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ListSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

