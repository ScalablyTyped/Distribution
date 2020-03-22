package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikState[Values] extends js.Object {
  /** map of field names to specific error for that field */
  var errors: FormikErrors[Values]
  /** whether the form is currently submitting */
  var isSubmitting: Boolean
  /** whether the form is currently validating (prior to submission) */
  var isValidating: Boolean
  /** Top level status state, in case you need it */
  var status: js.UndefOr[js.Any] = js.undefined
  /** Number of times user tried to submit the form */
  var submitCount: Double
  /** map of field names to whether the field has been touched */
  var touched: FormikTouched[Values]
  /** Form values */
  var values: Values
}

object FormikState {
  @scala.inline
  def apply[Values](
    errors: FormikErrors[Values],
    isSubmitting: Boolean,
    isValidating: Boolean,
    submitCount: Double,
    touched: FormikTouched[Values],
    values: Values,
    status: js.Any = null
  ): FormikState[Values] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], submitCount = submitCount.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikState[Values]]
  }
}

