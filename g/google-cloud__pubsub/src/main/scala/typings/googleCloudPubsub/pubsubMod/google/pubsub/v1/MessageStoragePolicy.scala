package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MessageStoragePolicy. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.MessageStoragePolicy")
@js.native
/**
  * Constructs a new MessageStoragePolicy.
  * @param [properties] Properties to set
  */
class MessageStoragePolicy () extends IMessageStoragePolicy {
  def this(properties: IMessageStoragePolicy) = this()
  /** MessageStoragePolicy allowedPersistenceRegions. */
  @JSName("allowedPersistenceRegions")
  var allowedPersistenceRegions_MessageStoragePolicy: js.Array[String] = js.native
  /**
    * Converts this MessageStoragePolicy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.MessageStoragePolicy")
@js.native
object MessageStoragePolicy extends js.Object {
  /**
    * Creates a new MessageStoragePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageStoragePolicy instance
    */
  def create(): MessageStoragePolicy = js.native
  def create(properties: IMessageStoragePolicy): MessageStoragePolicy = js.native
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): MessageStoragePolicy = js.native
  def decode(reader: Reader, length: Double): MessageStoragePolicy = js.native
  def decode(reader: Uint8Array): MessageStoragePolicy = js.native
  def decode(reader: Uint8Array, length: Double): MessageStoragePolicy = js.native
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): MessageStoragePolicy = js.native
  def decodeDelimited(reader: Uint8Array): MessageStoragePolicy = js.native
  /**
    * Encodes the specified MessageStoragePolicy message. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessageStoragePolicy): Writer = js.native
  def encode(message: IMessageStoragePolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MessageStoragePolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessageStoragePolicy): Writer = js.native
  def encodeDelimited(message: IMessageStoragePolicy, writer: Writer): Writer = js.native
  /**
    * Creates a MessageStoragePolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageStoragePolicy
    */
  def fromObject(`object`: StringDictionary[js.Any]): MessageStoragePolicy = js.native
  /**
    * Creates a plain object from a MessageStoragePolicy message. Also converts values to other types if specified.
    * @param message MessageStoragePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: MessageStoragePolicy): StringDictionary[js.Any] = js.native
  def toObject(message: MessageStoragePolicy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MessageStoragePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

