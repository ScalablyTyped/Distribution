package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRow extends js.Object {
  /** List of requested dimensions. */
  var dimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of metrics for each requested DateRange. */
  var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

