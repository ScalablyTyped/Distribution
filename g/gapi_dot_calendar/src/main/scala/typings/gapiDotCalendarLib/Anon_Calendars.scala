package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendars extends js.Object {
  var calendars: js.Array[java.lang.String]
  var errors: js.UndefOr[js.Array[Anon_Domain]] = js.undefined
}

object Anon_Calendars {
  @scala.inline
  def apply(calendars: js.Array[java.lang.String], errors: js.Array[Anon_Domain] = null): Anon_Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Calendars]
  }
}

