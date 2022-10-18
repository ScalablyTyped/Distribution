package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.googleProtobufSourceContextPbMod.SourceContext
import typings.googleProtobuf.googleProtobufTypePbMod.Option
import typings.googleProtobuf.googleProtobufTypePbMod.Syntax
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleProtobufApiPbMod {
  
  @JSImport("google-protobuf/google/protobuf/api_pb", "Api")
  @js.native
  open class Api () extends Message {
    
    def addMethods(): Method = js.native
    def addMethods(value: Unit, index: Double): Method = js.native
    def addMethods(value: Method): Method = js.native
    def addMethods(value: Method, index: Double): Method = js.native
    
    def addMixins(): Mixin = js.native
    def addMixins(value: Unit, index: Double): Mixin = js.native
    def addMixins(value: Mixin): Mixin = js.native
    def addMixins(value: Mixin, index: Double): Mixin = js.native
    
    def addOptions(): Option = js.native
    def addOptions(value: Unit, index: Double): Option = js.native
    def addOptions(value: Option): Option = js.native
    def addOptions(value: Option, index: Double): Option = js.native
    
    def clearMethodsList(): Api = js.native
    
    def clearMixinsList(): Api = js.native
    
    def clearOptionsList(): Api = js.native
    
    def clearSourceContext(): Api = js.native
    
    def getMethodsList(): js.Array[Method] = js.native
    
    def getMixinsList(): js.Array[Mixin] = js.native
    
    def getName(): String = js.native
    
    def getOptionsList(): js.Array[Option] = js.native
    
    def getSourceContext(): js.UndefOr[SourceContext] = js.native
    
    def getSyntax(): Syntax = js.native
    
    def getVersion(): String = js.native
    
    def hasSourceContext(): Boolean = js.native
    
    def setMethodsList(value: js.Array[Method]): Api = js.native
    
    def setMixinsList(value: js.Array[Mixin]): Api = js.native
    
    def setName(value: String): Api = js.native
    
    def setOptionsList(value: js.Array[Option]): Api = js.native
    
    def setSourceContext(): Api = js.native
    def setSourceContext(value: SourceContext): Api = js.native
    
    def setSyntax(value: Syntax): Api = js.native
    
    def setVersion(value: String): Api = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Api")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Api]
    
    inline def deserializeBinaryFromReader(message: Api, reader: BinaryReader): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Api]
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Api.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Api.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Api, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Api): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var methodsList: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Method.AsObject]
      
      var mixinsList: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Mixin.AsObject]
      
      var name: String
      
      var optionsList: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject]
      
      var sourceContext: js.UndefOr[typings.googleProtobuf.googleProtobufSourceContextPbMod.SourceContext.AsObject] = js.undefined
      
      var syntax: Syntax
      
      var version: String
    }
    object AsObject {
      
      inline def apply(
        methodsList: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Method.AsObject],
        mixinsList: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Mixin.AsObject],
        name: String,
        optionsList: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject],
        syntax: Syntax,
        version: String
      ): AsObject = {
        val __obj = js.Dynamic.literal(methodsList = methodsList.asInstanceOf[js.Any], mixinsList = mixinsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setMethodsList(value: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Method.AsObject]): Self = StObject.set(x, "methodsList", value.asInstanceOf[js.Any])
        
        inline def setMethodsListVarargs(value: typings.googleProtobuf.googleProtobufApiPbMod.Method.AsObject*): Self = StObject.set(x, "methodsList", js.Array(value*))
        
        inline def setMixinsList(value: js.Array[typings.googleProtobuf.googleProtobufApiPbMod.Mixin.AsObject]): Self = StObject.set(x, "mixinsList", value.asInstanceOf[js.Any])
        
        inline def setMixinsListVarargs(value: typings.googleProtobuf.googleProtobufApiPbMod.Mixin.AsObject*): Self = StObject.set(x, "mixinsList", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptionsList(value: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
        
        inline def setOptionsListVarargs(value: typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value*))
        
        inline def setSourceContext(value: typings.googleProtobuf.googleProtobufSourceContextPbMod.SourceContext.AsObject): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
        
        inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
        
        inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/api_pb", "Method")
  @js.native
  open class Method () extends Message {
    
    def addOptions(): Option = js.native
    def addOptions(value: Unit, index: Double): Option = js.native
    def addOptions(value: Option): Option = js.native
    def addOptions(value: Option, index: Double): Option = js.native
    
    def clearOptionsList(): Method = js.native
    
    def getName(): String = js.native
    
    def getOptionsList(): js.Array[Option] = js.native
    
    def getRequestStreaming(): Boolean = js.native
    
    def getRequestTypeUrl(): String = js.native
    
    def getResponseStreaming(): Boolean = js.native
    
    def getResponseTypeUrl(): String = js.native
    
    def getSyntax(): Syntax = js.native
    
    def setName(value: String): Method = js.native
    
    def setOptionsList(value: js.Array[Option]): Method = js.native
    
    def setRequestStreaming(value: Boolean): Method = js.native
    
    def setRequestTypeUrl(value: String): Method = js.native
    
    def setResponseStreaming(value: Boolean): Method = js.native
    
    def setResponseTypeUrl(value: String): Method = js.native
    
    def setSyntax(value: Syntax): Method = js.native
  }
  /* static members */
  object Method {
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Method")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Method]
    
    inline def deserializeBinaryFromReader(message: Method, reader: BinaryReader): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Method]
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Method.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Method.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Method, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Method): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var name: String
      
      var optionsList: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject]
      
      var requestStreaming: Boolean
      
      var requestTypeUrl: String
      
      var responseStreaming: Boolean
      
      var responseTypeUrl: String
      
      var syntax: Syntax
    }
    object AsObject {
      
      inline def apply(
        name: String,
        optionsList: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject],
        requestStreaming: Boolean,
        requestTypeUrl: String,
        responseStreaming: Boolean,
        responseTypeUrl: String,
        syntax: Syntax
      ): AsObject = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], requestStreaming = requestStreaming.asInstanceOf[js.Any], requestTypeUrl = requestTypeUrl.asInstanceOf[js.Any], responseStreaming = responseStreaming.asInstanceOf[js.Any], responseTypeUrl = responseTypeUrl.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptionsList(value: js.Array[typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
        
        inline def setOptionsListVarargs(value: typings.googleProtobuf.googleProtobufTypePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value*))
        
        inline def setRequestStreaming(value: Boolean): Self = StObject.set(x, "requestStreaming", value.asInstanceOf[js.Any])
        
        inline def setRequestTypeUrl(value: String): Self = StObject.set(x, "requestTypeUrl", value.asInstanceOf[js.Any])
        
        inline def setResponseStreaming(value: Boolean): Self = StObject.set(x, "responseStreaming", value.asInstanceOf[js.Any])
        
        inline def setResponseTypeUrl(value: String): Self = StObject.set(x, "responseTypeUrl", value.asInstanceOf[js.Any])
        
        inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
  @js.native
  open class Mixin () extends Message {
    
    def getName(): String = js.native
    
    def getRoot(): String = js.native
    
    def setName(value: String): Mixin = js.native
    
    def setRoot(value: String): Mixin = js.native
  }
  /* static members */
  object Mixin {
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Mixin]
    
    inline def deserializeBinaryFromReader(message: Mixin, reader: BinaryReader): Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Mixin]
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Mixin.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/api_pb", "Mixin.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Mixin, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Mixin): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var name: String
      
      var root: String
    }
    object AsObject {
      
      inline def apply(name: String, root: String): AsObject = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      }
    }
  }
}
