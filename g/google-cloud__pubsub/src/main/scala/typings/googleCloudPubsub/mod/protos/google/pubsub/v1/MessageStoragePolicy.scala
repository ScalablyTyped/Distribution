package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IMessageStoragePolicy
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MessageStoragePolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy")
@js.native
/**
  * Constructs a new MessageStoragePolicy.
  * @param [properties] Properties to set
  */
class MessageStoragePolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy {
  def this(properties: IMessageStoragePolicy) = this()
}
object MessageStoragePolicy {
  
  /**
    * Creates a new MessageStoragePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageStoragePolicy instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.create")
  @js.native
  def create(properties: IMessageStoragePolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  
  /**
    * Encodes the specified MessageStoragePolicy message. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.encode")
  @js.native
  def encode(message: IMessageStoragePolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.encode")
  @js.native
  def encode(message: IMessageStoragePolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified MessageStoragePolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessageStoragePolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessageStoragePolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a MessageStoragePolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageStoragePolicy
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy = js.native
  
  /**
    * Creates a plain object from a MessageStoragePolicy message. Also converts values to other types if specified.
    * @param message MessageStoragePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.MessageStoragePolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a MessageStoragePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.MessageStoragePolicy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
