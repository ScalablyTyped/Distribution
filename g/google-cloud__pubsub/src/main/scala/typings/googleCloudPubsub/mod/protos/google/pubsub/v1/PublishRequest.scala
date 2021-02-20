package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPublishRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PublishRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest")
@js.native
/**
  * Constructs a new PublishRequest.
  * @param [properties] Properties to set
  */
class PublishRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest {
  def this(properties: IPublishRequest) = this()
}
object PublishRequest {
  
  /**
    * Creates a new PublishRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PublishRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.create")
  @js.native
  def create(properties: IPublishRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  
  /**
    * Decodes a PublishRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  
  /**
    * Decodes a PublishRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  
  /**
    * Encodes the specified PublishRequest message. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.encode")
  @js.native
  def encode(message: IPublishRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.encode")
  @js.native
  def encode(message: IPublishRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PublishRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPublishRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPublishRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a PublishRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PublishRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest = js.native
  
  /**
    * Creates a plain object from a PublishRequest message. Also converts values to other types if specified.
    * @param message PublishRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.PublishRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PublishRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.PublishRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
