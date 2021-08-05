package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetSubscriptionRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSubscriptionRequest")
@js.native
/**
  * Constructs a new GetSubscriptionRequest.
  * @param [properties] Properties to set
  */
class GetSubscriptionRequest ()
  extends StObject
     with IGetSubscriptionRequest {
  def this(properties: IGetSubscriptionRequest) = this()
  
  /** GetSubscriptionRequest subscription. */
  @JSName("subscription")
  var subscription_GetSubscriptionRequest: String = js.native
  
  /**
    * Converts this GetSubscriptionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object GetSubscriptionRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.GetSubscriptionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GetSubscriptionRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetSubscriptionRequest instance
    */
  /* static member */
  inline def create(): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetSubscriptionRequest]
  inline def create(properties: IGetSubscriptionRequest): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  inline def decode(reader: Reader, length: Double): GetSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetSubscriptionRequest]
  inline def decode(reader: Uint8Array): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  inline def decode(reader: Uint8Array, length: Double): GetSubscriptionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetSubscriptionRequest]
  
  /**
    * Decodes a GetSubscriptionRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetSubscriptionRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  inline def decodeDelimited(reader: Uint8Array): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  
  /**
    * Encodes the specified GetSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGetSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGetSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GetSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
    * @param message GetSubscriptionRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGetSubscriptionRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGetSubscriptionRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GetSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetSubscriptionRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): GetSubscriptionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetSubscriptionRequest]
  
  /**
    * Creates a plain object from a GetSubscriptionRequest message. Also converts values to other types if specified.
    * @param message GetSubscriptionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetSubscriptionRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: GetSubscriptionRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a GetSubscriptionRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
