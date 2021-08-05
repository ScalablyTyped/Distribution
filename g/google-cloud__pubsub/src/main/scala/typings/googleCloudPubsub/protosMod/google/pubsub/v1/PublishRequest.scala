package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PublishRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PublishRequest")
@js.native
/**
  * Constructs a new PublishRequest.
  * @param [properties] Properties to set
  */
class PublishRequest ()
  extends StObject
     with IPublishRequest {
  def this(properties: IPublishRequest) = this()
  
  /** PublishRequest messages. */
  @JSName("messages")
  var messages_PublishRequest: js.Array[IPubsubMessage] = js.native
  
  /**
    * Converts this PublishRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** PublishRequest topic. */
  @JSName("topic")
  var topic_PublishRequest: String = js.native
}
object PublishRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PublishRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PublishRequest instance
    */
  /* static member */
  inline def create(): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PublishRequest]
  inline def create(properties: IPublishRequest): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  
  /**
    * Decodes a PublishRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  inline def decode(reader: Reader, length: Double): PublishRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PublishRequest]
  inline def decode(reader: Uint8Array): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  inline def decode(reader: Uint8Array, length: Double): PublishRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PublishRequest]
  
  /**
    * Decodes a PublishRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PublishRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  inline def decodeDelimited(reader: Uint8Array): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  
  /**
    * Encodes the specified PublishRequest message. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPublishRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPublishRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PublishRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
    * @param message PublishRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPublishRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPublishRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PublishRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PublishRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): PublishRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PublishRequest]
  
  /**
    * Creates a plain object from a PublishRequest message. Also converts values to other types if specified.
    * @param message PublishRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PublishRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: PublishRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PublishRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
