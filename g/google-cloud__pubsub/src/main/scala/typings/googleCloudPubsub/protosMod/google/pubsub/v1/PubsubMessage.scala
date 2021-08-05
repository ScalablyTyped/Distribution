package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PubsubMessage. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PubsubMessage")
@js.native
/**
  * Constructs a new PubsubMessage.
  * @param [properties] Properties to set
  */
class PubsubMessage ()
  extends StObject
     with IPubsubMessage {
  def this(properties: IPubsubMessage) = this()
  
  /** PubsubMessage attributes. */
  @JSName("attributes")
  var attributes_PubsubMessage: StringDictionary[String] = js.native
  
  /** PubsubMessage data. */
  @JSName("data")
  var data_PubsubMessage: Uint8Array | String = js.native
  
  /** PubsubMessage messageId. */
  @JSName("messageId")
  var messageId_PubsubMessage: String = js.native
  
  /** PubsubMessage orderingKey. */
  @JSName("orderingKey")
  var orderingKey_PubsubMessage: String = js.native
  
  /**
    * Converts this PubsubMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PubsubMessage {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.PubsubMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PubsubMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PubsubMessage instance
    */
  /* static member */
  inline def create(): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PubsubMessage]
  inline def create(properties: IPubsubMessage): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  inline def decode(reader: Reader, length: Double): PubsubMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PubsubMessage]
  inline def decode(reader: Uint8Array): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  inline def decode(reader: Uint8Array, length: Double): PubsubMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PubsubMessage]
  
  /**
    * Decodes a PubsubMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PubsubMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  inline def decodeDelimited(reader: Uint8Array): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  
  /**
    * Encodes the specified PubsubMessage message. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPubsubMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPubsubMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PubsubMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
    * @param message PubsubMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPubsubMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPubsubMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PubsubMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PubsubMessage
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): PubsubMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PubsubMessage]
  
  /**
    * Creates a plain object from a PubsubMessage message. Also converts values to other types if specified.
    * @param message PubsubMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PubsubMessage): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: PubsubMessage, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PubsubMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
