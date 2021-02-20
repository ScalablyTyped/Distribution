package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IExpirationPolicy
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExpirationPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy")
@js.native
/**
  * Constructs a new ExpirationPolicy.
  * @param [properties] Properties to set
  */
class ExpirationPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy {
  def this(properties: IExpirationPolicy) = this()
}
object ExpirationPolicy {
  
  /**
    * Creates a new ExpirationPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExpirationPolicy instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.create")
  @js.native
  def create(properties: IExpirationPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  
  /**
    * Decodes an ExpirationPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExpirationPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  
  /**
    * Decodes an ExpirationPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExpirationPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  
  /**
    * Encodes the specified ExpirationPolicy message. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
    * @param message ExpirationPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.encode")
  @js.native
  def encode(message: IExpirationPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.encode")
  @js.native
  def encode(message: IExpirationPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ExpirationPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
    * @param message ExpirationPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExpirationPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IExpirationPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates an ExpirationPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExpirationPolicy
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy = js.native
  
  /**
    * Creates a plain object from an ExpirationPolicy message. Also converts values to other types if specified.
    * @param message ExpirationPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ExpirationPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an ExpirationPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ExpirationPolicy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
