package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.FileDescriptorProto
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginPbMod {
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
  @js.native
  class CodeGeneratorRequest () extends Message {
    
    def addFileToGenerate(value: String): String = js.native
    def addFileToGenerate(value: String, index: Double): String = js.native
    
    def addProtoFile(): FileDescriptorProto = js.native
    def addProtoFile(value: js.UndefOr[scala.Nothing], index: Double): FileDescriptorProto = js.native
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
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): CodeGeneratorRequest = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: CodeGeneratorRequest, reader: BinaryReader): CodeGeneratorRequest = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: CodeGeneratorRequest, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: CodeGeneratorRequest): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var compilerVersion: js.UndefOr[typings.googleProtobuf.pluginPbMod.Version.AsObject] = js.native
      
      var fileToGenerateList: js.Array[String] = js.native
      
      var parameter: js.UndefOr[String] = js.native
      
      var protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        fileToGenerateList: js.Array[String],
        protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]
      ): AsObject = {
        val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList.asInstanceOf[js.Any], protoFileList = protoFileList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompilerVersion(value: typings.googleProtobuf.pluginPbMod.Version.AsObject): Self = StObject.set(x, "compilerVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompilerVersionUndefined: Self = StObject.set(x, "compilerVersion", js.undefined)
        
        @scala.inline
        def setFileToGenerateList(value: js.Array[String]): Self = StObject.set(x, "fileToGenerateList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileToGenerateListVarargs(value: String*): Self = StObject.set(x, "fileToGenerateList", js.Array(value :_*))
        
        @scala.inline
        def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
        
        @scala.inline
        def setProtoFileList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): Self = StObject.set(x, "protoFileList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtoFileListVarargs(value: typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject*): Self = StObject.set(x, "protoFileList", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
  @js.native
  class CodeGeneratorResponse () extends Message {
    
    def addFile(): File = js.native
    def addFile(value: js.UndefOr[scala.Nothing], index: Double): File = js.native
    def addFile(value: File): File = js.native
    def addFile(value: File, index: Double): File = js.native
    
    def clearError(): CodeGeneratorResponse = js.native
    
    def clearFileList(): CodeGeneratorResponse = js.native
    
    def getError(): js.UndefOr[String] = js.native
    
    def getFileList(): js.Array[File] = js.native
    
    def hasError(): Boolean = js.native
    
    def setError(value: String): CodeGeneratorResponse = js.native
    
    def setFileList(value: js.Array[File]): CodeGeneratorResponse = js.native
  }
  /* static members */
  object CodeGeneratorResponse {
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File")
    @js.native
    class File () extends Message {
      
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
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.deserializeBinary")
      @js.native
      def deserializeBinary(bytes: Uint8Array): File = js.native
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.deserializeBinaryFromReader")
      @js.native
      def deserializeBinaryFromReader(message: File, reader: BinaryReader): File = js.native
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.extensions")
      @js.native
      def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.extensionsBinary")
      @js.native
      def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
      @scala.inline
      def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.serializeBinaryToWriter")
      @js.native
      def serializeBinaryToWriter(message: File, writer: BinaryWriter): Unit = js.native
      
      @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File.toObject")
      @js.native
      def toObject(includeInstance: Boolean, msg: File): typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject = js.native
      
      @js.native
      trait AsObject extends StObject {
        
        var content: js.UndefOr[String] = js.native
        
        var insertionPoint: js.UndefOr[String] = js.native
        
        var name: js.UndefOr[String] = js.native
      }
      object AsObject {
        
        @scala.inline
        def apply(): typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]
        }
        
        @scala.inline
        implicit class AsObjectMutableBuilder[Self <: typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
          
          @scala.inline
          def setInsertionPoint(value: String): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
    }
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): CodeGeneratorResponse = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: CodeGeneratorResponse, reader: BinaryReader): CodeGeneratorResponse = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: CodeGeneratorResponse, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: CodeGeneratorResponse): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var error: js.UndefOr[String] = js.native
      
      var fileList: js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(fileList: js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]): AsObject = {
        val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setFileList(value: js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileListVarargs(value: typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
  @js.native
  class Version () extends Message {
    
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
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): Version = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Version, reader: BinaryReader): Version = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Version, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Version): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var major: js.UndefOr[Double] = js.native
      
      var minor: js.UndefOr[Double] = js.native
      
      var patch: js.UndefOr[Double] = js.native
      
      var suffix: js.UndefOr[String] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
        
        @scala.inline
        def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
        
        @scala.inline
        def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
        
        @scala.inline
        def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      }
    }
  }
}
