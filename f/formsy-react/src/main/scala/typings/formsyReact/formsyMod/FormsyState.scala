package typings.formsyReact.formsyMod

import typings.formsyReact.interfacesMod.FormsyContextInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormsyState extends js.Object {
  
  var canChange: Boolean = js.native
  
  var contextValue: FormsyContextInterface = js.native
  
  var formSubmitted: js.UndefOr[Boolean] = js.native
  
  var isPristine: js.UndefOr[Boolean] = js.native
  
  var isSubmitting: Boolean = js.native
  
  var isValid: Boolean = js.native
}
object FormsyState {
  
  @scala.inline
  def apply(canChange: Boolean, contextValue: FormsyContextInterface, isSubmitting: Boolean, isValid: Boolean): FormsyState = {
    val __obj = js.Dynamic.literal(canChange = canChange.asInstanceOf[js.Any], contextValue = contextValue.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsyState]
  }
  
  @scala.inline
  implicit class FormsyStateOps[Self <: FormsyState] (val x: Self) extends AnyVal {
    
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
    def setCanChange(value: Boolean): Self = this.set("canChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValue(value: FormsyContextInterface): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubmitting(value: Boolean): Self = this.set("isSubmitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSubmitted(value: Boolean): Self = this.set("formSubmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormSubmitted: Self = this.set("formSubmitted", js.undefined)
    
    @scala.inline
    def setIsPristine(value: Boolean): Self = this.set("isPristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPristine: Self = this.set("isPristine", js.undefined)
  }
}
