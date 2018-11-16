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

