package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequestItem extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object FreeBusyRequestItem {
  @scala.inline
  def apply(id: String = null): FreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[FreeBusyRequestItem]
  }
}

