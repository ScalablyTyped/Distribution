package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeadLetterPolicy
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeadLetterPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy")
@js.native
/**
  * Constructs a new DeadLetterPolicy.
  * @param [properties] Properties to set
  */
class DeadLetterPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy {
  def this(properties: IDeadLetterPolicy) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeadLetterPolicy")
@js.native
object DeadLetterPolicy extends js.Object {
  /**
    * Creates a new DeadLetterPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeadLetterPolicy instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  def create(properties: IDeadLetterPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Decodes a DeadLetterPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeadLetterPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Encodes the specified DeadLetterPolicy message. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeadLetterPolicy): Writer = js.native
  def encode(message: IDeadLetterPolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeadLetterPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.DeadLetterPolicy.verify|verify} messages.
    * @param message DeadLetterPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeadLetterPolicy): Writer = js.native
  def encodeDelimited(message: IDeadLetterPolicy, writer: Writer): Writer = js.native
  /**
    * Creates a DeadLetterPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeadLetterPolicy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy = js.native
  /**
    * Creates a plain object from a DeadLetterPolicy message. Also converts values to other types if specified.
    * @param message DeadLetterPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeadLetterPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeadLetterPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

