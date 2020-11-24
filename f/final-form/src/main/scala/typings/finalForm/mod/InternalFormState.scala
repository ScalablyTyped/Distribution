package typings.finalForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalFormState extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var dirtySinceLastSubmit: Boolean = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var errors: ValidationErrors = js.native
  
  var initialValues: js.UndefOr[js.Object] = js.native
  
  var lastSubmittedValues: js.UndefOr[js.Object] = js.native
  
  var modifiedSinceLastSubmit: Boolean = js.native
  
  var pristine: Boolean = js.native
  
  var submitError: js.UndefOr[js.Any] = js.native
  
  var submitErrors: js.UndefOr[js.Object] = js.native
  
  var submitFailed: Boolean = js.native
  
  var submitSucceeded: Boolean = js.native
  
  var submitting: Boolean = js.native
  
  var valid: Boolean = js.native
  
  var validating: Double = js.native
  
  var values: js.Object = js.native
}
object InternalFormState {
  
  @scala.inline
  def apply(
    dirtySinceLastSubmit: Boolean,
    errors: ValidationErrors,
    modifiedSinceLastSubmit: Boolean,
    pristine: Boolean,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    valid: Boolean,
    validating: Double,
    values: js.Object
  ): InternalFormState = {
    val __obj = js.Dynamic.literal(dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFormState]
  }
  
  @scala.inline
  implicit class InternalFormStateOps[Self <: InternalFormState] (val x: Self) extends AnyVal {
    
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
    def setDirtySinceLastSubmit(value: Boolean): Self = this.set("dirtySinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ValidationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedSinceLastSubmit(value: Boolean): Self = this.set("modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitSucceeded(value: Boolean): Self = this.set("submitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidating(value: Double): Self = this.set("validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInitialValues(value: js.Object): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    
    @scala.inline
    def setLastSubmittedValues(value: js.Object): Self = this.set("lastSubmittedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSubmittedValues: Self = this.set("lastSubmittedValues", js.undefined)
    
    @scala.inline
    def setSubmitError(value: js.Any): Self = this.set("submitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitError: Self = this.set("submitError", js.undefined)
    
    @scala.inline
    def setSubmitErrors(value: js.Object): Self = this.set("submitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitErrors: Self = this.set("submitErrors", js.undefined)
  }
}
