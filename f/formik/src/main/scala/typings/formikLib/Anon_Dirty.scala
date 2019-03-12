package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dirty[Values] extends js.Object {
  var dirty: scala.Boolean
  var initialValues: Values
  var isValid: scala.Boolean
}

object Anon_Dirty {
  @scala.inline
  def apply[Values](dirty: scala.Boolean, initialValues: Values, isValid: scala.Boolean): Anon_Dirty[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty, initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid)
  
    __obj.asInstanceOf[Anon_Dirty[Values]]
  }
}

