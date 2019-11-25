package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Subscription. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.Subscription")
@js.native
/**
  * Constructs a new Subscription.
  * @param [properties] Properties to set
  */
class Subscription () extends ISubscription {
  def this(properties: ISubscription) = this()
  /** Subscription ackDeadlineSeconds. */
  @JSName("ackDeadlineSeconds")
  var ackDeadlineSeconds_Subscription: Double = js.native
  /** Subscription enableMessageOrdering. */
  @JSName("enableMessageOrdering")
  var enableMessageOrdering_Subscription: Boolean = js.native
  /** Subscription labels. */
  @JSName("labels")
  var labels_Subscription: StringDictionary[String] = js.native
  /** Subscription name. */
  @JSName("name")
  var name_Subscription: String = js.native
  /** Subscription retainAckedMessages. */
  @JSName("retainAckedMessages")
  var retainAckedMessages_Subscription: Boolean = js.native
  /** Subscription topic. */
  @JSName("topic")
  var topic_Subscription: String = js.native
  /**
    * Converts this Subscription to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.Subscription")
@js.native
object Subscription extends js.Object {
  /**
    * Creates a new Subscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Subscription instance
    */
  def create(): Subscription = js.native
  def create(properties: ISubscription): Subscription = js.native
  /**
    * Decodes a Subscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Subscription = js.native
  def decode(reader: Reader, length: Double): Subscription = js.native
  def decode(reader: Uint8Array): Subscription = js.native
  def decode(reader: Uint8Array, length: Double): Subscription = js.native
  /**
    * Decodes a Subscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Subscription = js.native
  def decodeDelimited(reader: Uint8Array): Subscription = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): Subscription = js.native
  /**
    * Creates a plain object from a Subscription message. Also converts values to other types if specified.
    * @param message Subscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Subscription): StringDictionary[js.Any] = js.native
  def toObject(message: Subscription, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Subscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

