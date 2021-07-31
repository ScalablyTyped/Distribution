package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PublishResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PublishResponse")
@js.native
/**
  * Constructs a new PublishResponse.
  * @param [properties] Properties to set
  */
class PublishResponse ()
  extends StObject
     with IPublishResponse {
  def this(properties: IPublishResponse) = this()
  
  /** PublishResponse messageIds. */
  @JSName("messageIds")
  var messageIds_PublishResponse: js.Array[String] = js.native
  
  /**
    * Converts this PublishResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PublishResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PublishResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PublishResponse instance
    */
  /* static member */
  @scala.inline
  def create(): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PublishResponse]
  @scala.inline
  def create(properties: IPublishResponse): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  
  /**
    * Decodes a PublishResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PublishResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  @scala.inline
  def decode(reader: Reader, length: Double): PublishResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PublishResponse]
  @scala.inline
  def decode(reader: Uint8Array): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PublishResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PublishResponse]
  
  /**
    * Decodes a PublishResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PublishResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  
  /**
    * Encodes the specified PublishResponse message. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
    * @param message PublishResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IPublishResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPublishResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PublishResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
    * @param message PublishResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IPublishResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPublishResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PublishResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PublishResponse
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PublishResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PublishResponse]
  
  /**
    * Creates a plain object from a PublishResponse message. Also converts values to other types if specified.
    * @param message PublishResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: PublishResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PublishResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PublishResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
