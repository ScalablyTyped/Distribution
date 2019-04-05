package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRow extends js.Object {
  var dimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

object ReportRow {
  @scala.inline
  def apply(dimensions: js.Array[java.lang.String] = null, metrics: js.Array[DateRangeValues] = null): ReportRow = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    __obj.asInstanceOf[ReportRow]
  }
}

