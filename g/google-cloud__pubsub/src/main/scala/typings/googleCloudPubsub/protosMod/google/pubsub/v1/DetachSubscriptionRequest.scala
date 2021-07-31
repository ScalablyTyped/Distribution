package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetachSubscriptionRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionRequest")
@js.native
/**
  * Constructs a new DetachSubscriptionRequest.
  * @param [properties] Properties to set
  */
class DetachSubscriptionRequest ()
  extends StObject
     with IDetachSubscriptionRequest {
  def this(properties: IDetachSubscriptionRequest) = this()
  
  /** DetachSubscriptionRequest subscription. */
  @JSName("subscription")
  var subscription_DetachSubscriptionRequest: String = js.native
  
  /**
    * Converts this DetachSubscriptionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DetachSubscriptionRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DetachSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetachSubscriptionRequest instance
    */
  /* static member */
  @scala.inline
  def create(): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DetachSubscriptionRequest]
  @scala.inline
  def create(properties: IDetachSubscriptionRequest): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  
  /**
    * Decodes a DetachSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetachSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  @scala.inline
  def decode(reader: Reader, length: Double): DetachSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetachSubscriptionRequest]
  @scala.inline
  def decode(reader: Uint8Array): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): DetachSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetachSubscriptionRequest]
  
  /**
    * Decodes a DetachSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetachSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  
  /**
    * Encodes the specified DetachSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionRequest.verify|verify} messages.
    * @param message DetachSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDetachSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDetachSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DetachSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionRequest.verify|verify} messages.
    * @param message DetachSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDetachSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDetachSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DetachSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetachSubscriptionRequest
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): DetachSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionRequest]
  
  /**
    * Creates a plain object from a DetachSubscriptionRequest message. Also converts values to other types if specified.
    * @param message DetachSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: DetachSubscriptionRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: DetachSubscriptionRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DetachSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
