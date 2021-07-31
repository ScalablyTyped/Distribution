package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteTopicRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest")
@js.native
/**
  * Constructs a new DeleteTopicRequest.
  * @param [properties] Properties to set
  */
class DeleteTopicRequest ()
  extends StObject
     with IDeleteTopicRequest {
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
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DeleteTopicRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteTopicRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteTopicRequest instance
    */
  /* static member */
  @scala.inline
  def create(): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteTopicRequest]
  @scala.inline
  def create(properties: IDeleteTopicRequest): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): DeleteTopicRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteTopicRequest]
  @scala.inline
  def decode(reader: Uint8Array): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): DeleteTopicRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteTopicRequest]
  
  /**
    * Decodes a DeleteTopicRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteTopicRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  
  /**
    * Encodes the specified DeleteTopicRequest message. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDeleteTopicRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDeleteTopicRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
    * @param message DeleteTopicRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDeleteTopicRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDeleteTopicRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteTopicRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteTopicRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): DeleteTopicRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteTopicRequest]
  
  /**
    * Creates a plain object from a DeleteTopicRequest message. Also converts values to other types if specified.
    * @param message DeleteTopicRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: DeleteTopicRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: DeleteTopicRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DeleteTopicRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
