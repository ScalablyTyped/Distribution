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

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue () extends Message {
  
  def getValue(): Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): Uint8Array = js.native
  
  def setValue(value: String): BytesValue = js.native
  def setValue(value: Uint8Array): BytesValue = js.native
}
/* static members */
object BytesValue {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): BytesValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: BytesValue, reader: BinaryReader): BytesValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: BytesValue, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: BytesValue): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: Uint8Array | String): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
