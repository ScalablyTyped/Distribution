package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSubscriptionRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetSubscriptionRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest")
@js.native
/**
  * Constructs a new GetSubscriptionRequest.
  * @param [properties] Properties to set
  */
class GetSubscriptionRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest {
  def this(properties: IGetSubscriptionRequest) = this()
}
object GetSubscriptionRequest {
  
  /**
    * Creates a new GetSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSubscriptionRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.create")
  @js.native
  def create(properties: IGetSubscriptionRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  
  /**
    * Encodes the specified GetSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.encode")
  @js.native
  def encode(message: IGetSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.encode")
  @js.native
  def encode(message: IGetSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSubscriptionRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest = js.native
  
  /**
    * Creates a plain object from a GetSubscriptionRequest message. Also converts values to other types if specified.
    * @param message GetSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetSubscriptionRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetSubscriptionRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
