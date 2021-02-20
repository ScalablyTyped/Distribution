package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.FileOptions.OptimizeMode
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
class FileOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearCcEnableArenas(): FileOptions = js.native
  
  def clearCcGenericServices(): FileOptions = js.native
  
  def clearCsharpNamespace(): FileOptions = js.native
  
  def clearDeprecated(): FileOptions = js.native
  
  def clearGoPackage(): FileOptions = js.native
  
  def clearJavaGenerateEqualsAndHash(): FileOptions = js.native
  
  def clearJavaGenericServices(): FileOptions = js.native
  
  def clearJavaMultipleFiles(): FileOptions = js.native
  
  def clearJavaOuterClassname(): FileOptions = js.native
  
  def clearJavaPackage(): FileOptions = js.native
  
  def clearJavaStringCheckUtf8(): FileOptions = js.native
  
  def clearObjcClassPrefix(): FileOptions = js.native
  
  def clearOptimizeFor(): FileOptions = js.native
  
  def clearPhpClassPrefix(): FileOptions = js.native
  
  def clearPhpGenericServices(): FileOptions = js.native
  
  def clearPhpMetadataNamespace(): FileOptions = js.native
  
  def clearPhpNamespace(): FileOptions = js.native
  
  def clearPyGenericServices(): FileOptions = js.native
  
  def clearRubyPackage(): FileOptions = js.native
  
  def clearSwiftPrefix(): FileOptions = js.native
  
  def clearUninterpretedOptionList(): FileOptions = js.native
  
  def getCcEnableArenas(): js.UndefOr[Boolean] = js.native
  
  def getCcGenericServices(): js.UndefOr[Boolean] = js.native
  
  def getCsharpNamespace(): js.UndefOr[String] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getGoPackage(): js.UndefOr[String] = js.native
  
  def getJavaGenerateEqualsAndHash(): js.UndefOr[Boolean] = js.native
  
  def getJavaGenericServices(): js.UndefOr[Boolean] = js.native
  
  def getJavaMultipleFiles(): js.UndefOr[Boolean] = js.native
  
  def getJavaOuterClassname(): js.UndefOr[String] = js.native
  
  def getJavaPackage(): js.UndefOr[String] = js.native
  
  def getJavaStringCheckUtf8(): js.UndefOr[Boolean] = js.native
  
  def getObjcClassPrefix(): js.UndefOr[String] = js.native
  
  def getOptimizeFor(): js.UndefOr[OptimizeMode] = js.native
  
  def getPhpClassPrefix(): js.UndefOr[String] = js.native
  
  def getPhpGenericServices(): js.UndefOr[Boolean] = js.native
  
  def getPhpMetadataNamespace(): js.UndefOr[String] = js.native
  
  def getPhpNamespace(): js.UndefOr[String] = js.native
  
  def getPyGenericServices(): js.UndefOr[Boolean] = js.native
  
  def getRubyPackage(): js.UndefOr[String] = js.native
  
  def getSwiftPrefix(): js.UndefOr[String] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasCcEnableArenas(): Boolean = js.native
  
  def hasCcGenericServices(): Boolean = js.native
  
  def hasCsharpNamespace(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasGoPackage(): Boolean = js.native
  
  def hasJavaGenerateEqualsAndHash(): Boolean = js.native
  
  def hasJavaGenericServices(): Boolean = js.native
  
  def hasJavaMultipleFiles(): Boolean = js.native
  
  def hasJavaOuterClassname(): Boolean = js.native
  
  def hasJavaPackage(): Boolean = js.native
  
  def hasJavaStringCheckUtf8(): Boolean = js.native
  
  def hasObjcClassPrefix(): Boolean = js.native
  
  def hasOptimizeFor(): Boolean = js.native
  
  def hasPhpClassPrefix(): Boolean = js.native
  
  def hasPhpGenericServices(): Boolean = js.native
  
  def hasPhpMetadataNamespace(): Boolean = js.native
  
  def hasPhpNamespace(): Boolean = js.native
  
  def hasPyGenericServices(): Boolean = js.native
  
  def hasRubyPackage(): Boolean = js.native
  
  def hasSwiftPrefix(): Boolean = js.native
  
  def setCcEnableArenas(value: Boolean): FileOptions = js.native
  
  def setCcGenericServices(value: Boolean): FileOptions = js.native
  
  def setCsharpNamespace(value: String): FileOptions = js.native
  
  def setDeprecated(value: Boolean): FileOptions = js.native
  
  def setGoPackage(value: String): FileOptions = js.native
  
  def setJavaGenerateEqualsAndHash(value: Boolean): FileOptions = js.native
  
  def setJavaGenericServices(value: Boolean): FileOptions = js.native
  
  def setJavaMultipleFiles(value: Boolean): FileOptions = js.native
  
  def setJavaOuterClassname(value: String): FileOptions = js.native
  
  def setJavaPackage(value: String): FileOptions = js.native
  
  def setJavaStringCheckUtf8(value: Boolean): FileOptions = js.native
  
  def setObjcClassPrefix(value: String): FileOptions = js.native
  
  def setOptimizeFor(value: OptimizeMode): FileOptions = js.native
  
  def setPhpClassPrefix(value: String): FileOptions = js.native
  
  def setPhpGenericServices(value: Boolean): FileOptions = js.native
  
  def setPhpMetadataNamespace(value: String): FileOptions = js.native
  
  def setPhpNamespace(value: String): FileOptions = js.native
  
  def setPyGenericServices(value: Boolean): FileOptions = js.native
  
  def setRubyPackage(value: String): FileOptions = js.native
  
  def setSwiftPrefix(value: String): FileOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): FileOptions = js.native
}
/* static members */
object FileOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait OptimizeMode extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.OptimizeMode")
  @js.native
  object OptimizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
    
    @js.native
    sealed trait CODE_SIZE extends OptimizeMode
    /* 2 */ val CODE_SIZE: typings.googleProtobuf.descriptorPbMod.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
    
    @js.native
    sealed trait LITE_RUNTIME extends OptimizeMode
    /* 3 */ val LITE_RUNTIME: typings.googleProtobuf.descriptorPbMod.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
    
    @js.native
    sealed trait SPEED extends OptimizeMode
    /* 1 */ val SPEED: typings.googleProtobuf.descriptorPbMod.FileOptions.OptimizeMode.SPEED with Double = js.native
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): FileOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: FileOptions, reader: BinaryReader): FileOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: FileOptions, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: FileOptions): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var ccEnableArenas: js.UndefOr[Boolean] = js.native
    
    var ccGenericServices: js.UndefOr[Boolean] = js.native
    
    var csharpNamespace: js.UndefOr[String] = js.native
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var goPackage: js.UndefOr[String] = js.native
    
    var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.native
    
    var javaGenericServices: js.UndefOr[Boolean] = js.native
    
    var javaMultipleFiles: js.UndefOr[Boolean] = js.native
    
    var javaOuterClassname: js.UndefOr[String] = js.native
    
    var javaPackage: js.UndefOr[String] = js.native
    
    var javaStringCheckUtf8: js.UndefOr[Boolean] = js.native
    
    var objcClassPrefix: js.UndefOr[String] = js.native
    
    var optimizeFor: js.UndefOr[OptimizeMode] = js.native
    
    var phpClassPrefix: js.UndefOr[String] = js.native
    
    var phpGenericServices: js.UndefOr[Boolean] = js.native
    
    var phpMetadataNamespace: js.UndefOr[String] = js.native
    
    var phpNamespace: js.UndefOr[String] = js.native
    
    var pyGenericServices: js.UndefOr[Boolean] = js.native
    
    var rubyPackage: js.UndefOr[String] = js.native
    
    var swiftPrefix: js.UndefOr[String] = js.native
    
    var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCcEnableArenas(value: Boolean): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
      
      @scala.inline
      def setCcGenericServices(value: Boolean): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
      
      @scala.inline
      def setCsharpNamespace(value: String): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setGoPackage(value: String): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
      
      @scala.inline
      def setJavaGenerateEqualsAndHash(value: Boolean): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
      
      @scala.inline
      def setJavaGenericServices(value: Boolean): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
      
      @scala.inline
      def setJavaMultipleFiles(value: Boolean): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
      
      @scala.inline
      def setJavaOuterClassname(value: String): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
      
      @scala.inline
      def setJavaPackage(value: String): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
      
      @scala.inline
      def setJavaStringCheckUtf8(value: Boolean): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
      
      @scala.inline
      def setObjcClassPrefix(value: String): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
      
      @scala.inline
      def setOptimizeFor(value: OptimizeMode): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
      
      @scala.inline
      def setPhpClassPrefix(value: String): Self = StObject.set(x, "phpClassPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhpClassPrefixUndefined: Self = StObject.set(x, "phpClassPrefix", js.undefined)
      
      @scala.inline
      def setPhpGenericServices(value: Boolean): Self = StObject.set(x, "phpGenericServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhpGenericServicesUndefined: Self = StObject.set(x, "phpGenericServices", js.undefined)
      
      @scala.inline
      def setPhpMetadataNamespace(value: String): Self = StObject.set(x, "phpMetadataNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhpMetadataNamespaceUndefined: Self = StObject.set(x, "phpMetadataNamespace", js.undefined)
      
      @scala.inline
      def setPhpNamespace(value: String): Self = StObject.set(x, "phpNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhpNamespaceUndefined: Self = StObject.set(x, "phpNamespace", js.undefined)
      
      @scala.inline
      def setPyGenericServices(value: Boolean): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
      
      @scala.inline
      def setRubyPackage(value: String): Self = StObject.set(x, "rubyPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyPackageUndefined: Self = StObject.set(x, "rubyPackage", js.undefined)
      
      @scala.inline
      def setSwiftPrefix(value: String): Self = StObject.set(x, "swiftPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwiftPrefixUndefined: Self = StObject.set(x, "swiftPrefix", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
    }
  }
}
