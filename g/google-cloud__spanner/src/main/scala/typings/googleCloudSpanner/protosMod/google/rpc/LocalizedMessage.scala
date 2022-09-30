package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a LocalizedMessage. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.LocalizedMessage")
@js.native
/**
  * Constructs a new LocalizedMessage.
  * @param [properties] Properties to set
  */
open class LocalizedMessage ()
  extends StObject
     with ILocalizedMessage {
  def this(properties: ILocalizedMessage) = this()
  
  /** LocalizedMessage locale. */
  @JSName("locale")
  var locale_LocalizedMessage: String = js.native
  
  /** LocalizedMessage message. */
  @JSName("message")
  var message_LocalizedMessage: String = js.native
  
  /**
    * Converts this LocalizedMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object LocalizedMessage {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.LocalizedMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new LocalizedMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns LocalizedMessage instance
    */
  /* static member */
  inline def create(): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LocalizedMessage]
  inline def create(properties: ILocalizedMessage): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  
  inline def decode(reader: js.typedarray.Uint8Array): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): LocalizedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LocalizedMessage]
  /**
    * Decodes a LocalizedMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns LocalizedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  inline def decode(reader: Reader, length: Double): LocalizedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LocalizedMessage]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  /**
    * Decodes a LocalizedMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns LocalizedMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  
  /**
    * Encodes the specified LocalizedMessage message. Does not implicitly {@link google.rpc.LocalizedMessage.verify|verify} messages.
    * @param message LocalizedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ILocalizedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ILocalizedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified LocalizedMessage message, length delimited. Does not implicitly {@link google.rpc.LocalizedMessage.verify|verify} messages.
    * @param message LocalizedMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ILocalizedMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ILocalizedMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a LocalizedMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns LocalizedMessage
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): LocalizedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LocalizedMessage]
  
  /**
    * Gets the default type url for LocalizedMessage
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a LocalizedMessage message. Also converts values to other types if specified.
    * @param message LocalizedMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: LocalizedMessage): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: LocalizedMessage, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a LocalizedMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
