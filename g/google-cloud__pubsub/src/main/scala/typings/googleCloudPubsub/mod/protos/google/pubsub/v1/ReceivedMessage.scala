package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IReceivedMessage
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ReceivedMessage. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage")
@js.native
/**
  * Constructs a new ReceivedMessage.
  * @param [properties] Properties to set
  */
class ReceivedMessage ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage {
  def this(properties: IReceivedMessage) = this()
}
object ReceivedMessage {
  
  /**
    * Creates a new ReceivedMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReceivedMessage instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.create")
  @js.native
  def create(properties: IReceivedMessage): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  
  /**
    * Encodes the specified ReceivedMessage message. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.encode")
  @js.native
  def encode(message: IReceivedMessage): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.encode")
  @js.native
  def encode(message: IReceivedMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ReceivedMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReceivedMessage): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReceivedMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a ReceivedMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReceivedMessage
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage = js.native
  
  /**
    * Creates a plain object from a ReceivedMessage message. Also converts values to other types if specified.
    * @param message ReceivedMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ReceivedMessage,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ReceivedMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ReceivedMessage.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
