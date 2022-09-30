package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.FileOptions.OptimizeMode
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileOptions")
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
  
  /** FileOptions pyGenericServices. */
  @JSName("pyGenericServices")
  var pyGenericServices_FileOptions: Boolean = js.native
  
  /**
    * Converts this FileOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FileOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FileOptions: js.Array[IUninterpretedOption] = js.native
}
object FileOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  
  /**
    * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
    * @param message FileOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FileOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FileOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** OptimizeMode enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.SPEED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.CODE_SIZE
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.LITE_RUNTIME
  */
  trait OptimizeMode extends StObject
  object OptimizeMode {
    
    inline def CODE_SIZE: typings.googleCloudFirestore.googleCloudFirestoreStrings.CODE_SIZE = "CODE_SIZE".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.CODE_SIZE]
    
    inline def LITE_RUNTIME: typings.googleCloudFirestore.googleCloudFirestoreStrings.LITE_RUNTIME = "LITE_RUNTIME".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.LITE_RUNTIME]
    
    inline def SPEED: typings.googleCloudFirestore.googleCloudFirestoreStrings.SPEED = "SPEED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.SPEED]
  }
}
