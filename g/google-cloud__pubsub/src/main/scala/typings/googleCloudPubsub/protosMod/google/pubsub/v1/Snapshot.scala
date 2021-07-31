package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Snapshot. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot")
@js.native
/**
  * Constructs a new Snapshot.
  * @param [properties] Properties to set
  */
class Snapshot ()
  extends StObject
     with ISnapshot {
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
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Snapshot")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Snapshot instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Snapshot instance
    */
  /* static member */
  @scala.inline
  def create(): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Snapshot]
  @scala.inline
  def create(properties: ISnapshot): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  
  /**
    * Decodes a Snapshot message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  @scala.inline
  def decode(reader: Reader, length: Double): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  @scala.inline
  def decode(reader: Uint8Array): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  
  /**
    * Decodes a Snapshot message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Snapshot
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  
  /**
    * Encodes the specified Snapshot message. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISnapshot): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISnapshot, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Snapshot message, length delimited. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
    * @param message Snapshot message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISnapshot): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISnapshot, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Snapshot message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Snapshot
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  
  /**
    * Creates a plain object from a Snapshot message. Also converts values to other types if specified.
    * @param message Snapshot
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: Snapshot): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Snapshot, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Snapshot message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
