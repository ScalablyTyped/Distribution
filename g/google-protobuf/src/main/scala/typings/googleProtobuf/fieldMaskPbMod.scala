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
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): FieldMask = js.native
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: FieldMask, reader: BinaryReader): FieldMask = js.native
    
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
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: FieldMask, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: FieldMask): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var pathsList: js.Array[String] = js.native
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
