package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikComputedProps[Values] extends js.Object {
  val dirty: scala.Boolean
  val initialValues: Values
  val isValid: scala.Boolean
}

object FormikComputedProps {
  @scala.inline
  def apply[Values](dirty: scala.Boolean, initialValues: Values, isValid: scala.Boolean): FormikComputedProps[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty, initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid)
  
    __obj.asInstanceOf[FormikComputedProps[Values]]
  }
}

