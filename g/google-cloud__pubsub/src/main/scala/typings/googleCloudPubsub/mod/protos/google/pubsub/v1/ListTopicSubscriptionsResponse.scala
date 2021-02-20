package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListTopicSubscriptionsResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSubscriptionsResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsResponse.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse {
  def this(properties: IListTopicSubscriptionsResponse) = this()
}
object ListTopicSubscriptionsResponse {
  
  /**
    * Creates a new ListTopicSubscriptionsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.create")
  @js.native
  def create(properties: IListTopicSubscriptionsResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  
  /**
    * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  
  /**
    * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
    * @param message ListTopicSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
    * @param message ListTopicSubscriptionsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse = js.native
  
  /**
    * Creates a plain object from a ListTopicSubscriptionsResponse message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.ListTopicSubscriptionsResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicSubscriptionsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.ListTopicSubscriptionsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
