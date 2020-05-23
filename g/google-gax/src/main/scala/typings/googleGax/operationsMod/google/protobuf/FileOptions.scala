package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.googleGax.operationsMod.google.protobuf.FileOptions.OptimizeMode
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a FileOptions. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
class FileOptions () extends IFileOptions {
  def this(properties: IFileOptions) = this()
  /** FileOptions ccEnableArenas. */
  @JSName("ccEnableArenas")
  var ccEnableArenas_FileOptions: Boolean = js.native
  /** FileOptions ccGenericServices. */
  @JSName("ccGenericServices")
  var ccGenericServices_FileOptions: Boolean = js.native
  /** FileOptions csharpNamespace. */
  @JSName("csharpNamespace")
  var csharpNamespace_FileOptions: String = js.native
  /** FileOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FileOptions: Boolean = js.native
  /** FileOptions goPackage. */
  @JSName("goPackage")
  var goPackage_FileOptions: String = js.native
  /** FileOptions javaGenerateEqualsAndHash. */
  @JSName("javaGenerateEqualsAndHash")
  var javaGenerateEqualsAndHash_FileOptions: Boolean = js.native
  /** FileOptions javaGenericServices. */
  @JSName("javaGenericServices")
  var javaGenericServices_FileOptions: Boolean = js.native
  /** FileOptions javaMultipleFiles. */
  @JSName("javaMultipleFiles")
  var javaMultipleFiles_FileOptions: Boolean = js.native
  /** FileOptions javaOuterClassname. */
  @JSName("javaOuterClassname")
  var javaOuterClassname_FileOptions: String = js.native
  /** FileOptions javaPackage. */
  @JSName("javaPackage")
  var javaPackage_FileOptions: String = js.native
  /** FileOptions javaStringCheckUtf8. */
  @JSName("javaStringCheckUtf8")
  var javaStringCheckUtf8_FileOptions: Boolean = js.native
  /** FileOptions objcClassPrefix. */
  @JSName("objcClassPrefix")
  var objcClassPrefix_FileOptions: String = js.native
  /** FileOptions optimizeFor. */
  @JSName("optimizeFor")
  var optimizeFor_FileOptions: OptimizeMode = js.native
  /** FileOptions phpClassPrefix. */
  @JSName("phpClassPrefix")
  var phpClassPrefix_FileOptions: String = js.native
  /** FileOptions phpGenericServices. */
  @JSName("phpGenericServices")
  var phpGenericServices_FileOptions: Boolean = js.native
  /** FileOptions phpMetadataNamespace. */
  @JSName("phpMetadataNamespace")
  var phpMetadataNamespace_FileOptions: String = js.native
  /** FileOptions phpNamespace. */
  @JSName("phpNamespace")
  var phpNamespace_FileOptions: String = js.native
  /** FileOptions pyGenericServices. */
  @JSName("pyGenericServices")
  var pyGenericServices_FileOptions: Boolean = js.native
  /** FileOptions rubyPackage. */
  @JSName("rubyPackage")
  var rubyPackage_FileOptions: String = js.native
  /** FileOptions swiftPrefix. */
  @JSName("swiftPrefix")
  var swiftPrefix_FileOptions: String = js.native
  /** FileOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FileOptions: js.Array[IUninterpretedOption] = js.native
  /**
    * Converts this FileOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("google-gax/build/protos/operations", "google.protobuf.FileOptions")
@js.native
object FileOptions extends js.Object {
  @js.native
  sealed trait OptimizeMode extends js.Object
  
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  def create(): FileOptions = js.native
  def create(properties: IFileOptions): FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): FileOptions = js.native
  def decode(reader: Reader, length: Double): FileOptions = js.native
  def decode(reader: Uint8Array): FileOptions = js.native
  def decode(reader: Uint8Array, length: Double): FileOptions = js.native
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): FileOptions = js.native
  def decodeDelimited(reader: Uint8Array): FileOptions = js.native
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFileOptions): Writer = js.native
  def encode(message: IFileOptions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFileOptions): Writer = js.native
  def encodeDelimited(message: IFileOptions, writer: Writer): Writer = js.native
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  def fromObject(`object`: StringDictionary[js.Any]): FileOptions = js.native
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: FileOptions): StringDictionary[js.Any] = js.native
  def toObject(message: FileOptions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** OptimizeMode enum. */
  @js.native
  object OptimizeMode extends js.Object {
    @js.native
    sealed trait CODE_SIZE extends OptimizeMode
    
    @js.native
    sealed trait LITE_RUNTIME extends OptimizeMode
    
    @js.native
    sealed trait SPEED extends OptimizeMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
    /* 2 */ @js.native
    object CODE_SIZE extends TopLevel[CODE_SIZE with Double]
    
    /* 3 */ @js.native
    object LITE_RUNTIME extends TopLevel[LITE_RUNTIME with Double]
    
    /* 1 */ @js.native
    object SPEED extends TopLevel[SPEED with Double]
    
  }
  
}

