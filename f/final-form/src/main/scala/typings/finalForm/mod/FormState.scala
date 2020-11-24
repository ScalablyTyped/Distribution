package typings.finalForm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormState[FormValues, InitialFormValues] extends js.Object {
  
  // by default: all values are subscribed. if subscription is specified, some values may be undefined
  var active: js.UndefOr[/* keyof FormValues */ String] = js.native
  
  var dirty: Boolean = js.native
  
  var dirtyFields: StringDictionary[Boolean] = js.native
  
  var dirtyFieldsSinceLastSubmit: StringDictionary[Boolean] = js.native
  
  var dirtySinceLastSubmit: Boolean = js.native
  
  var error: js.Any = js.native
  
  var errors: ValidationErrors = js.native
  
  var hasSubmitErrors: Boolean = js.native
  
  var hasValidationErrors: Boolean = js.native
  
  var initialValues: InitialFormValues = js.native
  
  var invalid: Boolean = js.native
  
  var modified: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var modifiedSinceLastSubmit: Boolean = js.native
  
  var pristine: Boolean = js.native
  
  var submitError: js.Any = js.native
  
  var submitErrors: SubmissionErrors = js.native
  
  var submitFailed: Boolean = js.native
  
  var submitSucceeded: Boolean = js.native
  
  var submitting: Boolean = js.native
  
  var touched: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var valid: Boolean = js.native
  
  var validating: Boolean = js.native
  
  var values: FormValues = js.native
  
  var visited: js.UndefOr[StringDictionary[Boolean]] = js.native
}
object FormState {
  
  @scala.inline
  def apply[FormValues, InitialFormValues](
    dirty: Boolean,
    dirtyFields: StringDictionary[Boolean],
    dirtyFieldsSinceLastSubmit: StringDictionary[Boolean],
    dirtySinceLastSubmit: Boolean,
    error: js.Any,
    errors: ValidationErrors,
    hasSubmitErrors: Boolean,
    hasValidationErrors: Boolean,
    initialValues: InitialFormValues,
    invalid: Boolean,
    modifiedSinceLastSubmit: Boolean,
    pristine: Boolean,
    submitError: js.Any,
    submitErrors: SubmissionErrors,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    valid: Boolean,
    validating: Boolean,
    values: FormValues
  ): FormState[FormValues, InitialFormValues] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], dirtyFields = dirtyFields.asInstanceOf[js.Any], dirtyFieldsSinceLastSubmit = dirtyFieldsSinceLastSubmit.asInstanceOf[js.Any], dirtySinceLastSubmit = dirtySinceLastSubmit.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasSubmitErrors = hasSubmitErrors.asInstanceOf[js.Any], hasValidationErrors = hasValidationErrors.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], modifiedSinceLastSubmit = modifiedSinceLastSubmit.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitError = submitError.asInstanceOf[js.Any], submitErrors = submitErrors.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormState[FormValues, InitialFormValues]]
  }
  
  @scala.inline
  implicit class FormStateOps[Self <: FormState[_, _], FormValues, InitialFormValues] (val x: Self with (FormState[FormValues, InitialFormValues])) extends AnyVal {
    
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
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyFields(value: StringDictionary[Boolean]): Self = this.set("dirtyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyFieldsSinceLastSubmit(value: StringDictionary[Boolean]): Self = this.set("dirtyFieldsSinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtySinceLastSubmit(value: Boolean): Self = this.set("dirtySinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ValidationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubmitErrors(value: Boolean): Self = this.set("hasSubmitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasValidationErrors(value: Boolean): Self = this.set("hasValidationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValues(value: InitialFormValues): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedSinceLastSubmit(value: Boolean): Self = this.set("modifiedSinceLastSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitError(value: js.Any): Self = this.set("submitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitErrors(value: SubmissionErrors): Self = this.set("submitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitSucceeded(value: Boolean): Self = this.set("submitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidating(value: Boolean): Self = this.set("validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FormValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: /* keyof FormValues */ String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setModified(value: StringDictionary[Boolean]): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setTouched(value: StringDictionary[Boolean]): Self = this.set("touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouched: Self = this.set("touched", js.undefined)
    
    @scala.inline
    def setVisited(value: StringDictionary[Boolean]): Self = this.set("visited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
  }
}
