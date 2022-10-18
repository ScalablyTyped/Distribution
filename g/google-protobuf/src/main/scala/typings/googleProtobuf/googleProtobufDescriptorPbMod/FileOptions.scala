package typings.googleProtobuf.googleProtobufDescriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.OptimizeMode
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
open class FileOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
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
    def apply(value: Double): js.UndefOr[OptimizeMode & Double] = js.native
    
    @js.native
    sealed trait CODE_SIZE
      extends StObject
         with OptimizeMode
    /* 2 */ val CODE_SIZE: typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.OptimizeMode.CODE_SIZE & Double = js.native
    
    @js.native
    sealed trait LITE_RUNTIME
      extends StObject
         with OptimizeMode
    /* 3 */ val LITE_RUNTIME: typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.OptimizeMode.LITE_RUNTIME & Double = js.native
    
    @js.native
    sealed trait SPEED
      extends StObject
         with OptimizeMode
    /* 1 */ val SPEED: typings.googleProtobuf.googleProtobufDescriptorPbMod.FileOptions.OptimizeMode.SPEED & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): FileOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FileOptions]
  
  inline def deserializeBinaryFromReader(message: FileOptions, reader: BinaryReader): FileOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FileOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: FileOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: FileOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var ccEnableArenas: js.UndefOr[Boolean] = js.undefined
    
    var ccGenericServices: js.UndefOr[Boolean] = js.undefined
    
    var csharpNamespace: js.UndefOr[String] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var goPackage: js.UndefOr[String] = js.undefined
    
    var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined
    
    var javaGenericServices: js.UndefOr[Boolean] = js.undefined
    
    var javaMultipleFiles: js.UndefOr[Boolean] = js.undefined
    
    var javaOuterClassname: js.UndefOr[String] = js.undefined
    
    var javaPackage: js.UndefOr[String] = js.undefined
    
    var javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined
    
    var objcClassPrefix: js.UndefOr[String] = js.undefined
    
    var optimizeFor: js.UndefOr[OptimizeMode] = js.undefined
    
    var phpClassPrefix: js.UndefOr[String] = js.undefined
    
    var phpGenericServices: js.UndefOr[Boolean] = js.undefined
    
    var phpMetadataNamespace: js.UndefOr[String] = js.undefined
    
    var phpNamespace: js.UndefOr[String] = js.undefined
    
    var pyGenericServices: js.UndefOr[Boolean] = js.undefined
    
    var rubyPackage: js.UndefOr[String] = js.undefined
    
    var swiftPrefix: js.UndefOr[String] = js.undefined
    
    var uninterpretedOptionList: js.Array[
        typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[
          typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setCcEnableArenas(value: Boolean): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
      
      inline def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
      
      inline def setCcGenericServices(value: Boolean): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
      
      inline def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
      
      inline def setCsharpNamespace(value: String): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
      
      inline def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setGoPackage(value: String): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
      
      inline def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
      
      inline def setJavaGenerateEqualsAndHash(value: Boolean): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
      
      inline def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
      
      inline def setJavaGenericServices(value: Boolean): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
      
      inline def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
      
      inline def setJavaMultipleFiles(value: Boolean): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
      
      inline def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
      
      inline def setJavaOuterClassname(value: String): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
      
      inline def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
      
      inline def setJavaPackage(value: String): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
      
      inline def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
      
      inline def setJavaStringCheckUtf8(value: Boolean): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
      
      inline def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
      
      inline def setObjcClassPrefix(value: String): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
      
      inline def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
      
      inline def setOptimizeFor(value: OptimizeMode): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
      
      inline def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
      
      inline def setPhpClassPrefix(value: String): Self = StObject.set(x, "phpClassPrefix", value.asInstanceOf[js.Any])
      
      inline def setPhpClassPrefixUndefined: Self = StObject.set(x, "phpClassPrefix", js.undefined)
      
      inline def setPhpGenericServices(value: Boolean): Self = StObject.set(x, "phpGenericServices", value.asInstanceOf[js.Any])
      
      inline def setPhpGenericServicesUndefined: Self = StObject.set(x, "phpGenericServices", js.undefined)
      
      inline def setPhpMetadataNamespace(value: String): Self = StObject.set(x, "phpMetadataNamespace", value.asInstanceOf[js.Any])
      
      inline def setPhpMetadataNamespaceUndefined: Self = StObject.set(x, "phpMetadataNamespace", js.undefined)
      
      inline def setPhpNamespace(value: String): Self = StObject.set(x, "phpNamespace", value.asInstanceOf[js.Any])
      
      inline def setPhpNamespaceUndefined: Self = StObject.set(x, "phpNamespace", js.undefined)
      
      inline def setPyGenericServices(value: Boolean): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
      
      inline def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
      
      inline def setRubyPackage(value: String): Self = StObject.set(x, "rubyPackage", value.asInstanceOf[js.Any])
      
      inline def setRubyPackageUndefined: Self = StObject.set(x, "rubyPackage", js.undefined)
      
      inline def setSwiftPrefix(value: String): Self = StObject.set(x, "swiftPrefix", value.asInstanceOf[js.Any])
      
      inline def setSwiftPrefixUndefined: Self = StObject.set(x, "swiftPrefix", js.undefined)
      
      inline def setUninterpretedOptionList(
        value: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
            ]
      ): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value*))
    }
  }
}
