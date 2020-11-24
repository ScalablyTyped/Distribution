package typings.googleProtobuf.descriptorPbMod.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject] = js.native
  
  var extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  
  var extensionRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject] = js.native
  
  var fieldList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nestedTypeList: js.Array[AsObject] = js.native
  
  var oneofDeclList: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject] = js.native
  
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject] = js.native
  
  var reservedNameList: js.Array[String] = js.native
  
  var reservedRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnumTypeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject*): Self = this.set("enumTypeList", js.Array(value :_*))
    
    @scala.inline
    def setEnumTypeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = this.set("enumTypeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionListVarargs(value: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = this.set("extensionList", js.Array(value :_*))
    
    @scala.inline
    def setExtensionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = this.set("extensionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject*): Self = this.set("extensionRangeList", js.Array(value :_*))
    
    @scala.inline
    def setExtensionRangeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]): Self = this.set("extensionRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldListVarargs(value: typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = this.set("fieldList", js.Array(value :_*))
    
    @scala.inline
    def setFieldList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = this.set("fieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedTypeListVarargs(value: AsObject*): Self = this.set("nestedTypeList", js.Array(value :_*))
    
    @scala.inline
    def setNestedTypeList(value: js.Array[AsObject]): Self = this.set("nestedTypeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofDeclListVarargs(value: typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject*): Self = this.set("oneofDeclList", js.Array(value :_*))
    
    @scala.inline
    def setOneofDeclList(value: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]): Self = this.set("oneofDeclList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNameListVarargs(value: String*): Self = this.set("reservedNameList", js.Array(value :_*))
    
    @scala.inline
    def setReservedNameList(value: js.Array[String]): Self = this.set("reservedNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject*): Self = this.set("reservedRangeList", js.Array(value :_*))
    
    @scala.inline
    def setReservedRangeList(value: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]): Self = this.set("reservedRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
