package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikComputedProps[Values] extends js.Object {
  /** True if any input has been touched. False otherwise. */
  val dirty: Boolean
  /** The initial errors of the form */
  val initialErrors: FormikErrors[Values]
  /** The initial status of the form */
  val initialStatus: js.UndefOr[js.Any] = js.undefined
  /** The initial visited fields of the form */
  val initialTouched: FormikTouched[Values]
  /** The initial values of the form */
  val initialValues: Values
  /** True if state.errors is empty */
  val isValid: Boolean
}

object FormikComputedProps {
  @scala.inline
  def apply[Values](
    dirty: Boolean,
    initialErrors: FormikErrors[Values],
    initialTouched: FormikTouched[Values],
    initialValues: Values,
    isValid: Boolean,
    initialStatus: js.Any = null
  ): FormikComputedProps[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], initialErrors = initialErrors.asInstanceOf[js.Any], initialTouched = initialTouched.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikComputedProps[Values]]
  }
}

