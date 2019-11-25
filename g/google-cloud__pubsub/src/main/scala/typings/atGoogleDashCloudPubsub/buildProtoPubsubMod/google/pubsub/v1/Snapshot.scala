package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Snapshot. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.Snapshot")
@js.native
/**
  * Constructs a new Snapshot.
  * @param [properties] Properties to set
  */
class Snapshot () extends ISnapshot {
  def this(properties: ISnapshot) = this()
  /** Snapshot labels. */
  @JSName("labels")
  var labels_Snapshot: StringDictionary[String] = js.native
  /** Snapshot name. */
  @JSName("name")
  var name_Snapshot: String = js.native
  /** Snapshot topic. */
  @JSName("topic")
  var topic_Snapshot: String = js.native
  /**
    * Converts this Snapshot to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Creates a new Snapshot instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Snapshot instance
    */
  def create(): Snapshot = js.native
  def create(properties: ISnapshot): Snapshot = js.native
  /**
    * Decodes a Snapshot message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Snapshot = js.native
  def decode(reader: Reader, length: Double): Snapshot = js.native
  def decode(reader: Uint8Array): Snapshot = js.native
  def decode(reader: Uint8Array, length: Double): Snapshot = js.native
  /**
    * Decodes a Snapshot message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Snapshot = js.native
  def decodeDelimited(reader: Uint8Array): Snapshot = js.native
  /**
    * Encodes the specified Snapshot message. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISnapshot): Writer = js.native
  def encode(message: ISnapshot, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Snapshot message, length delimited. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISnapshot): Writer = js.native
  def encodeDelimited(message: ISnapshot, writer: Writer): Writer = js.native
  /**
    * Creates a Snapshot message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Snapshot
    */
  def fromObject(`object`: StringDictionary[js.Any]): Snapshot = js.native
  /**
    * Creates a plain object from a Snapshot message. Also converts values to other types if specified.
    * @param message Snapshot
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Snapshot): StringDictionary[js.Any] = js.native
  def toObject(message: Snapshot, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Snapshot message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

