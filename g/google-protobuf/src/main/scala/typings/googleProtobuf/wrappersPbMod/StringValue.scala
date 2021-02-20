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

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue")
@js.native
class StringValue () extends Message {
  
  def getValue(): String = js.native
  
  def setValue(value: String): StringValue = js.native
}
/* static members */
object StringValue {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): StringValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: StringValue, reader: BinaryReader): StringValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: StringValue, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: StringValue): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: String): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
