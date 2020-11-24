package typings.extjs.Ext.form.action

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubmit extends IAction {
  
  /** [Config Option] (Boolean) */
  var clientValidation: js.UndefOr[Boolean] = js.native
}
object ISubmit {
  
  @scala.inline
  def apply(): ISubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubmit]
  }
  
  @scala.inline
  implicit class ISubmitOps[Self <: ISubmit] (val x: Self) extends AnyVal {
    
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
    def setClientValidation(value: Boolean): Self = this.set("clientValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientValidation: Self = this.set("clientValidation", js.undefined)
  }
}
