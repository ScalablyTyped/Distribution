package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

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
    calendarExpansionMax: js.UndefOr[integer] = js.undefined,
    groupExpansionMax: js.UndefOr[integer] = js.undefined,
    timeZone: String = null
  ): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items, timeMax = timeMax, timeMin = timeMin)
    if (!js.isUndefined(calendarExpansionMax)) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax)
    if (!js.isUndefined(groupExpansionMax)) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
}

