package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
open class EnumDescriptorProto () extends Message {
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): EnumReservedRange = js.native
  def addReservedRange(value: Unit, index: Double): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange, index: Double): EnumReservedRange = js.native
  
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: Unit, index: Double): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto, index: Double): EnumValueDescriptorProto = js.native
  
  def clearName(): EnumDescriptorProto = js.native
  
  def clearOptions(): EnumDescriptorProto = js.native
  
  def clearReservedNameList(): EnumDescriptorProto = js.native
  
  def clearReservedRangeList(): EnumDescriptorProto = js.native
  
  def clearValueList(): EnumDescriptorProto = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[EnumOptions] = js.native
  
  def getReservedNameList(): js.Array[String] = js.native
  
  def getReservedRangeList(): js.Array[EnumReservedRange] = js.native
  
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setName(value: String): EnumDescriptorProto = js.native
  
  def setOptions(): EnumDescriptorProto = js.native
  def setOptions(value: EnumOptions): EnumDescriptorProto = js.native
  
  def setReservedNameList(value: js.Array[String]): EnumDescriptorProto = js.native
  
  def setReservedRangeList(value: js.Array[EnumReservedRange]): EnumDescriptorProto = js.native
  
  def setValueList(value: js.Array[EnumValueDescriptorProto]): EnumDescriptorProto = js.native
}
/* static members */
object EnumDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange")
  @js.native
  open class EnumReservedRange () extends Message {
    
    def clearEnd(): EnumReservedRange = js.native
    
    def clearStart(): EnumReservedRange = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getStart(): js.UndefOr[Double] = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def setEnd(value: Double): EnumReservedRange = js.native
    
    def setStart(value: Double): EnumReservedRange = js.native
  }
  /* static members */
  object EnumReservedRange {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    
    inline def deserializeBinaryFromReader(message: EnumReservedRange, reader: BinaryReader): EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EnumReservedRange]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: EnumReservedRange, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: EnumReservedRange): typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject]
    
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
    }
    object AsObject {
      
      inline def apply(): typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject]
      }
      
      extension [Self <: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  inline def deserializeBinaryFromReader(message: EnumDescriptorProto, reader: BinaryReader): EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: EnumDescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: EnumDescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject] = js.undefined
    
    var reservedNameList: js.Array[String]
    
    var reservedRangeList: js.Array[
        typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
      ]
    
    var valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
  }
  object AsObject {
    
    inline def apply(
      reservedNameList: js.Array[String],
      reservedRangeList: js.Array[
          typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
        ],
      valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setReservedNameList(value: js.Array[String]): Self = StObject.set(x, "reservedNameList", value.asInstanceOf[js.Any])
      
      inline def setReservedNameListVarargs(value: String*): Self = StObject.set(x, "reservedNameList", js.Array(value*))
      
      inline def setReservedRangeList(
        value: js.Array[
              typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
            ]
      ): Self = StObject.set(x, "reservedRangeList", value.asInstanceOf[js.Any])
      
      inline def setReservedRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject*): Self = StObject.set(x, "reservedRangeList", js.Array(value*))
      
      inline def setValueList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]): Self = StObject.set(x, "valueList", value.asInstanceOf[js.Any])
      
      inline def setValueListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject*): Self = StObject.set(x, "valueList", js.Array(value*))
    }
  }
}
