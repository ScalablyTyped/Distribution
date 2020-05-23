package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyQueryParameters extends js.Object {
  var calendarExpansionMax: js.UndefOr[integer] = js.undefined
  var groupExpansionMax: js.UndefOr[integer] = js.undefined
  var items: js.Array[Id]
  var timeMax: datetime
  var timeMin: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object FreeBusyQueryParameters {
  @scala.inline
  def apply(
    items: js.Array[Id],
    timeMax: datetime,
    timeMin: datetime,
    calendarExpansionMax: js.UndefOr[integer] = js.undefined,
    groupExpansionMax: js.UndefOr[integer] = js.undefined,
    timeZone: String = null
  ): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    if (!js.isUndefined(calendarExpansionMax)) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupExpansionMax)) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.get.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
}

