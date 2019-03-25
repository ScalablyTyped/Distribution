package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyResponse extends js.Object {
  var calendars: js.UndefOr[js.Object] = js.undefined
  var groups: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyResponse {
  @scala.inline
  def apply(
    calendars: js.Object = null,
    groups: js.Object = null,
    kind: java.lang.String = null,
    timeMax: java.lang.String = null,
    timeMin: java.lang.String = null
  ): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax)
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin)
    __obj.asInstanceOf[FreeBusyResponse]
  }
}

