package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.ScopeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: ScopeType
  var value: js.UndefOr[String] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: ScopeType, value: String = null): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

