package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPropertyValue extends js.Object {
  def getPropertyValue(prop: java.lang.String): java.lang.String
}

object Anon_GetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: js.Function1[java.lang.String, java.lang.String]): Anon_GetPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.asInstanceOf[Anon_GetPropertyValue]
  }
}

