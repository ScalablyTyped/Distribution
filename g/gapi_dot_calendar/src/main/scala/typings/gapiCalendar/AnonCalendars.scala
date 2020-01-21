package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendars extends js.Object {
  var calendars: js.Array[String]
  var errors: js.UndefOr[js.Array[AnonDomain]] = js.undefined
}

object AnonCalendars {
  @scala.inline
  def apply(calendars: js.Array[String], errors: js.Array[AnonDomain] = null): AnonCalendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendars]
  }
}

