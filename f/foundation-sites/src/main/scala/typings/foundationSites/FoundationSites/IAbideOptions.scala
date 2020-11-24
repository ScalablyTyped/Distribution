package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbideOptions extends js.Object {
  
  var formErrorClass: js.UndefOr[String] = js.native
  
  var formErrorSelector: js.UndefOr[String] = js.native
  
  var inputErrorClass: js.UndefOr[String] = js.native
  
  var labelErrorClass: js.UndefOr[String] = js.native
  
  var liveValidate: js.UndefOr[Boolean] = js.native
  
  var validateOn: js.UndefOr[String] = js.native
  
  var validators: js.UndefOr[js.Any] = js.native
}
object IAbideOptions {
  
  @scala.inline
  def apply(): IAbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbideOptions]
  }
  
  @scala.inline
  implicit class IAbideOptionsOps[Self <: IAbideOptions] (val x: Self) extends AnyVal {
    
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
    def setFormErrorClass(value: String): Self = this.set("formErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormErrorClass: Self = this.set("formErrorClass", js.undefined)
    
    @scala.inline
    def setFormErrorSelector(value: String): Self = this.set("formErrorSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormErrorSelector: Self = this.set("formErrorSelector", js.undefined)
    
    @scala.inline
    def setInputErrorClass(value: String): Self = this.set("inputErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputErrorClass: Self = this.set("inputErrorClass", js.undefined)
    
    @scala.inline
    def setLabelErrorClass(value: String): Self = this.set("labelErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelErrorClass: Self = this.set("labelErrorClass", js.undefined)
    
    @scala.inline
    def setLiveValidate(value: Boolean): Self = this.set("liveValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveValidate: Self = this.set("liveValidate", js.undefined)
    
    @scala.inline
    def setValidateOn(value: String): Self = this.set("validateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOn: Self = this.set("validateOn", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Any): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
}
