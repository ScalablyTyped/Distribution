package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest {
  def this(properties: IListTopicSubscriptionsRequest) = this()
}
object ListTopicSubscriptionsRequest {
  
  /**
    * Creates a new ListTopicSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.create")
  @js.native
  def create(properties: IListTopicSubscriptionsRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest = js.native
  
  /**
    * Creates a plain object from a ListTopicSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
