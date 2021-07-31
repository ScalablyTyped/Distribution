package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateSubscriptionRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateSubscriptionRequest")
@js.native
/**
  * Constructs a new UpdateSubscriptionRequest.
  * @param [properties] Properties to set
  */
class UpdateSubscriptionRequest ()
  extends StObject
     with IUpdateSubscriptionRequest {
  def this(properties: IUpdateSubscriptionRequest) = this()
  
  /**
    * Converts this UpdateSubscriptionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UpdateSubscriptionRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.UpdateSubscriptionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new UpdateSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UpdateSubscriptionRequest instance
    */
  /* static member */
  @scala.inline
  def create(): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UpdateSubscriptionRequest]
  @scala.inline
  def create(properties: IUpdateSubscriptionRequest): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  
  /**
    * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UpdateSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): UpdateSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSubscriptionRequest]
  @scala.inline
  def decode(reader: Uint8Array): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): UpdateSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UpdateSubscriptionRequest]
  
  /**
    * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UpdateSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  
  /**
    * Encodes the specified UpdateSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
    * @param message UpdateSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IUpdateSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IUpdateSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UpdateSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
    * @param message UpdateSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IUpdateSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IUpdateSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UpdateSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateSubscriptionRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): UpdateSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateSubscriptionRequest]
  
  /**
    * Creates a plain object from an UpdateSubscriptionRequest message. Also converts values to other types if specified.
    * @param message UpdateSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: UpdateSubscriptionRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: UpdateSubscriptionRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UpdateSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
