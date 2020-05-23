package typings.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Duration. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.Duration")
@js.native
/**
  * Constructs a new Duration.
  * @param [properties] Properties to set
  */
class Duration ()
  extends typings.googleCloudPubsub.protosMod.google.protobuf.Duration {
  def this(properties: IDuration) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.Duration")
@js.native
object Duration extends js.Object {
  /**
    * Creates a new Duration instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Duration instance
    */
  def create(): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  def create(properties: IDuration): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  /**
    * Decodes a Duration message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  /**
    * Decodes a Duration message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Duration
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  /**
    * Encodes the specified Duration message. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDuration): Writer = js.native
  def encode(message: IDuration, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Duration message, length delimited. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
    * @param message Duration message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDuration): Writer = js.native
  def encodeDelimited(message: IDuration, writer: Writer): Writer = js.native
  /**
    * Creates a Duration message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Duration
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.protobuf.Duration = js.native
  /**
    * Creates a plain object from a Duration message. Also converts values to other types if specified.
    * @param message Duration
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.Duration): StringDictionary[js.Any] = js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.protobuf.Duration, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Duration message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

