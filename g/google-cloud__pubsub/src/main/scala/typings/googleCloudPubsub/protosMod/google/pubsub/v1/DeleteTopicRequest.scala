package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteTopicRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest")
@js.native
/**
  * Constructs a new DeleteTopicRequest.
  * @param [properties] Properties to set
  */
class DeleteTopicRequest () extends IDeleteTopicRequest {
  def this(properties: IDeleteTopicRequest) = this()
  
  /**
    * Converts this DeleteTopicRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** DeleteTopicRequest topic. */
  @JSName("topic")
  var topic_DeleteTopicRequest: String = js.native
}
object DeleteTopicRequest {
  
  /**
    * Creates a new DeleteTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteTopicRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.create")
  @js.native
  def create(): DeleteTopicRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.create")
  @js.native
  def create(properties: IDeleteTopicRequest): DeleteTopicRequest = js.native
  
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteTopicRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteTopicRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decode")
  @js.native
  def decode(reader: Uint8Array): DeleteTopicRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DeleteTopicRequest = js.native
  
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteTopicRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DeleteTopicRequest = js.native
  
  /**
    * Encodes the specified DeleteTopicRequest message. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.encode")
  @js.native
  def encode(message: IDeleteTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.encode")
  @js.native
  def encode(message: IDeleteTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteTopicRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteTopicRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteTopicRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteTopicRequest = js.native
  
  /**
    * Creates a plain object from a DeleteTopicRequest message. Also converts values to other types if specified.
    * @param message DeleteTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.toObject")
  @js.native
  def toObject(message: DeleteTopicRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.toObject")
  @js.native
  def toObject(message: DeleteTopicRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
