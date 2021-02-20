package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetTopicRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetTopicRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest")
@js.native
/**
  * Constructs a new GetTopicRequest.
  * @param [properties] Properties to set
  */
class GetTopicRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest {
  def this(properties: IGetTopicRequest) = this()
}
object GetTopicRequest {
  
  /**
    * Creates a new GetTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetTopicRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.create")
  @js.native
  def create(properties: IGetTopicRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  
  /**
    * Decodes a GetTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  
  /**
    * Decodes a GetTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  
  /**
    * Encodes the specified GetTopicRequest message. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
    * @param message GetTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.encode")
  @js.native
  def encode(message: IGetTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.encode")
  @js.native
  def encode(message: IGetTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GetTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
    * @param message GetTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IGetTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a GetTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetTopicRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest = js.native
  
  /**
    * Creates a plain object from a GetTopicRequest message. Also converts values to other types if specified.
    * @param message GetTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.GetTopicRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GetTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.GetTopicRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
