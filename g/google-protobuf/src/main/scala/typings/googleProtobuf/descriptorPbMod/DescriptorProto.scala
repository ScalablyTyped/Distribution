package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
open class DescriptorProto () extends Message {
  
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: Unit, index: Double): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: Unit, index: Double): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addExtensionRange(): ExtensionRange = js.native
  def addExtensionRange(value: Unit, index: Double): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange, index: Double): ExtensionRange = js.native
  
  def addField(): FieldDescriptorProto = js.native
  def addField(value: Unit, index: Double): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addNestedType(): DescriptorProto = js.native
  def addNestedType(value: Unit, index: Double): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  
  def addOneofDecl(): OneofDescriptorProto = js.native
  def addOneofDecl(value: Unit, index: Double): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto, index: Double): OneofDescriptorProto = js.native
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): ReservedRange = js.native
  def addReservedRange(value: Unit, index: Double): ReservedRange = js.native
  def addReservedRange(value: ReservedRange): ReservedRange = js.native
  def addReservedRange(value: ReservedRange, index: Double): ReservedRange = js.native
  
  def clearEnumTypeList(): DescriptorProto = js.native
  
  def clearExtensionList(): DescriptorProto = js.native
  
  def clearExtensionRangeList(): DescriptorProto = js.native
  
  def clearFieldList(): DescriptorProto = js.native
  
  def clearName(): DescriptorProto = js.native
  
  def clearNestedTypeList(): DescriptorProto = js.native
  
  def clearOneofDeclList(): DescriptorProto = js.native
  
  def clearOptions(): DescriptorProto = js.native
  
  def clearReservedNameList(): DescriptorProto = js.native
  
  def clearReservedRangeList(): DescriptorProto = js.native
  
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  
  def getExtensionRangeList(): js.Array[ExtensionRange] = js.native
  
  def getFieldList(): js.Array[FieldDescriptorProto] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getNestedTypeList(): js.Array[DescriptorProto] = js.native
  
  def getOneofDeclList(): js.Array[OneofDescriptorProto] = js.native
  
  def getOptions(): js.UndefOr[MessageOptions] = js.native
  
  def getReservedNameList(): js.Array[String] = js.native
  
  def getReservedRangeList(): js.Array[ReservedRange] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionRangeList(value: js.Array[ExtensionRange]): DescriptorProto = js.native
  
  def setFieldList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setName(value: String): DescriptorProto = js.native
  
  def setNestedTypeList(value: js.Array[DescriptorProto]): DescriptorProto = js.native
  
  def setOneofDeclList(value: js.Array[OneofDescriptorProto]): DescriptorProto = js.native
  
  def setOptions(): DescriptorProto = js.native
  def setOptions(value: MessageOptions): DescriptorProto = js.native
  
  def setReservedNameList(value: js.Array[String]): DescriptorProto = js.native
  
  def setReservedRangeList(value: js.Array[ReservedRange]): DescriptorProto = js.native
}
/* static members */
object DescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
  @js.native
  open class ExtensionRange () extends Message {
    
    def clearEnd(): ExtensionRange = js.native
    
    def clearOptions(): ExtensionRange = js.native
    
    def clearStart(): ExtensionRange = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getOptions(): js.UndefOr[ExtensionRangeOptions] = js.native
    
    def getStart(): js.UndefOr[Double] = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasOptions(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def setEnd(value: Double): ExtensionRange = js.native
    
    def setOptions(): ExtensionRange = js.native
    def setOptions(value: ExtensionRangeOptions): ExtensionRange = js.native
    
    def setStart(value: Double): ExtensionRange = js.native
  }
  /* static members */
  object ExtensionRange {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ExtensionRange]
    
    inline def deserializeBinaryFromReader(message: ExtensionRange, reader: BinaryReader): ExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ExtensionRange]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: ExtensionRange, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: ExtensionRange): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]
    
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.undefined
      
      var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
    }
    object AsObject {
      
      inline def apply(): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]
      }
      
      extension [Self <: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setOptions(value: typings.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange")
  @js.native
  open class ReservedRange () extends Message {
    
    def clearEnd(): ReservedRange = js.native
    
    def clearStart(): ReservedRange = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getStart(): js.UndefOr[Double] = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def setEnd(value: Double): ReservedRange = js.native
    
    def setStart(value: Double): ReservedRange = js.native
  }
  /* static members */
  object ReservedRange {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ReservedRange]
    
    inline def deserializeBinaryFromReader(message: ReservedRange, reader: BinaryReader): ReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ReservedRange]
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: ReservedRange, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: ReservedRange): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
    
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
    }
    object AsObject {
      
      inline def apply(): typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
      }
      
      extension [Self <: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  inline def deserializeBinaryFromReader(message: DescriptorProto, reader: BinaryReader): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: DescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: DescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]
    
    var extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]
    
    var extensionRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]
    
    var fieldList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]
    
    var name: js.UndefOr[String] = js.undefined
    
    var nestedTypeList: js.Array[AsObject]
    
    var oneofDeclList: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject] = js.undefined
    
    var reservedNameList: js.Array[String]
    
    var reservedRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
  }
  object AsObject {
    
    inline def apply(
      enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
      extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
      extensionRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject],
      fieldList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
      nestedTypeList: js.Array[AsObject],
      oneofDeclList: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject],
      reservedNameList: js.Array[String],
      reservedRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], extensionRangeList = extensionRangeList.asInstanceOf[js.Any], fieldList = fieldList.asInstanceOf[js.Any], nestedTypeList = nestedTypeList.asInstanceOf[js.Any], oneofDeclList = oneofDeclList.asInstanceOf[js.Any], reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setEnumTypeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = StObject.set(x, "enumTypeList", value.asInstanceOf[js.Any])
      
      inline def setEnumTypeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject*): Self = StObject.set(x, "enumTypeList", js.Array(value*))
      
      inline def setExtensionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = StObject.set(x, "extensionList", value.asInstanceOf[js.Any])
      
      inline def setExtensionListVarargs(value: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = StObject.set(x, "extensionList", js.Array(value*))
      
      inline def setExtensionRangeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]): Self = StObject.set(x, "extensionRangeList", value.asInstanceOf[js.Any])
      
      inline def setExtensionRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject*): Self = StObject.set(x, "extensionRangeList", js.Array(value*))
      
      inline def setFieldList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = StObject.set(x, "fieldList", value.asInstanceOf[js.Any])
      
      inline def setFieldListVarargs(value: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = StObject.set(x, "fieldList", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNestedTypeList(value: js.Array[AsObject]): Self = StObject.set(x, "nestedTypeList", value.asInstanceOf[js.Any])
      
      inline def setNestedTypeListVarargs(value: AsObject*): Self = StObject.set(x, "nestedTypeList", js.Array(value*))
      
      inline def setOneofDeclList(value: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]): Self = StObject.set(x, "oneofDeclList", value.asInstanceOf[js.Any])
      
      inline def setOneofDeclListVarargs(value: typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject*): Self = StObject.set(x, "oneofDeclList", js.Array(value*))
      
      inline def setOptions(value: typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setReservedNameList(value: js.Array[String]): Self = StObject.set(x, "reservedNameList", value.asInstanceOf[js.Any])
      
      inline def setReservedNameListVarargs(value: String*): Self = StObject.set(x, "reservedNameList", js.Array(value*))
      
      inline def setReservedRangeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]): Self = StObject.set(x, "reservedRangeList", value.asInstanceOf[js.Any])
      
      inline def setReservedRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject*): Self = StObject.set(x, "reservedRangeList", js.Array(value*))
    }
  }
}
