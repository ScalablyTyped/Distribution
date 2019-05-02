package typings
package fundamentalDashReactLib.libCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarBaseProps extends js.Object {
  /* Blocks dates that are in between the blocked dates. */
  var blockedDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
  /* Disables dates of a calendar that come after the specified date. */
  var disableAfterDate: js.UndefOr[stdLib.Date] = js.undefined
  /* Disables dates of a calendar that come before the specified date. */
  var disableBeforeDate: js.UndefOr[stdLib.Date] = js.undefined
  /* Set to **true** to disable dates after today's date. */
  var disableFutureDates: js.UndefOr[scala.Boolean] = js.undefined
  /* Set to **true** to disable dates before today's date. */
  var disablePastDates: js.UndefOr[scala.Boolean] = js.undefined
  /* Disables dates that match a weekday. */
  var disableWeekday: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /* Set to **true** to disables dates that match a weekend. */
  var disableWeekends: js.UndefOr[scala.Boolean] = js.undefined
  /* Disables dates that are in between the disabled dates. */
  var disabledDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
}

object CalendarBaseProps {
  @scala.inline
  def apply(
    blockedDates: js.Array[stdLib.Date] = null,
    disableAfterDate: stdLib.Date = null,
    disableBeforeDate: stdLib.Date = null,
    disableFutureDates: js.UndefOr[scala.Boolean] = js.undefined,
    disablePastDates: js.UndefOr[scala.Boolean] = js.undefined,
    disableWeekday: js.Array[java.lang.String] = null,
    disableWeekends: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDates: js.Array[stdLib.Date] = null
  ): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates)
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate)
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate)
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates)
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates)
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday)
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    __obj.asInstanceOf[CalendarBaseProps]
  }
}

