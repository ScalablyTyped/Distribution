package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
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

object sourceContextPbMod {
  
  @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
  @js.native
  class SourceContext () extends Message {
    
    def getFileName(): String = js.native
    
    def setFileName(value: String): SourceContext = js.native
  }
  /* static members */
  object SourceContext {
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): SourceContext = js.native
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: SourceContext, reader: BinaryReader): SourceContext = js.native
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: SourceContext, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/source_context_pb", "SourceContext.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: SourceContext): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var fileName: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(fileName: String): AsObject = {
        val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      }
    }
  }
}
