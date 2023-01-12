package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File
import typings.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleProtobufCompilerPluginPbMod {
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
  @js.native
  open class CodeGeneratorRequest () extends Message {
    
    def addFileToGenerate(value: String): String = js.native
    def addFileToGenerate(value: String, index: Double): String = js.native
    
    def addProtoFile(): FileDescriptorProto = js.native
    def addProtoFile(value: Unit, index: Double): FileDescriptorProto = js.native
    def addProtoFile(value: FileDescriptorProto): FileDescriptorProto = js.native
    def addProtoFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
    
    def clearCompilerVersion(): CodeGeneratorRequest = js.native
    
    def clearFileToGenerateList(): CodeGeneratorRequest = js.native
    
    def clearParameter(): CodeGeneratorRequest = js.native
    
    def clearProtoFileList(): CodeGeneratorRequest = js.native
    
    def getCompilerVersion(): js.UndefOr[Version] = js.native
    
    def getFileToGenerateList(): js.Array[String] = js.native
    
    def getParameter(): js.UndefOr[String] = js.native
    
    def getProtoFileList(): js.Array[FileDescriptorProto] = js.native
    
    def hasCompilerVersion(): Boolean = js.native
    
    def hasParameter(): Boolean = js.native
    
    def setCompilerVersion(): CodeGeneratorRequest = js.native
    def setCompilerVersion(value: Version): CodeGeneratorRequest = js.native
    
    def setFileToGenerateList(value: js.Array[String]): CodeGeneratorRequest = js.native
    
    def setParameter(value: String): CodeGeneratorRequest = js.native
    
    def setProtoFileList(value: js.Array[FileDescriptorProto]): CodeGeneratorRequest = js.native
  }
  /* static members */
  object CodeGeneratorRequest {
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): CodeGeneratorRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorRequest]
    
    inline def deserializeBinaryFromReader(message: CodeGeneratorRequest, reader: BinaryReader): CodeGeneratorRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorRequest]
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: CodeGeneratorRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: CodeGeneratorRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var compilerVersion: js.UndefOr[typings.googleProtobuf.googleProtobufCompilerPluginPbMod.Version.AsObject] = js.undefined
      
      var fileToGenerateList: js.Array[String]
      
      var parameter: js.UndefOr[String] = js.undefined
      
      var protoFileList: js.Array[
            typings.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto.AsObject
          ]
    }
    object AsObject {
      
      inline def apply(
        fileToGenerateList: js.Array[String],
        protoFileList: js.Array[
              typings.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto.AsObject
            ]
      ): AsObject = {
        val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList.asInstanceOf[js.Any], protoFileList = protoFileList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        inline def setCompilerVersion(value: typings.googleProtobuf.googleProtobufCompilerPluginPbMod.Version.AsObject): Self = StObject.set(x, "compilerVersion", value.asInstanceOf[js.Any])
        
        inline def setCompilerVersionUndefined: Self = StObject.set(x, "compilerVersion", js.undefined)
        
        inline def setFileToGenerateList(value: js.Array[String]): Self = StObject.set(x, "fileToGenerateList", value.asInstanceOf[js.Any])
        
        inline def setFileToGenerateListVarargs(value: String*): Self = StObject.set(x, "fileToGenerateList", js.Array(value*))
        
        inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        inline def setProtoFileList(
          value: js.Array[
                  typings.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto.AsObject
                ]
        ): Self = StObject.set(x, "protoFileList", value.asInstanceOf[js.Any])
        
        inline def setProtoFileListVarargs(value: typings.googleProtobuf.googleProtobufDescriptorPbMod.FileDescriptorProto.AsObject*): Self = StObject.set(x, "protoFileList", js.Array(value*))
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
  @js.native
  open class CodeGeneratorResponse () extends Message {
    
    def addFile(): File = js.native
    def addFile(value: Unit, index: Double): File = js.native
    def addFile(value: File): File = js.native
    def addFile(value: File, index: Double): File = js.native
    
    def clearError(): CodeGeneratorResponse = js.native
    
    def clearFileList(): CodeGeneratorResponse = js.native
    
    def clearSupportedFeatures(): CodeGeneratorResponse = js.native
    
    def getError(): js.UndefOr[String] = js.native
    
    def getFileList(): js.Array[File] = js.native
    
    def getSupportedFeatures(): js.UndefOr[Double] = js.native
    
    def hasError(): Boolean = js.native
    
    def hasSupportedFeatures(): Boolean = js.native
    
    def setError(value: String): CodeGeneratorResponse = js.native
    
    def setFileList(value: js.Array[File]): CodeGeneratorResponse = js.native
    
    def setSupportedFeatures(value: Double): CodeGeneratorResponse = js.native
  }
  /* static members */
  object CodeGeneratorResponse {
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Feature extends StObject
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.Feature")
    @js.native
    object Feature extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Feature & Double] = js.native
      
      @js.native
      sealed trait FEATURE_NONE
        extends StObject
           with Feature
      /* 0 */ val FEATURE_NONE: typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.Feature.FEATURE_NONE & Double = js.native
      
      @js.native
      sealed trait FEATURE_PROTO3_OPTIONAL
        extends StObject
           with Feature
      /* 1 */ val FEATURE_PROTO3_OPTIONAL: typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.Feature.FEATURE_PROTO3_OPTIONAL & Double = js.native
    }
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File")
    @js.native
    open class File () extends Message {
      
      def clearContent(): File = js.native
      
      def clearInsertionPoint(): File = js.native
      
      def clearName(): File = js.native
      
      def getContent(): js.UndefOr[String] = js.native
      
      def getInsertionPoint(): js.UndefOr[String] = js.native
      
      def getName(): js.UndefOr[String] = js.native
      
      def hasContent(): Boolean = js.native
      
      def hasInsertionPoint(): Boolean = js.native
      
      def hasName(): Boolean = js.native
      
      def setContent(value: String): File = js.native
      
      def setInsertionPoint(value: String): File = js.native
      
      def setName(value: String): File = js.native
    }
    /* static members */
    object File {
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File")
      @js.native
      val ^ : js.Any = js.native
      
      inline def deserializeBinary(bytes: js.typedarray.Uint8Array): File = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[File]
      
      inline def deserializeBinaryFromReader(message: File, reader: BinaryReader): File = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[File]
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.extensions")
      @js.native
      def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.extensionsBinary")
      @js.native
      def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
      inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
      
      inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
      
      inline def serializeBinaryToWriter(message: File, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def toObject(includeInstance: Boolean, msg: File): typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject]
      
      trait AsObject extends StObject {
        
        var content: js.UndefOr[String] = js.undefined
        
        var insertionPoint: js.UndefOr[String] = js.undefined
        
        var name: js.UndefOr[String] = js.undefined
      }
      object AsObject {
        
        inline def apply(): typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject] (val x: Self) extends AnyVal {
          
          inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
          
          inline def setInsertionPoint(value: String): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
          
          inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
    }
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): CodeGeneratorResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponse]
    
    inline def deserializeBinaryFromReader(message: CodeGeneratorResponse, reader: BinaryReader): CodeGeneratorResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponse]
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: CodeGeneratorResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: CodeGeneratorResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var error: js.UndefOr[String] = js.undefined
      
      var fileList: js.Array[
            typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject
          ]
      
      var supportedFeatures: js.UndefOr[Double] = js.undefined
    }
    object AsObject {
      
      inline def apply(
        fileList: js.Array[
              typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject
            ]
      ): AsObject = {
        val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setFileList(
          value: js.Array[
                  typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject
                ]
        ): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
        
        inline def setFileListVarargs(
          value: typings.googleProtobuf.googleProtobufCompilerPluginPbMod.CodeGeneratorResponse.File.AsObject*
        ): Self = StObject.set(x, "fileList", js.Array(value*))
        
        inline def setSupportedFeatures(value: Double): Self = StObject.set(x, "supportedFeatures", value.asInstanceOf[js.Any])
        
        inline def setSupportedFeaturesUndefined: Self = StObject.set(x, "supportedFeatures", js.undefined)
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
  @js.native
  open class Version () extends Message {
    
    def clearMajor(): Version = js.native
    
    def clearMinor(): Version = js.native
    
    def clearPatch(): Version = js.native
    
    def clearSuffix(): Version = js.native
    
    def getMajor(): js.UndefOr[Double] = js.native
    
    def getMinor(): js.UndefOr[Double] = js.native
    
    def getPatch(): js.UndefOr[Double] = js.native
    
    def getSuffix(): js.UndefOr[String] = js.native
    
    def hasMajor(): Boolean = js.native
    
    def hasMinor(): Boolean = js.native
    
    def hasPatch(): Boolean = js.native
    
    def hasSuffix(): Boolean = js.native
    
    def setMajor(value: Double): Version = js.native
    
    def setMinor(value: Double): Version = js.native
    
    def setPatch(value: Double): Version = js.native
    
    def setSuffix(value: String): Version = js.native
  }
  /* static members */
  object Version {
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Version]
    
    inline def deserializeBinaryFromReader(message: Version, reader: BinaryReader): Version = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Version]
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Version, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Version): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var major: js.UndefOr[Double] = js.undefined
      
      var minor: js.UndefOr[Double] = js.undefined
      
      var patch: js.UndefOr[Double] = js.undefined
      
      var suffix: js.UndefOr[String] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
        
        inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
        
        inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
        
        inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
        
        inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
        
        inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
        
        inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        
        inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      }
    }
  }
}
