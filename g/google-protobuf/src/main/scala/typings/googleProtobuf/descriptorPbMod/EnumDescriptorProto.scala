package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange
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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto () extends Message {
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): EnumReservedRange = js.native
  def addReservedRange(value: js.UndefOr[scala.Nothing], index: Double): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange, index: Double): EnumReservedRange = js.native
  
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: js.UndefOr[scala.Nothing], index: Double): EnumValueDescriptorProto = js.native
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
  class EnumReservedRange () extends Message {
    
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
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): EnumReservedRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: EnumReservedRange, reader: BinaryReader): EnumReservedRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: EnumReservedRange, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.EnumReservedRange.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: EnumReservedRange): typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.native
      
      var start: js.UndefOr[Double] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): EnumDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: EnumDescriptorProto, reader: BinaryReader): EnumDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: EnumDescriptorProto, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: EnumDescriptorProto): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject] = js.native
    
    var reservedNameList: js.Array[String] = js.native
    
    var reservedRangeList: js.Array[
        typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
      ] = js.native
    
    var valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      reservedNameList: js.Array[String],
      reservedRangeList: js.Array[
          typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
        ],
      valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setReservedNameList(value: js.Array[String]): Self = StObject.set(x, "reservedNameList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedNameListVarargs(value: String*): Self = StObject.set(x, "reservedNameList", js.Array(value :_*))
      
      @scala.inline
      def setReservedRangeList(
        value: js.Array[
              typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
            ]
      ): Self = StObject.set(x, "reservedRangeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject*): Self = StObject.set(x, "reservedRangeList", js.Array(value :_*))
      
      @scala.inline
      def setValueList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]): Self = StObject.set(x, "valueList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject*): Self = StObject.set(x, "valueList", js.Array(value :_*))
    }
  }
}
