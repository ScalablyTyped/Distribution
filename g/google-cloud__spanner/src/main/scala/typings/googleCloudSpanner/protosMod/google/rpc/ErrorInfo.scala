package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ErrorInfo. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.ErrorInfo")
@js.native
/**
  * Constructs a new ErrorInfo.
  * @param [properties] Properties to set
  */
open class ErrorInfo ()
  extends StObject
     with IErrorInfo {
  def this(properties: IErrorInfo) = this()
  
  /** ErrorInfo domain. */
  @JSName("domain")
  var domain_ErrorInfo: String = js.native
  
  /** ErrorInfo metadata. */
  @JSName("metadata")
  var metadata_ErrorInfo: StringDictionary[String] = js.native
  
  /** ErrorInfo reason. */
  @JSName("reason")
  var reason_ErrorInfo: String = js.native
  
  /**
    * Converts this ErrorInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ErrorInfo {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.ErrorInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ErrorInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ErrorInfo instance
    */
  /* static member */
  inline def create(): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ErrorInfo]
  inline def create(properties: IErrorInfo): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ErrorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ErrorInfo]
  /**
    * Decodes an ErrorInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ErrorInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  inline def decode(reader: Reader, length: Double): ErrorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ErrorInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  /**
    * Decodes an ErrorInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ErrorInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  
  /**
    * Encodes the specified ErrorInfo message. Does not implicitly {@link google.rpc.ErrorInfo.verify|verify} messages.
    * @param message ErrorInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IErrorInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IErrorInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ErrorInfo message, length delimited. Does not implicitly {@link google.rpc.ErrorInfo.verify|verify} messages.
    * @param message ErrorInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IErrorInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IErrorInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ErrorInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ErrorInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ErrorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ErrorInfo]
  
  /**
    * Gets the default type url for ErrorInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an ErrorInfo message. Also converts values to other types if specified.
    * @param message ErrorInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ErrorInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ErrorInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an ErrorInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
