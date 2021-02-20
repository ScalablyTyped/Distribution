package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IRetryPolicy
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RetryPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy")
@js.native
/**
  * Constructs a new RetryPolicy.
  * @param [properties] Properties to set
  */
class RetryPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy {
  def this(properties: IRetryPolicy) = this()
}
object RetryPolicy {
  
  /**
    * Creates a new RetryPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RetryPolicy instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.create")
  @js.native
  def create(properties: IRetryPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  
  /**
    * Encodes the specified RetryPolicy message. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.encode")
  @js.native
  def encode(message: IRetryPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.encode")
  @js.native
  def encode(message: IRetryPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RetryPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRetryPolicy): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRetryPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a RetryPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RetryPolicy
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = js.native
  
  /**
    * Creates a plain object from a RetryPolicy message. Also converts values to other types if specified.
    * @param message RetryPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RetryPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
