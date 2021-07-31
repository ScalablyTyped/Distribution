package typings.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Label
import typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
class FieldDescriptorProto () extends Message {
  
  def clearDefaultValue(): FieldDescriptorProto = js.native
  
  def clearExtendee(): FieldDescriptorProto = js.native
  
  def clearJsonName(): FieldDescriptorProto = js.native
  
  def clearLabel(): FieldDescriptorProto = js.native
  
  def clearName(): FieldDescriptorProto = js.native
  
  def clearNumber(): FieldDescriptorProto = js.native
  
  def clearOneofIndex(): FieldDescriptorProto = js.native
  
  def clearOptions(): FieldDescriptorProto = js.native
  
  def clearType(): FieldDescriptorProto = js.native
  
  def clearTypeName(): FieldDescriptorProto = js.native
  
  def getDefaultValue(): js.UndefOr[String] = js.native
  
  def getExtendee(): js.UndefOr[String] = js.native
  
  def getJsonName(): js.UndefOr[String] = js.native
  
  def getLabel(): js.UndefOr[Label] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getNumber(): js.UndefOr[Double] = js.native
  
  def getOneofIndex(): js.UndefOr[Double] = js.native
  
  def getOptions(): js.UndefOr[FieldOptions] = js.native
  
  def getType(): js.UndefOr[Type] = js.native
  
  def getTypeName(): js.UndefOr[String] = js.native
  
  def hasDefaultValue(): Boolean = js.native
  
  def hasExtendee(): Boolean = js.native
  
  def hasJsonName(): Boolean = js.native
  
  def hasLabel(): Boolean = js.native
  
  def hasName(): Boolean = js.native
  
  def hasNumber(): Boolean = js.native
  
  def hasOneofIndex(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasType(): Boolean = js.native
  
  def hasTypeName(): Boolean = js.native
  
  def setDefaultValue(value: String): FieldDescriptorProto = js.native
  
  def setExtendee(value: String): FieldDescriptorProto = js.native
  
  def setJsonName(value: String): FieldDescriptorProto = js.native
  
  def setLabel(value: Label): FieldDescriptorProto = js.native
  
  def setName(value: String): FieldDescriptorProto = js.native
  
  def setNumber(value: Double): FieldDescriptorProto = js.native
  
  def setOneofIndex(value: Double): FieldDescriptorProto = js.native
  
  def setOptions(): FieldDescriptorProto = js.native
  def setOptions(value: FieldOptions): FieldDescriptorProto = js.native
  
  def setType(value: Type): FieldDescriptorProto = js.native
  
  def setTypeName(value: String): FieldDescriptorProto = js.native
}
/* static members */
object FieldDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Label extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.Label")
  @js.native
  object Label extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Label & Double] = js.native
    
    @js.native
    sealed trait LABEL_OPTIONAL
      extends StObject
         with Label
    /* 1 */ val LABEL_OPTIONAL: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Label.LABEL_OPTIONAL & Double = js.native
    
    @js.native
    sealed trait LABEL_REPEATED
      extends StObject
         with Label
    /* 3 */ val LABEL_REPEATED: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Label.LABEL_REPEATED & Double = js.native
    
    @js.native
    sealed trait LABEL_REQUIRED
      extends StObject
         with Label
    /* 2 */ val LABEL_REQUIRED: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Label.LABEL_REQUIRED & Double = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type & Double] = js.native
    
    @js.native
    sealed trait TYPE_BOOL
      extends StObject
         with Type
    /* 8 */ val TYPE_BOOL: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_BOOL & Double = js.native
    
    @js.native
    sealed trait TYPE_BYTES
      extends StObject
         with Type
    /* 12 */ val TYPE_BYTES: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_BYTES & Double = js.native
    
    @js.native
    sealed trait TYPE_DOUBLE
      extends StObject
         with Type
    /* 1 */ val TYPE_DOUBLE: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_DOUBLE & Double = js.native
    
    @js.native
    sealed trait TYPE_ENUM
      extends StObject
         with Type
    /* 14 */ val TYPE_ENUM: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_ENUM & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED32
      extends StObject
         with Type
    /* 7 */ val TYPE_FIXED32: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_FIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_FIXED64
      extends StObject
         with Type
    /* 6 */ val TYPE_FIXED64: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_FIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_FLOAT
      extends StObject
         with Type
    /* 2 */ val TYPE_FLOAT: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_FLOAT & Double = js.native
    
    @js.native
    sealed trait TYPE_GROUP
      extends StObject
         with Type
    /* 10 */ val TYPE_GROUP: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_GROUP & Double = js.native
    
    @js.native
    sealed trait TYPE_INT32
      extends StObject
         with Type
    /* 5 */ val TYPE_INT32: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_INT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_INT64
      extends StObject
         with Type
    /* 3 */ val TYPE_INT64: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_INT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_MESSAGE
      extends StObject
         with Type
    /* 11 */ val TYPE_MESSAGE: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_MESSAGE & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED32
      extends StObject
         with Type
    /* 15 */ val TYPE_SFIXED32: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_SFIXED32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SFIXED64
      extends StObject
         with Type
    /* 16 */ val TYPE_SFIXED64: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_SFIXED64 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT32
      extends StObject
         with Type
    /* 17 */ val TYPE_SINT32: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_SINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_SINT64
      extends StObject
         with Type
    /* 18 */ val TYPE_SINT64: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_SINT64 & Double = js.native
    
    @js.native
    sealed trait TYPE_STRING
      extends StObject
         with Type
    /* 9 */ val TYPE_STRING: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_STRING & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT32
      extends StObject
         with Type
    /* 13 */ val TYPE_UINT32: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_UINT32 & Double = js.native
    
    @js.native
    sealed trait TYPE_UINT64
      extends StObject
         with Type
    /* 4 */ val TYPE_UINT64: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.Type.TYPE_UINT64 & Double = js.native
  }
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  @scala.inline
  def deserializeBinaryFromReader(message: FieldDescriptorProto, reader: BinaryReader): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: FieldDescriptorProto, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: FieldDescriptorProto): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var extendee: js.UndefOr[String] = js.undefined
    
    var jsonName: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var oneofIndex: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.FieldOptions.AsObject] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
    
    var typeName: js.UndefOr[String] = js.undefined
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
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
      
      @scala.inline
      def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
      
      @scala.inline
      def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
      
      @scala.inline
      def setOptions(value: typings.googleProtobuf.descriptorPbMod.FieldOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
