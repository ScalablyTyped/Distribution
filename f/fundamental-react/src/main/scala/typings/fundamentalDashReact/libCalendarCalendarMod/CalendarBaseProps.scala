package typings.fundamentalDashReact.libCalendarCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarBaseProps extends js.Object {
  /* Blocks dates that are in between the blocked dates. */
  var blockedDates: js.UndefOr[js.Array[Date]] = js.undefined
  /* Disables dates of a calendar that come after the specified date. */
  var disableAfterDate: js.UndefOr[Date] = js.undefined
  /* Disables dates of a calendar that come before the specified date. */
  var disableBeforeDate: js.UndefOr[Date] = js.undefined
  /* Set to **true** to disable dates after today's date. */
  var disableFutureDates: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to disable dates before today's date. */
  var disablePastDates: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that match a weekday. */
  var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
  /* Set to **true** to disables dates that match a weekend. */
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  /* Disables dates that are in between the disabled dates. */
  var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
}

object CalendarBaseProps {
  @scala.inline
  def apply(
    blockedDates: js.Array[Date] = null,
    disableAfterDate: Date = null,
    disableBeforeDate: Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] = null
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

