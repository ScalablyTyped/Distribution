package typings.googleProtobuf.typePbMod

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

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
class EnumValue () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: Unit, index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearOptionsList(): EnumValue = js.native
  
  def getName(): String = js.native
  
  def getNumber(): Double = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def setName(value: String): EnumValue = js.native
  
  def setNumber(value: Double): EnumValue = js.native
  
  def setOptionsList(value: js.Array[Option]): EnumValue = js.native
}
/* static members */
object EnumValue {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): EnumValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumValue]
  
  @scala.inline
  def deserializeBinaryFromReader(message: EnumValue, reader: BinaryReader): EnumValue = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EnumValue]
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: EnumValue, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: EnumValue): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var name: String
    
    var number: Double
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
  }
  object AsObject {
    
    @scala.inline
    def apply(
      name: String,
      number: Double,
      optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value :_*))
    }
  }
}
