package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyQueryParameters extends js.Object {
  var calendarExpansionMax: js.UndefOr[integer] = js.undefined
  var groupExpansionMax: js.UndefOr[integer] = js.undefined
  var items: js.Array[gapiDotCalendarLib.Anon_Id]
  var timeMax: datetime
  var timeMin: datetime
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyQueryParameters {
  @scala.inline
  def apply(
    items: js.Array[gapiDotCalendarLib.Anon_Id],
    timeMax: datetime,
    timeMin: datetime,
    calendarExpansionMax: js.UndefOr[integer] = js.undefined,
    groupExpansionMax: js.UndefOr[integer] = js.undefined,
    timeZone: java.lang.String = null
  ): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("timeMax")(timeMax)
    __obj.updateDynamic("timeMin")(timeMin)
    if (!js.isUndefined(calendarExpansionMax)) __obj.updateDynamic("calendarExpansionMax")(calendarExpansionMax)
    if (!js.isUndefined(groupExpansionMax)) __obj.updateDynamic("groupExpansionMax")(groupExpansionMax)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
}

