package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ReceivedMessage. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ReceivedMessage")
@js.native
/**
  * Constructs a new ReceivedMessage.
  * @param [properties] Properties to set
  */
class ReceivedMessage () extends IReceivedMessage {
  def this(properties: IReceivedMessage) = this()
  /** ReceivedMessage ackId. */
  @JSName("ackId")
  var ackId_ReceivedMessage: String = js.native
  /**
    * Converts this ReceivedMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.ReceivedMessage")
@js.native
object ReceivedMessage extends js.Object {
  /**
    * Creates a new ReceivedMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReceivedMessage instance
    */
  def create(): ReceivedMessage = js.native
  def create(properties: IReceivedMessage): ReceivedMessage = js.native
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ReceivedMessage = js.native
  def decode(reader: Reader, length: Double): ReceivedMessage = js.native
  def decode(reader: Uint8Array): ReceivedMessage = js.native
  def decode(reader: Uint8Array, length: Double): ReceivedMessage = js.native
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ReceivedMessage = js.native
  def decodeDelimited(reader: Uint8Array): ReceivedMessage = js.native
  /**
    * Encodes the specified ReceivedMessage message. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IReceivedMessage): Writer = js.native
  def encode(message: IReceivedMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ReceivedMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IReceivedMessage): Writer = js.native
  def encodeDelimited(message: IReceivedMessage, writer: Writer): Writer = js.native
  /**
    * Creates a ReceivedMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReceivedMessage
    */
  def fromObject(`object`: StringDictionary[js.Any]): ReceivedMessage = js.native
  /**
    * Creates a plain object from a ReceivedMessage message. Also converts values to other types if specified.
    * @param message ReceivedMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ReceivedMessage): StringDictionary[js.Any] = js.native
  def toObject(message: ReceivedMessage, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ReceivedMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

