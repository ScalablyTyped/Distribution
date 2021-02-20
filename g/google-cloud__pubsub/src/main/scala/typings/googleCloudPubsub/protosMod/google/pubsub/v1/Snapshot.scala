package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Snapshot. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot")
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
  
  /**
    * Converts this Snapshot to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Snapshot topic. */
  @JSName("topic")
  var topic_Snapshot: String = js.native
}
object Snapshot {
  
  /**
    * Creates a new Snapshot instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Snapshot instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.create")
  @js.native
  def create(): Snapshot = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.create")
  @js.native
  def create(properties: ISnapshot): Snapshot = js.native
  
  /**
    * Decodes a Snapshot message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decode")
  @js.native
  def decode(reader: Reader): Snapshot = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decode")
  @js.native
  def decode(reader: Reader, length: Double): Snapshot = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decode")
  @js.native
  def decode(reader: Uint8Array): Snapshot = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Snapshot = js.native
  
  /**
    * Decodes a Snapshot message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Snapshot = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Snapshot = js.native
  
  /**
    * Encodes the specified Snapshot message. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.encode")
  @js.native
  def encode(message: ISnapshot): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.encode")
  @js.native
  def encode(message: ISnapshot, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Snapshot message, length delimited. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISnapshot): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISnapshot, writer: Writer): Writer = js.native
  
  /**
    * Creates a Snapshot message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Snapshot
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Snapshot = js.native
  
  /**
    * Creates a plain object from a Snapshot message. Also converts values to other types if specified.
    * @param message Snapshot
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.toObject")
  @js.native
  def toObject(message: Snapshot): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.toObject")
  @js.native
  def toObject(message: Snapshot, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Snapshot message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
