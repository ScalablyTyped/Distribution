package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PubsubMessage. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PubsubMessage")
@js.native
/**
  * Constructs a new PubsubMessage.
  * @param [properties] Properties to set
  */
class PubsubMessage () extends IPubsubMessage {
  def this(properties: IPubsubMessage) = this()
  /** PubsubMessage attributes. */
  @JSName("attributes")
  var attributes_PubsubMessage: StringDictionary[String] = js.native
  /** PubsubMessage data. */
  @JSName("data")
  var data_PubsubMessage: Uint8Array = js.native
  /** PubsubMessage messageId. */
  @JSName("messageId")
  var messageId_PubsubMessage: String = js.native
  /** PubsubMessage orderingKey. */
  @JSName("orderingKey")
  var orderingKey_PubsubMessage: String = js.native
  /**
    * Converts this PubsubMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PubsubMessage")
@js.native
object PubsubMessage extends js.Object {
  /**
    * Creates a new PubsubMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PubsubMessage instance
    */
  def create(): PubsubMessage = js.native
  def create(properties: IPubsubMessage): PubsubMessage = js.native
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PubsubMessage = js.native
  def decode(reader: Reader, length: Double): PubsubMessage = js.native
  def decode(reader: Uint8Array): PubsubMessage = js.native
  def decode(reader: Uint8Array, length: Double): PubsubMessage = js.native
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PubsubMessage = js.native
  def decodeDelimited(reader: Uint8Array): PubsubMessage = js.native
  /**
    * Encodes the specified PubsubMessage message. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPubsubMessage): Writer = js.native
  def encode(message: IPubsubMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PubsubMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPubsubMessage): Writer = js.native
  def encodeDelimited(message: IPubsubMessage, writer: Writer): Writer = js.native
  /**
    * Creates a PubsubMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PubsubMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): PubsubMessage = js.native
  /**
    * Creates a plain object from a PubsubMessage message. Also converts values to other types if specified.
    * @param message PubsubMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PubsubMessage): StringDictionary[js.Any] = js.native
  def toObject(message: PubsubMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PubsubMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

