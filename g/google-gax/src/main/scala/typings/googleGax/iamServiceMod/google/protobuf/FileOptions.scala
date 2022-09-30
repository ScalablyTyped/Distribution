package typings.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.FileOptions.OptimizeMode
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileOptions. */
@JSImport("google-gax/build/protos/iam_service", "google.protobuf.FileOptions")
@js.native
/**
  * Constructs a new FileOptions.
  * @param [properties] Properties to set
  */
open class FileOptions ()
  extends StObject
     with IFileOptions {
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
  
  /**
    * Converts this FileOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** FileOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FileOptions: js.Array[IUninterpretedOption] = js.native
}
object FileOptions {
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.FileOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait OptimizeMode extends StObject
  /** OptimizeMode enum. */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.FileOptions.OptimizeMode")
  @js.native
  object OptimizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeMode & Double] = js.native
    
    @js.native
    sealed trait CODE_SIZE
      extends StObject
         with OptimizeMode
    /* 2 */ val CODE_SIZE: typings.googleGax.iamServiceMod.google.protobuf.FileOptions.OptimizeMode.CODE_SIZE & Double = js.native
    
    @js.native
    sealed trait LITE_RUNTIME
      extends StObject
         with OptimizeMode
    /* 3 */ val LITE_RUNTIME: typings.googleGax.iamServiceMod.google.protobuf.FileOptions.OptimizeMode.LITE_RUNTIME & Double = js.native
    
    @js.native
    sealed trait SPEED
      extends StObject
         with OptimizeMode
    /* 1 */ val SPEED: typings.googleGax.iamServiceMod.google.protobuf.FileOptions.OptimizeMode.SPEED & Double = js.native
  }
  
  /**
    * Creates a new FileOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileOptions instance
    */
  /* static member */
  inline def create(): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FileOptions]
  inline def create(properties: IFileOptions): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): FileOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileOptions]
  /**
    * Decodes a FileOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  inline def decode(reader: Reader, length: Double): FileOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  /**
    * Decodes a FileOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  
  /**
    * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IFileOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IFileOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
    * @param message FileOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IFileOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IFileOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FileOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: FileOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a FileOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
