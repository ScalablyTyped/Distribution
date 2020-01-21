package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySchedule extends js.Object {
  /** Datetime to periodically run the query until. */
  var endTimeMs: js.UndefOr[String] = js.undefined
  /** How often the query is run. */
  var frequency: js.UndefOr[String] = js.undefined
  /** Time of day at which a new report will be generated, represented as minutes past midnight. Range is 0 to 1439. Only applies to scheduled reports. */
  var nextRunMinuteOfDay: js.UndefOr[Double] = js.undefined
  /** Canonical timezone code for report generation time. Defaults to America/New_York. */
  var nextRunTimezoneCode: js.UndefOr[String] = js.undefined
}

object QuerySchedule {
  @scala.inline
  def apply(
    endTimeMs: String = null,
    frequency: String = null,
    nextRunMinuteOfDay: Int | Double = null,
    nextRunTimezoneCode: String = null
  ): QuerySchedule = {
    val __obj = js.Dynamic.literal()
    if (endTimeMs != null) __obj.updateDynamic("endTimeMs")(endTimeMs.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (nextRunMinuteOfDay != null) __obj.updateDynamic("nextRunMinuteOfDay")(nextRunMinuteOfDay.asInstanceOf[js.Any])
    if (nextRunTimezoneCode != null) __obj.updateDynamic("nextRunTimezoneCode")(nextRunTimezoneCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySchedule]
  }
}

