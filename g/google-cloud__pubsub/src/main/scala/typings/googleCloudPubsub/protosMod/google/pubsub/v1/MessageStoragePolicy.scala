package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MessageStoragePolicy. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.MessageStoragePolicy")
@js.native
/**
  * Constructs a new MessageStoragePolicy.
  * @param [properties] Properties to set
  */
class MessageStoragePolicy ()
  extends StObject
     with IMessageStoragePolicy {
  def this(properties: IMessageStoragePolicy) = this()
  
  /** MessageStoragePolicy allowedPersistenceRegions. */
  @JSName("allowedPersistenceRegions")
  var allowedPersistenceRegions_MessageStoragePolicy: js.Array[String] = js.native
  
  /**
    * Converts this MessageStoragePolicy to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object MessageStoragePolicy {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.MessageStoragePolicy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new MessageStoragePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MessageStoragePolicy instance
    */
  /* static member */
  inline def create(): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageStoragePolicy]
  inline def create(properties: IMessageStoragePolicy): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  inline def decode(reader: Reader, length: Double): MessageStoragePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MessageStoragePolicy]
  inline def decode(reader: Uint8Array): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  inline def decode(reader: Uint8Array, length: Double): MessageStoragePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MessageStoragePolicy]
  
  /**
    * Decodes a MessageStoragePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MessageStoragePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  inline def decodeDelimited(reader: Uint8Array): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  
  /**
    * Encodes the specified MessageStoragePolicy message. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IMessageStoragePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IMessageStoragePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified MessageStoragePolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
    * @param message MessageStoragePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IMessageStoragePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IMessageStoragePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a MessageStoragePolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MessageStoragePolicy
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): MessageStoragePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MessageStoragePolicy]
  
  /**
    * Creates a plain object from a MessageStoragePolicy message. Also converts values to other types if specified.
    * @param message MessageStoragePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MessageStoragePolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: MessageStoragePolicy, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a MessageStoragePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
