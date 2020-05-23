package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.ScopeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var `type`: ScopeType
  var value: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(`type`: ScopeType, value: String = null): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

