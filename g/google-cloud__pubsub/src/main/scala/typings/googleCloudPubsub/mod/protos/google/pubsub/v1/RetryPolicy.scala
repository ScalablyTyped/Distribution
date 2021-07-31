package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IRetryPolicy
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RetryPolicy. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy")
@js.native
/**
  * Constructs a new RetryPolicy.
  * @param [properties] Properties to set
  */
class RetryPolicy ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy {
  def this(properties: IRetryPolicy) = this()
}
object RetryPolicy {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.RetryPolicy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RetryPolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RetryPolicy instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  @scala.inline
  def create(properties: IRetryPolicy): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  
  /**
    * Decodes a RetryPolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RetryPolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  
  /**
    * Encodes the specified RetryPolicy message. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IRetryPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IRetryPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RetryPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.RetryPolicy.verify|verify} messages.
    * @param message RetryPolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IRetryPolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IRetryPolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RetryPolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RetryPolicy
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy]
  
  /**
    * Creates a plain object from a RetryPolicy message. Also converts values to other types if specified.
    * @param message RetryPolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.RetryPolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a RetryPolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
