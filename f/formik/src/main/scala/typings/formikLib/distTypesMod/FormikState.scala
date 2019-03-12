package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikState[Values] extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var errors: FormikErrors[Values]
  var isSubmitting: scala.Boolean
  var isValidating: scala.Boolean
  var status: js.UndefOr[js.Any] = js.undefined
  var submitCount: scala.Double
  var touched: FormikTouched[Values]
  var values: Values
}

object FormikState {
  @scala.inline
  def apply[Values](
    errors: FormikErrors[Values],
    isSubmitting: scala.Boolean,
    isValidating: scala.Boolean,
    submitCount: scala.Double,
    touched: FormikTouched[Values],
    values: Values,
    error: js.Any = null,
    status: js.Any = null
  ): FormikState[Values] = {
    val __obj = js.Dynamic.literal(errors = errors, isSubmitting = isSubmitting, isValidating = isValidating, submitCount = submitCount, touched = touched, values = values.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[FormikState[Values]]
  }
}

