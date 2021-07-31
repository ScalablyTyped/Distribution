package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsRequest ()
  extends StObject
     with IListTopicSubscriptionsRequest {
  def this(properties: IListTopicSubscriptionsRequest) = this()
  
  /** ListTopicSubscriptionsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListTopicSubscriptionsRequest: Double = js.native
  
  /** ListTopicSubscriptionsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListTopicSubscriptionsRequest: String = js.native
  
  /**
    * Converts this ListTopicSubscriptionsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListTopicSubscriptionsRequest topic. */
  @JSName("topic")
  var topic_ListTopicSubscriptionsRequest: String = js.native
}
object ListTopicSubscriptionsRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListTopicSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsRequest instance
    */
  /* static member */
  @scala.inline
  def create(): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListTopicSubscriptionsRequest]
  @scala.inline
  def create(properties: IListTopicSubscriptionsRequest): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): ListTopicSubscriptionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicSubscriptionsRequest]
  @scala.inline
  def decode(reader: Uint8Array): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ListTopicSubscriptionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListTopicSubscriptionsRequest]
  
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IListTopicSubscriptionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IListTopicSubscriptionsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListTopicSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicSubscriptionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListTopicSubscriptionsRequest]
  
  /**
    * Creates a plain object from a ListTopicSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ListTopicSubscriptionsRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ListTopicSubscriptionsRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ListTopicSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
