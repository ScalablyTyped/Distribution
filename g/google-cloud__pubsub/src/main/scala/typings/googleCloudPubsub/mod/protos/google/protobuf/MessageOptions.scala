package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IMessageOptions
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MessageOptions. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.MessageOptions")
@js.native
/**
  * Constructs a new MessageOptions.
  * @param [properties] Properties to set
  */
class MessageOptions ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions {
  def this(properties: IMessageOptions) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.MessageOptions")
@js.native
object MessageOptions extends js.Object {
  /**
    * Creates a new MessageOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageOptions instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  def create(properties: IMessageOptions): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  /**
    * Decodes a MessageOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  /**
    * Decodes a MessageOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  /**
    * Encodes the specified MessageOptions message. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessageOptions): Writer = js.native
  def encode(message: IMessageOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MessageOptions message, length delimited. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
    * @param message MessageOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessageOptions): Writer = js.native
  def encodeDelimited(message: IMessageOptions, writer: Writer): Writer = js.native
  /**
    * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions = js.native
  /**
    * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
    * @param message MessageOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.protobuf.MessageOptions,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MessageOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

