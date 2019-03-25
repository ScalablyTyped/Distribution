package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  var calendarExpansionMax: js.UndefOr[scala.Double] = js.undefined
  var groupExpansionMax: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyRequest {
  @scala.inline
  def apply(
    calendarExpansionMax: scala.Int | scala.Double = null,
    groupExpansionMax: scala.Int | scala.Double = null,
    items: js.Array[FreeBusyRequestItem] = null,
    timeMax: java.lang.String = null,
    timeMin: java.lang.String = null,
    timeZone: java.lang.String = null
  ): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    if (calendarExpansionMax != null) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.asInstanceOf[js.Any])
    if (groupExpansionMax != null) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax)
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[FreeBusyRequest]
  }
}

