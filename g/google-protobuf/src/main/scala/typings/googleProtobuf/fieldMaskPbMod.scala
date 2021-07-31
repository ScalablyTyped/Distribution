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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMaskPbMod {
  
  @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
  @js.native
  class FieldMask () extends Message {
    
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
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
    
    @scala.inline
    def deserializeBinaryFromReader(message: FieldMask, reader: BinaryReader): FieldMask = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FieldMask]
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: FieldMask, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: FieldMask): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var pathsList: js.Array[String]
    }
    object AsObject {
      
      @scala.inline
      def apply(pathsList: js.Array[String]): AsObject = {
        val __obj = js.Dynamic.literal(pathsList = pathsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPathsList(value: js.Array[String]): Self = StObject.set(x, "pathsList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathsListVarargs(value: String*): Self = StObject.set(x, "pathsList", js.Array(value :_*))
      }
    }
  }
}
