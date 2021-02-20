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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
class EnumValue () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
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
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): EnumValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: EnumValue, reader: BinaryReader): EnumValue = js.native
  
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
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: EnumValue, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: EnumValue): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var name: String = js.native
    
    var number: Double = js.native
    
    var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
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
