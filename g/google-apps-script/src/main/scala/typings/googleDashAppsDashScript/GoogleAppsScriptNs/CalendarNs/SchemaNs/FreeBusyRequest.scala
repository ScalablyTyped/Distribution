package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyRequest extends js.Object {
  var calendarExpansionMax: js.UndefOr[Double] = js.undefined
  var groupExpansionMax: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  var timeMax: js.UndefOr[String] = js.undefined
  var timeMin: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object FreeBusyRequest {
  @scala.inline
  def apply(
    calendarExpansionMax: Int | Double = null,
    groupExpansionMax: Int | Double = null,
    items: js.Array[FreeBusyRequestItem] = null,
    timeMax: String = null,
    timeMin: String = null,
    timeZone: String = null
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

