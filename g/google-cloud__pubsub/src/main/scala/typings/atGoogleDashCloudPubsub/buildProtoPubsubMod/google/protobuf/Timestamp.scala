package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.long.longMod.^
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Timestamp. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.Timestamp")
@js.native
/**
  * Constructs a new Timestamp.
  * @param [properties] Properties to set
  */
class Timestamp () extends ITimestamp {
  def this(properties: ITimestamp) = this()
  /** Timestamp nanos. */
  @JSName("nanos")
  var nanos_Timestamp: Double = js.native
  /** Timestamp seconds. */
  @JSName("seconds")
  var seconds_Timestamp: Double | ^  = js.native
  /**
    * Converts this Timestamp to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.Timestamp")
@js.native
object Timestamp extends js.Object {
  /**
    * Creates a new Timestamp instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Timestamp instance
    */
  def create(): Timestamp = js.native
  def create(properties: ITimestamp): Timestamp = js.native
  /**
    * Decodes a Timestamp message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Timestamp = js.native
  def decode(reader: Reader, length: Double): Timestamp = js.native
  def decode(reader: Uint8Array): Timestamp = js.native
  def decode(reader: Uint8Array, length: Double): Timestamp = js.native
  /**
    * Decodes a Timestamp message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Timestamp = js.native
  def decodeDelimited(reader: Uint8Array): Timestamp = js.native
  /**
    * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITimestamp): Writer = js.native
  def encode(message: ITimestamp, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITimestamp): Writer = js.native
  def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
  /**
    * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Timestamp
    */
  def fromObject(`object`: StringDictionary[js.Any]): Timestamp = js.native
  /**
    * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
    * @param message Timestamp
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Timestamp): StringDictionary[js.Any] = js.native
  def toObject(message: Timestamp, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Timestamp message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

