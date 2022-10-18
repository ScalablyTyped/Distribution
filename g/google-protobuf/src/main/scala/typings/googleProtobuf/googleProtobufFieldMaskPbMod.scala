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

object googleProtobufFieldMaskPbMod {
  
  @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
  @js.native
  open class FieldMask () extends Message {
    
    def addPaths(value: String): String = js.native
    def addPaths(value: String, index: Double): String = js.native
    
    def clearPathsList(): FieldMask = js.native
    
    def getPathsList(): js.Array[String] = js.native
    
    def setPathsList(value: js.Array[String]): FieldMask = js.native
  }
  /* static members */
  object FieldMask {
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
    
    inline def deserializeBinaryFromReader(message: FieldMask, reader: BinaryReader): FieldMask = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FieldMask]
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: FieldMask, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: FieldMask): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var pathsList: js.Array[String]
    }
    object AsObject {
      
      inline def apply(pathsList: js.Array[String]): AsObject = {
        val __obj = js.Dynamic.literal(pathsList = pathsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setPathsList(value: js.Array[String]): Self = StObject.set(x, "pathsList", value.asInstanceOf[js.Any])
        
        inline def setPathsListVarargs(value: String*): Self = StObject.set(x, "pathsList", js.Array(value*))
      }
    }
  }
}
