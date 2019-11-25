package typings.gapiDotClientDotDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  /** Whether the schedule is active or not. Must be set to either true or false. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Defines every how many days, weeks or months the report should be run. Needs to be set when "repeats" is either "DAILY", "WEEKLY" or "MONTHLY". */
  var every: js.UndefOr[Double] = js.undefined
  /** The expiration date when the scheduled report stops running. */
  var expirationDate: js.UndefOr[String] = js.undefined
  /**
    * The interval for which the report is repeated. Note:
    * - "DAILY" also requires field "every" to be set.
    * - "WEEKLY" also requires fields "every" and "repeatsOnWeekDays" to be set.
    * - "MONTHLY" also requires fields "every" and "runsOnDayOfMonth" to be set.
    */
  var repeats: js.UndefOr[String] = js.undefined
  /** List of week days "WEEKLY" on which scheduled reports should run. */
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enum to define for "MONTHLY" scheduled reports whether reports should be repeated on the same day of the month as "startDate" or the same day of the
    * week of the month.
    * Example: If 'startDate' is Monday, April 2nd 2012 (2012-04-02), "DAY_OF_MONTH" would run subsequent reports on the 2nd of every Month, and
    * "WEEK_OF_MONTH" would run subsequent reports on the first Monday of the month.
    */
  var runsOnDayOfMonth: js.UndefOr[String] = js.undefined
  /** Start date of date range for which scheduled reports should be run. */
  var startDate: js.UndefOr[String] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    every: Int | Double = null,
    expirationDate: String = null,
    repeats: String = null,
    repeatsOnWeekDays: js.Array[String] = null,
    runsOnDayOfMonth: String = null,
    startDate: String = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (every != null) __obj.updateDynamic("every")(every.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (repeats != null) __obj.updateDynamic("repeats")(repeats.asInstanceOf[js.Any])
    if (repeatsOnWeekDays != null) __obj.updateDynamic("repeatsOnWeekDays")(repeatsOnWeekDays.asInstanceOf[js.Any])
    if (runsOnDayOfMonth != null) __obj.updateDynamic("runsOnDayOfMonth")(runsOnDayOfMonth.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

