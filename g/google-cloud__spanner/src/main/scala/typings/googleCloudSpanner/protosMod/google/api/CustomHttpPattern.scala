package typings.googleCloudSpanner.protosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CustomHttpPattern. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.api.CustomHttpPattern")
@js.native
/**
  * Constructs a new CustomHttpPattern.
  * @param [properties] Properties to set
  */
open class CustomHttpPattern ()
  extends StObject
     with ICustomHttpPattern {
  def this(properties: ICustomHttpPattern) = this()
  
  /** CustomHttpPattern kind. */
  @JSName("kind")
  var kind_CustomHttpPattern: String = js.native
  
  /** CustomHttpPattern path. */
  @JSName("path")
  var path_CustomHttpPattern: String = js.native
  
  /**
    * Converts this CustomHttpPattern to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CustomHttpPattern {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.api.CustomHttpPattern")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CustomHttpPattern instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CustomHttpPattern instance
    */
  /* static member */
  inline def create(): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CustomHttpPattern]
  inline def create(properties: ICustomHttpPattern): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  
  inline def decode(reader: js.typedarray.Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  inline def decode(reader: Reader, length: Double): CustomHttpPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CustomHttpPattern]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  /**
    * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CustomHttpPattern
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  
  /**
    * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
    * @param message CustomHttpPattern message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ICustomHttpPattern): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CustomHttpPattern
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
  
  /**
    * Gets the default type url for CustomHttpPattern
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
    * @param message CustomHttpPattern
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CustomHttpPattern): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a CustomHttpPattern message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
