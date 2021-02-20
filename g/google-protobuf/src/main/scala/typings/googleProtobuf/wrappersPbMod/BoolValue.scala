package typings.googleProtobuf.wrappersPbMod

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

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
@js.native
class BoolValue () extends Message {
  
  def getValue(): Boolean = js.native
  
  def setValue(value: Boolean): BoolValue = js.native
}
/* static members */
object BoolValue {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): BoolValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: BoolValue, reader: BinaryReader): BoolValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: BoolValue, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: BoolValue): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: Boolean = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: Boolean): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
