package typings.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyPbMod {
  
  @JSImport("google-protobuf/google/protobuf/any_pb", "Any")
  @js.native
  open class Any () extends Message {
    
    def getTypeName(): String = js.native
    
    def getTypeUrl(): String = js.native
    
    def getValue(): js.typedarray.Uint8Array | String = js.native
    
    def getValue_asB64(): String = js.native
    
    def getValue_asU8(): js.typedarray.Uint8Array = js.native
    
    def pack(serialized: js.typedarray.Uint8Array, name: String): Unit = js.native
    def pack(serialized: js.typedarray.Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
    
    def setTypeUrl(value: String): Any = js.native
    
    def setValue(value: String): Any = js.native
    def setValue(value: js.typedarray.Uint8Array): Any = js.native
    
    def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ js.typedarray.Uint8Array, T], name: String): T | Null = js.native
  }
  /* static members */
  object Any {
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def deserializeBinaryFromReader(message: Any, reader: BinaryReader): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Any, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Any): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var typeUrl: String
      
      var value: js.typedarray.Uint8Array | String
    }
    object AsObject {
      
      inline def apply(typeUrl: String, value: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(typeUrl = typeUrl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
        
        inline def setValue(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
