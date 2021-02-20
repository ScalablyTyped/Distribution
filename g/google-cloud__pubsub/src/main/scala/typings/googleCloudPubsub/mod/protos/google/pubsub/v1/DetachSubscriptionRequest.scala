package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDetachSubscriptionRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetachSubscriptionRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest")
@js.native
/**
  * Constructs a new DetachSubscriptionRequest.
  * @param [properties] Properties to set
  */
class DetachSubscriptionRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest {
  def this(properties: IDetachSubscriptionRequest) = this()
}
object DetachSubscriptionRequest {
  
  /**
    * Creates a new DetachSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetachSubscriptionRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.create")
  @js.native
  def create(properties: IDetachSubscriptionRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  
  /**
    * Decodes a DetachSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetachSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  
  /**
    * Decodes a DetachSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetachSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  
  /**
    * Encodes the specified DetachSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionRequest.verify|verify} messages.
    * @param message DetachSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.encode")
  @js.native
  def encode(message: IDetachSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.encode")
  @js.native
  def encode(message: IDetachSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DetachSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionRequest.verify|verify} messages.
    * @param message DetachSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetachSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDetachSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DetachSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetachSubscriptionRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest = js.native
  
  /**
    * Creates a plain object from a DetachSubscriptionRequest message. Also converts values to other types if specified.
    * @param message DetachSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DetachSubscriptionRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DetachSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DetachSubscriptionRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
