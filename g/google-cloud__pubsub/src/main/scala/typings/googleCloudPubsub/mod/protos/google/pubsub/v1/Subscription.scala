package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Subscription. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscription")
@js.native
/**
  * Constructs a new Subscription.
  * @param [properties] Properties to set
  */
class Subscription ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription {
  def this(properties: ISubscription) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscription")
@js.native
object Subscription extends js.Object {
  /**
    * Creates a new Subscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Subscription instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  def create(properties: ISubscription): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  /**
    * Decodes a Subscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  /**
    * Decodes a Subscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  /**
    * Encodes the specified Subscription message. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISubscription): Writer = js.native
  def encode(message: ISubscription, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Subscription message, length delimited. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISubscription): Writer = js.native
  def encodeDelimited(message: ISubscription, writer: Writer): Writer = js.native
  /**
    * Creates a Subscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Subscription
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = js.native
  /**
    * Creates a plain object from a Subscription message. Also converts values to other types if specified.
    * @param message Subscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Subscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

