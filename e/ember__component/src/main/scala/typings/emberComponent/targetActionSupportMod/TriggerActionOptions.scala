package typings.emberComponent.targetActionSupportMod

import typings.emberObject.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerActionOptions extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var actionContext: js.UndefOr[default] = js.native
  
  var target: js.UndefOr[default] = js.native
}
object TriggerActionOptions {
  
  @scala.inline
  def apply(): TriggerActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerActionOptions]
  }
  
  @scala.inline
  implicit class TriggerActionOptionsOps[Self <: TriggerActionOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionContext(value: default): Self = this.set("actionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionContext: Self = this.set("actionContext", js.undefined)
    
    @scala.inline
    def setTarget(value: default): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
