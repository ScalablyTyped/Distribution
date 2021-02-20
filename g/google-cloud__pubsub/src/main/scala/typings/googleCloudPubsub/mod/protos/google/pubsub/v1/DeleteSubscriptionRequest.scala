package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSubscriptionRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteSubscriptionRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest")
@js.native
/**
  * Constructs a new DeleteSubscriptionRequest.
  * @param [properties] Properties to set
  */
class DeleteSubscriptionRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest {
  def this(properties: IDeleteSubscriptionRequest) = this()
}
object DeleteSubscriptionRequest {
  
  /**
    * Creates a new DeleteSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteSubscriptionRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.create")
  @js.native
  def create(properties: IDeleteSubscriptionRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  
  /**
    * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  
  /**
    * Encodes the specified DeleteSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.encode")
  @js.native
  def encode(message: IDeleteSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.encode")
  @js.native
  def encode(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
    * @param message DeleteSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteSubscriptionRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteSubscriptionRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteSubscriptionRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest = js.native
  
  /**
    * Creates a plain object from a DeleteSubscriptionRequest message. Also converts values to other types if specified.
    * @param message DeleteSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.DeleteSubscriptionRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.DeleteSubscriptionRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
