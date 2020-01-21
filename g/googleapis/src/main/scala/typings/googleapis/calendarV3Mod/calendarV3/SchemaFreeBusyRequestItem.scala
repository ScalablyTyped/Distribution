package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyRequestItem extends js.Object {
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaFreeBusyRequestItem {
  @scala.inline
  def apply(id: String = null): SchemaFreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFreeBusyRequestItem]
  }
}

