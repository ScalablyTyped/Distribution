package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormikState[Values] extends js.Object {
  
  /** map of field names to specific error for that field */
  var errors: FormikErrors[Values] = js.native
  
  /** whether the form is currently submitting */
  var isSubmitting: Boolean = js.native
  
  /** whether the form is currently validating (prior to submission) */
  var isValidating: Boolean = js.native
  
  /** Top level status state, in case you need it */
  var status: js.UndefOr[js.Any] = js.native
  
  /** Number of times user tried to submit the form */
  var submitCount: Double = js.native
  
  /** map of field names to whether the field has been touched */
  var touched: FormikTouched[Values] = js.native
  
  /** Form values */
  var values: Values = js.native
}
object FormikState {
  
  @scala.inline
  def apply[Values](
    errors: FormikErrors[Values],
    isSubmitting: Boolean,
    isValidating: Boolean,
    submitCount: Double,
    touched: FormikTouched[Values],
    values: Values
  ): FormikState[Values] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], submitCount = submitCount.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikState[Values]]
  }
  
  @scala.inline
  implicit class FormikStateOps[Self <: FormikState[_], Values] (val x: Self with FormikState[Values]) extends AnyVal {
    
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
    def setErrors(value: FormikErrors[Values]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubmitting(value: Boolean): Self = this.set("isSubmitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidating(value: Boolean): Self = this.set("isValidating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitCount(value: Double): Self = this.set("submitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouched(value: FormikTouched[Values]): Self = this.set("touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Values): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
