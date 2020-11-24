package typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
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
    def setReservedNameListVarargs(value: String*): Self = this.set("reservedNameList", js.Array(value :_*))
    
    @scala.inline
    def setReservedNameList(value: js.Array[String]): Self = this.set("reservedNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangeListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject*): Self = this.set("reservedRangeList", js.Array(value :_*))
    
    @scala.inline
    def setReservedRangeList(
      value: js.Array[
          typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
        ]
    ): Self = this.set("reservedRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListVarargs(value: typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject*): Self = this.set("valueList", js.Array(value :_*))
    
    @scala.inline
    def setValueList(value: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]): Self = this.set("valueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
