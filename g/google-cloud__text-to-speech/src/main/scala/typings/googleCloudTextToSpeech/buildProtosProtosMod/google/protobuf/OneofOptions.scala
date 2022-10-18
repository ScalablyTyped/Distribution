package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofOptions. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.OneofOptions")
@js.native
/**
  * Constructs a new OneofOptions.
  * @param [properties] Properties to set
  */
open class OneofOptions ()
  extends StObject
     with IOneofOptions {
  def this(properties: IOneofOptions) = this()
  
  /**
    * Converts this OneofOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** OneofOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_OneofOptions: js.Array[IUninterpretedOption] = js.native
}
object OneofOptions {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.OneofOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OneofOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OneofOptions instance
    */
  /* static member */
  inline def create(): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OneofOptions]
  inline def create(properties: IOneofOptions): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): OneofOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OneofOptions]
  /**
    * Decodes an OneofOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  inline def decode(reader: Reader, length: Double): OneofOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OneofOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  /**
    * Decodes an OneofOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OneofOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  
  /**
    * Encodes the specified OneofOptions message. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IOneofOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IOneofOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified OneofOptions message, length delimited. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
    * @param message OneofOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IOneofOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IOneofOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  
  /**
    * Gets the default type url for OneofOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
    * @param message OneofOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OneofOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: OneofOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an OneofOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
