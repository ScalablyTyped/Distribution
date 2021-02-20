package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IStreamingPullResponse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingPullResponse. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse")
@js.native
/**
  * Constructs a new StreamingPullResponse.
  * @param [properties] Properties to set
  */
class StreamingPullResponse ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse {
  def this(properties: IStreamingPullResponse) = this()
}
object StreamingPullResponse {
  
  /**
    * Creates a new StreamingPullResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingPullResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.create")
  @js.native
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.create")
  @js.native
  def create(properties: IStreamingPullResponse): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decode")
  @js.native
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  
  /**
    * Decodes a StreamingPullResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingPullResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  
  /**
    * Encodes the specified StreamingPullResponse message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.encode")
  @js.native
  def encode(message: IStreamingPullResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.encode")
  @js.native
  def encode(message: IStreamingPullResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StreamingPullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
    * @param message StreamingPullResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStreamingPullResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a StreamingPullResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingPullResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse = js.native
  
  /**
    * Creates a plain object from a StreamingPullResponse message. Also converts values to other types if specified.
    * @param message StreamingPullResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.toObject")
  @js.native
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.toObject")
  @js.native
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StreamingPullResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.StreamingPullResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
