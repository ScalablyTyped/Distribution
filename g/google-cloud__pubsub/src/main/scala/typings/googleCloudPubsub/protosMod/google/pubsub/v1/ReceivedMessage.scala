package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ReceivedMessage. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ReceivedMessage")
@js.native
/**
  * Constructs a new ReceivedMessage.
  * @param [properties] Properties to set
  */
class ReceivedMessage ()
  extends StObject
     with IReceivedMessage {
  def this(properties: IReceivedMessage) = this()
  
  /** ReceivedMessage ackId. */
  @JSName("ackId")
  var ackId_ReceivedMessage: String = js.native
  
  /** ReceivedMessage deliveryAttempt. */
  @JSName("deliveryAttempt")
  var deliveryAttempt_ReceivedMessage: Double = js.native
  
  /**
    * Converts this ReceivedMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object ReceivedMessage {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ReceivedMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ReceivedMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReceivedMessage instance
    */
  /* static member */
  @scala.inline
  def create(): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReceivedMessage]
  @scala.inline
  def create(properties: IReceivedMessage): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  @scala.inline
  def decode(reader: Reader, length: Double): ReceivedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReceivedMessage]
  @scala.inline
  def decode(reader: Uint8Array): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): ReceivedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReceivedMessage]
  
  /**
    * Decodes a ReceivedMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReceivedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  
  /**
    * Encodes the specified ReceivedMessage message. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IReceivedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IReceivedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ReceivedMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
    * @param message ReceivedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IReceivedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IReceivedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ReceivedMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReceivedMessage
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): ReceivedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ReceivedMessage]
  
  /**
    * Creates a plain object from a ReceivedMessage message. Also converts values to other types if specified.
    * @param message ReceivedMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: ReceivedMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: ReceivedMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a ReceivedMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
