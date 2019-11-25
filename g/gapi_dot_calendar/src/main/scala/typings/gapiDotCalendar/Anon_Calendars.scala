package typings.gapiDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendars extends js.Object {
  var calendars: js.Array[String]
  var errors: js.UndefOr[js.Array[Anon_Domain]] = js.undefined
}

object Anon_Calendars {
  @scala.inline
  def apply(calendars: js.Array[String], errors: js.Array[Anon_Domain] = null): Anon_Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Calendars]
  }
}

