package typings.googleCloudPubsub.mod.protos.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISubscription
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Subscription. */
@JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscription")
@js.native
/**
  * Constructs a new Subscription.
  * @param [properties] Properties to set
  */
class Subscription ()
  extends typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription {
  def this(properties: ISubscription) = this()
}
object Subscription {
  
  @JSImport("@google-cloud/pubsub", "protos.google.pubsub.v1.Subscription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Subscription instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Subscription instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  @scala.inline
  def create(properties: ISubscription): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  
  /**
    * Decodes a Subscription message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  
  /**
    * Decodes a Subscription message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Subscription
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  
  /**
    * Encodes the specified Subscription message. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: ISubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ISubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Subscription message, length delimited. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
    * @param message Subscription message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: ISubscription): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ISubscription, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Subscription message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Subscription
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription]
  
  /**
    * Creates a plain object from a Subscription message. Also converts values to other types if specified.
    * @param message Subscription
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Subscription,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Subscription message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
