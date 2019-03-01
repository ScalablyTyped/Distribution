package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySchedule extends js.Object {
  /** Datetime to periodically run the query until. */
  var endTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** How often the query is run. */
  var frequency: js.UndefOr[java.lang.String] = js.undefined
  /** Time of day at which a new report will be generated, represented as minutes past midnight. Range is 0 to 1439. Only applies to scheduled reports. */
  var nextRunMinuteOfDay: js.UndefOr[scala.Double] = js.undefined
  /** Canonical timezone code for report generation time. Defaults to America/New_York. */
  var nextRunTimezoneCode: js.UndefOr[java.lang.String] = js.undefined
}

object QuerySchedule {
  @scala.inline
  def apply(
    endTimeMs: java.lang.String = null,
    frequency: java.lang.String = null,
    nextRunMinuteOfDay: scala.Int | scala.Double = null,
    nextRunTimezoneCode: java.lang.String = null
  ): QuerySchedule = {
    val __obj = js.Dynamic.literal()
    if (endTimeMs != null) __obj.updateDynamic("endTimeMs")(endTimeMs)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency)
    if (nextRunMinuteOfDay != null) __obj.updateDynamic("nextRunMinuteOfDay")(nextRunMinuteOfDay.asInstanceOf[js.Any])
    if (nextRunTimezoneCode != null) __obj.updateDynamic("nextRunTimezoneCode")(nextRunTimezoneCode)
    __obj.asInstanceOf[QuerySchedule]
  }
}

