package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPubsubMessage
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PubsubMessage. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage")
@js.native
/**
  * Constructs a new PubsubMessage.
  * @param [properties] Properties to set
  */
class PubsubMessage ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage {
  def this(properties: IPubsubMessage) = this()
}
object PubsubMessage {
  
  /**
    * Creates a new PubsubMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PubsubMessage instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.create")
  @js.native
  def create(properties: IPubsubMessage): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  
  /**
    * Encodes the specified PubsubMessage message. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.encode")
  @js.native
  def encode(message: IPubsubMessage): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.encode")
  @js.native
  def encode(message: IPubsubMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PubsubMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPubsubMessage): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPubsubMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a PubsubMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PubsubMessage
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage = js.native
  
  /**
    * Creates a plain object from a PubsubMessage message. Also converts values to other types if specified.
    * @param message PubsubMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PubsubMessage,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PubsubMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PubsubMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
