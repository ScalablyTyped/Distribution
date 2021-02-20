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

/** Represents a ListTopicsResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse")
@js.native
/**
  * Constructs a new ListTopicsResponse.
  * @param [properties] Properties to set
  */
class ListTopicsResponse () extends IListTopicsResponse {
  def this(properties: IListTopicsResponse) = this()
  
  /** ListTopicsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListTopicsResponse: String = js.native
  
  /**
    * Converts this ListTopicsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListTopicsResponse topics. */
  @JSName("topics")
  var topics_ListTopicsResponse: js.Array[ITopic] = js.native
}
object ListTopicsResponse {
  
  /**
    * Creates a new ListTopicsResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicsResponse instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.create")
  @js.native
  def create(): ListTopicsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.create")
  @js.native
  def create(properties: IListTopicsResponse): ListTopicsResponse = js.native
  
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decode")
  @js.native
  def decode(reader: Reader): ListTopicsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListTopicsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ListTopicsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ListTopicsResponse = js.native
  
  /**
    * Decodes a ListTopicsResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicsResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListTopicsResponse = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ListTopicsResponse = js.native
  
  /**
    * Encodes the specified ListTopicsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.encode")
  @js.native
  def encode(message: IListTopicsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.encode")
  @js.native
  def encode(message: IListTopicsResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
    * @param message ListTopicsResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicsResponse): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicsResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicsResponse
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicsResponse = js.native
  
  /**
    * Creates a plain object from a ListTopicsResponse message. Also converts values to other types if specified.
    * @param message ListTopicsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.toObject")
  @js.native
  def toObject(message: ListTopicsResponse): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.toObject")
  @js.native
  def toObject(message: ListTopicsResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicsResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicsResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
