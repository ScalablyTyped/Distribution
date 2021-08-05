package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetachSubscriptionResponse. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse")
@js.native
/**
  * Constructs a new DetachSubscriptionResponse.
  * @param [properties] Properties to set
  */
class DetachSubscriptionResponse ()
  extends StObject
     with IDetachSubscriptionResponse {
  def this(properties: IDetachSubscriptionResponse) = this()
  
  /**
    * Converts this DetachSubscriptionResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DetachSubscriptionResponse {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.DetachSubscriptionResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DetachSubscriptionResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetachSubscriptionResponse instance
    */
  /* static member */
  inline def create(): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DetachSubscriptionResponse]
  inline def create(properties: IDetachSubscriptionResponse): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  
  /**
    * Decodes a DetachSubscriptionResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetachSubscriptionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  inline def decode(reader: Reader, length: Double): DetachSubscriptionResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetachSubscriptionResponse]
  inline def decode(reader: Uint8Array): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  inline def decode(reader: Uint8Array, length: Double): DetachSubscriptionResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetachSubscriptionResponse]
  
  /**
    * Decodes a DetachSubscriptionResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetachSubscriptionResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  inline def decodeDelimited(reader: Uint8Array): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  
  /**
    * Encodes the specified DetachSubscriptionResponse message. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionResponse.verify|verify} messages.
    * @param message DetachSubscriptionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDetachSubscriptionResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDetachSubscriptionResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DetachSubscriptionResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.DetachSubscriptionResponse.verify|verify} messages.
    * @param message DetachSubscriptionResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDetachSubscriptionResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDetachSubscriptionResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DetachSubscriptionResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetachSubscriptionResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): DetachSubscriptionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DetachSubscriptionResponse]
  
  /**
    * Creates a plain object from a DetachSubscriptionResponse message. Also converts values to other types if specified.
    * @param message DetachSubscriptionResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DetachSubscriptionResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: DetachSubscriptionResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DetachSubscriptionResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
