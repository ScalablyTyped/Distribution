package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbideDefaults extends js.Object {
  
  var formErrorClass: String = js.native
  
  var formErrorSelector: String = js.native
  
  var inputErrorClass: String = js.native
  
  var labelErrorClass: String = js.native
  
  var liveValidate: Boolean = js.native
  
  var patterns: IAbidePatterns = js.native
  
  var validateOn: String = js.native
  
  var validateOnBlur: Boolean = js.native
  
  var validators: js.Any = js.native
}
object AbideDefaults {
  
  @scala.inline
  def apply(
    formErrorClass: String,
    formErrorSelector: String,
    inputErrorClass: String,
    labelErrorClass: String,
    liveValidate: Boolean,
    patterns: IAbidePatterns,
    validateOn: String,
    validateOnBlur: Boolean,
    validators: js.Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass.asInstanceOf[js.Any], formErrorSelector = formErrorSelector.asInstanceOf[js.Any], inputErrorClass = inputErrorClass.asInstanceOf[js.Any], labelErrorClass = labelErrorClass.asInstanceOf[js.Any], liveValidate = liveValidate.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], validateOn = validateOn.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbideDefaults]
  }
  
  @scala.inline
  implicit class AbideDefaultsOps[Self <: AbideDefaults] (val x: Self) extends AnyVal {
    
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
    def setFormErrorSelector(value: String): Self = this.set("formErrorSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputErrorClass(value: String): Self = this.set("inputErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelErrorClass(value: String): Self = this.set("labelErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveValidate(value: Boolean): Self = this.set("liveValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: IAbidePatterns): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOn(value: String): Self = this.set("validateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: js.Any): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
}
