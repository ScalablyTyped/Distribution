package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyQueryParameters extends js.Object {
  var calendarExpansionMax: js.UndefOr[integer] = js.undefined
  var groupExpansionMax: js.UndefOr[integer] = js.undefined
  var items: js.Array[Anon_Id]
  var timeMax: datetime
  var timeMin: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object FreeBusyQueryParameters {
  @scala.inline
  def apply(
    items: js.Array[Anon_Id],
    timeMax: datetime,
    timeMin: datetime,
    calendarExpansionMax: Int | Double = null,
    groupExpansionMax: Int | Double = null,
    timeZone: String = null
  ): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    if (calendarExpansionMax != null) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax.asInstanceOf[js.Any])
    if (groupExpansionMax != null) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
}

