package typings.googleProtobuf.descriptorPbMod

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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
class EnumValueDescriptorProto () extends Message {
  
  def clearName(): EnumValueDescriptorProto = js.native
  
  def clearNumber(): EnumValueDescriptorProto = js.native
  
  def clearOptions(): EnumValueDescriptorProto = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getNumber(): js.UndefOr[Double] = js.native
  
  def getOptions(): js.UndefOr[EnumValueOptions] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasNumber(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setName(value: String): EnumValueDescriptorProto = js.native
  
  def setNumber(value: Double): EnumValueDescriptorProto = js.native
  
  def setOptions(): EnumValueDescriptorProto = js.native
  def setOptions(value: EnumValueOptions): EnumValueDescriptorProto = js.native
}
/* static members */
object EnumValueDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): EnumValueDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: EnumValueDescriptorProto, reader: BinaryReader): EnumValueDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: EnumValueDescriptorProto, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: EnumValueDescriptorProto): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[Double] = js.native
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.EnumValueOptions.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOptions(value: typings.googleProtobuf.descriptorPbMod.EnumValueOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
