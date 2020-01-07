package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FreeBusyRequestItem extends js.Object {
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$FreeBusyRequestItem {
  @scala.inline
  def apply(id: String = null): Schema$FreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FreeBusyRequestItem]
  }
}

