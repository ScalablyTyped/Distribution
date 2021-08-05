package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ModifyAckDeadlineRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ModifyAckDeadlineRequest")
@js.native
/**
  * Constructs a new ModifyAckDeadlineRequest.
  * @param [properties] Properties to set
  */
class ModifyAckDeadlineRequest ()
  extends StObject
     with IModifyAckDeadlineRequest {
  def this(properties: IModifyAckDeadlineRequest) = this()
  
  /** ModifyAckDeadlineRequest ackDeadlineSeconds. */
  @JSName("ackDeadlineSeconds")
  var ackDeadlineSeconds_ModifyAckDeadlineRequest: Double = js.native
  
  /** ModifyAckDeadlineRequest ackIds. */
  @JSName("ackIds")
  var ackIds_ModifyAckDeadlineRequest: js.Array[String] = js.native
  
  /** ModifyAckDeadlineRequest subscription. */
  @JSName("subscription")
  var subscription_ModifyAckDeadlineRequest: String = js.native
  
  /**
    * Converts this ModifyAckDeadlineRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ModifyAckDeadlineRequest {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ModifyAckDeadlineRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ModifyAckDeadlineRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ModifyAckDeadlineRequest instance
    */
  /* static member */
  inline def create(): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ModifyAckDeadlineRequest]
  inline def create(properties: IModifyAckDeadlineRequest): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  inline def decode(reader: Reader, length: Double): ModifyAckDeadlineRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ModifyAckDeadlineRequest]
  inline def decode(reader: Uint8Array): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  inline def decode(reader: Uint8Array, length: Double): ModifyAckDeadlineRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ModifyAckDeadlineRequest]
  
  /**
    * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ModifyAckDeadlineRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  inline def decodeDelimited(reader: Uint8Array): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  
  /**
    * Encodes the specified ModifyAckDeadlineRequest message. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IModifyAckDeadlineRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IModifyAckDeadlineRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ModifyAckDeadlineRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
    * @param message ModifyAckDeadlineRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IModifyAckDeadlineRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IModifyAckDeadlineRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ModifyAckDeadlineRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ModifyAckDeadlineRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): ModifyAckDeadlineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ModifyAckDeadlineRequest]
  
  /**
    * Creates a plain object from a ModifyAckDeadlineRequest message. Also converts values to other types if specified.
    * @param message ModifyAckDeadlineRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ModifyAckDeadlineRequest): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: ModifyAckDeadlineRequest, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ModifyAckDeadlineRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
