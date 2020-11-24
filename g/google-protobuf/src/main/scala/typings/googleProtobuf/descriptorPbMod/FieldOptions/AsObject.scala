package typings.googleProtobuf.descriptorPbMod.FieldOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var ctype: js.UndefOr[CType] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var jstype: js.UndefOr[JSType] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var packed: js.UndefOr[Boolean] = js.native
  
  var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
  
  var weak: js.UndefOr[Boolean] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
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
    def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = this.set("uninterpretedOptionList", js.Array(value :_*))
    
    @scala.inline
    def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = this.set("uninterpretedOptionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtype(value: CType): Self = this.set("ctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtype: Self = this.set("ctype", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setJstype(value: JSType): Self = this.set("jstype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJstype: Self = this.set("jstype", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setPacked(value: Boolean): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacked: Self = this.set("packed", js.undefined)
    
    @scala.inline
    def setWeak(value: Boolean): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
}
