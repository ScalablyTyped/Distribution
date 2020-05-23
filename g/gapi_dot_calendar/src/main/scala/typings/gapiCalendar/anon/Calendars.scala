package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendars extends js.Object {
  var calendars: js.Array[String]
  var errors: js.UndefOr[js.Array[Domain]] = js.undefined
}

object Calendars {
  @scala.inline
  def apply(calendars: js.Array[String], errors: js.Array[Domain] = null): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
}

