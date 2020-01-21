package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.ScopeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeValue extends js.Object {
  var `type`: ScopeType
  var value: js.UndefOr[String] = js.undefined
}

object AnonTypeValue {
  @scala.inline
  def apply(`type`: ScopeType, value: String = null): AnonTypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeValue]
  }
}

