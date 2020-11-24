package typings.finalForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSubscription extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var dirty: js.UndefOr[Boolean] = js.native
  
  var dirtyFields: js.UndefOr[Boolean] = js.native
  
  var dirtyFieldsSinceLastSubmit: js.UndefOr[Boolean] = js.native
  
  var dirtySinceLastSubmit: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var errors: js.UndefOr[Boolean] = js.native
  
  var hasSubmitErrors: js.UndefOr[Boolean] = js.native
  
  var hasValidationErrors: js.UndefOr[Boolean] = js.native
  
  var initialValues: js.UndefOr[Boolean] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var modified: js.UndefOr[Boolean] = js.native
  
  var modifiedSinceLastSubmit: js.UndefOr[Boolean] = js.native
  
  var pristine: js.UndefOr[Boolean] = js.native
  
  var submitError: js.UndefOr[Boolean] = js.native
  
  var submitErrors: js.UndefOr[Boolean] = js.native
  
  var submitFailed: js.UndefOr[Boolean] = js.native
  
  var submitSucceeded: js.UndefOr[Boolean] = js.native
  
  var submitting: js.UndefOr[Boolean] = js.native
  
  var touched: js.UndefOr[Boolean] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
  
  var validating: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[Boolean] = js.native
  
  var visited: js.UndefOr[Boolean] = js.native
}
object FormSubscription {
  
  @scala.inline
  def apply(): FormSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormSubscription]
  }
  
  @scala.inline
  implicit class FormSubscriptionOps[Self <: FormSubscription] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    
    @scala.inline
    def setDirtyFields(value: Boolean): Self = this.set("dirtyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirtyFields: Self = this.set("dirtyFields", js.undefined)
    
    @scala.inline
    def setDirtyFieldsSinceLastSubmit(value: Boolean): Self = this.set("dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirtyFieldsSinceLastSubmit: Self = this.set("dirtyFieldsSinceLastSubmit", js.undefined)
    
    @scala.inline
    def setDirtySinceLastSubmit(value: Boolean): Self = this.set("dirtySinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirtySinceLastSubmit: Self = this.set("dirtySinceLastSubmit", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrors(value: Boolean): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setHasSubmitErrors(value: Boolean): Self = this.set("hasSubmitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSubmitErrors: Self = this.set("hasSubmitErrors", js.undefined)
    
    @scala.inline
    def setHasValidationErrors(value: Boolean): Self = this.set("hasValidationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasValidationErrors: Self = this.set("hasValidationErrors", js.undefined)
    
    @scala.inline
    def setInitialValues(value: Boolean): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setModified(value: Boolean): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setModifiedSinceLastSubmit(value: Boolean): Self = this.set("modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedSinceLastSubmit: Self = this.set("modifiedSinceLastSubmit", js.undefined)
    
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePristine: Self = this.set("pristine", js.undefined)
    
    @scala.inline
    def setSubmitError(value: Boolean): Self = this.set("submitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitError: Self = this.set("submitError", js.undefined)
    
    @scala.inline
    def setSubmitErrors(value: Boolean): Self = this.set("submitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitErrors: Self = this.set("submitErrors", js.undefined)
    
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitFailed: Self = this.set("submitFailed", js.undefined)
    
    @scala.inline
    def setSubmitSucceeded(value: Boolean): Self = this.set("submitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitSucceeded: Self = this.set("submitSucceeded", js.undefined)
    
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitting: Self = this.set("submitting", js.undefined)
    
    @scala.inline
    def setTouched(value: Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouched: Self = this.set("touched", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setValidating(value: Boolean): Self = this.set("validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidating: Self = this.set("validating", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVisited(value: Boolean): Self = this.set("visited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
  }
}
