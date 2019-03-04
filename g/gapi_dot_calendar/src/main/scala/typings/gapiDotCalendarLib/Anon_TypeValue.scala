package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ScopeType
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ScopeType, value: java.lang.String = null): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

