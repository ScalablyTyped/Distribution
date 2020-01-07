package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FreeBusyGroup extends js.Object {
  /**
    * List of calendars&#39; identifiers within a group.
    */
  var calendars: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional error(s) (if computation for the group failed).
    */
  var errors: js.UndefOr[js.Array[Schema$Error]] = js.native
}

object Schema$FreeBusyGroup {
  @scala.inline
  def apply(calendars: js.Array[String] = null, errors: js.Array[Schema$Error] = null): Schema$FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FreeBusyGroup]
  }
}

