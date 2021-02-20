package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IStreamingPullRequest
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullRequest. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest")
@js.native
/**
  * Constructs a new StreamingPullRequest.
  * @param [properties] Properties to set
  */
class StreamingPullRequest ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest {
  def this(properties: IStreamingPullRequest) = this()
}
object StreamingPullRequest {
  
  /**
    * Creates a new StreamingPullRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.create")
  @js.native
  def create(properties: IStreamingPullRequest): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  
  /**
    * Decodes a StreamingPullRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  
  /**
    * Encodes the specified StreamingPullRequest message. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.encode")
  @js.native
  def encode(message: IStreamingPullRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.encode")
  @js.native
  def encode(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingPullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
    * @param message StreamingPullRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingPullRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest = js.native
  
  /**
    * Creates a plain object from a StreamingPullRequest message. Also converts values to other types if specified.
    * @param message StreamingPullRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullRequest,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingPullRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
