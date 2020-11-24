package typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var extendee: js.UndefOr[String] = js.native
  
  var jsonName: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[Label] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var oneofIndex: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.FieldOptions.AsObject] = js.native
  
  var `type`: js.UndefOr[Type] = js.native
  
  var typeName: js.UndefOr[String] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setExtendee(value: String): Self = this.set("extendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendee: Self = this.set("extendee", js.undefined)
    
    @scala.inline
    def setJsonName(value: String): Self = this.set("jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonName: Self = this.set("jsonName", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setOneofIndex(value: Double): Self = this.set("oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneofIndex: Self = this.set("oneofIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.googleProtobuf.descriptorPbMod.FieldOptions.AsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("typeName", js.undefined)
  }
}
