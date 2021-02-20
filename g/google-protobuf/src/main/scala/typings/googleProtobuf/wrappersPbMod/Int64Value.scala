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

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value")
@js.native
class Int64Value () extends Message {
  
  def getValue(): Double = js.native
  
  def setValue(value: Double): Int64Value = js.native
}
/* static members */
object Int64Value {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): Int64Value = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Int64Value, reader: BinaryReader): Int64Value = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Int64Value, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Int64Value): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: Double = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: Double): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
