package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequestItem extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyRequestItem {
  @scala.inline
  def apply(id: java.lang.String = null): FreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[FreeBusyRequestItem]
  }
}

