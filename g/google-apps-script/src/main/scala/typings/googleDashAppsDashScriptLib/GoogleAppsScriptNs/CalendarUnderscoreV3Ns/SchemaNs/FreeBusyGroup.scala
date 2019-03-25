package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyGroup extends js.Object {
  var calendars: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

object FreeBusyGroup {
  @scala.inline
  def apply(calendars: js.Array[java.lang.String] = null, errors: js.Array[Error] = null): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[FreeBusyGroup]
  }
}

