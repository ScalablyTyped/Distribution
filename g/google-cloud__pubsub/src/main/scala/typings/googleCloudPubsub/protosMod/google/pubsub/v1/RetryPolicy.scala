package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RetryPolicy. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.RetryPolicy")
@js.native
/**
  * Constructs a new RetryPolicy.
  * @param [properties] Properties to set
  */
class RetryPolicy ()
  extends StObject
     with IRetryPolicy {
  def this(properties: IRetryPolicy) = this()
  
  /**
    * Converts this RetryPolicy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object RetryPolicy {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.RetryPolicy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RetryPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RetryPolicy instance
    */
  /* static member */
  inline def create(): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RetryPolicy]
  inline def create(properties: IRetryPolicy): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  inline def decode(reader: Reader, length: Double): RetryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RetryPolicy]
  inline def decode(reader: Uint8Array): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  inline def decode(reader: Uint8Array, length: Double): RetryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RetryPolicy]
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  inline def decodeDelimited(reader: Uint8Array): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  
  /**
    * Encodes the specified RetryPolicy message. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IRetryPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRetryPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RetryPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IRetryPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRetryPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RetryPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RetryPolicy
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RetryPolicy]
  
  /**
    * Creates a plain object from a RetryPolicy message. Also converts values to other types if specified.
    * @param message RetryPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RetryPolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: RetryPolicy, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a RetryPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
