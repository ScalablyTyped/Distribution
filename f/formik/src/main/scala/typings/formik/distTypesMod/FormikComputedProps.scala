package typings.formik.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikComputedProps[Values] extends js.Object {
  val dirty: Boolean
  val initialValues: Values
  val isValid: Boolean
}

object FormikComputedProps {
  @scala.inline
  def apply[Values](dirty: Boolean, initialValues: Values, isValid: Boolean): FormikComputedProps[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty, initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid)
  
    __obj.asInstanceOf[FormikComputedProps[Values]]
  }
}

