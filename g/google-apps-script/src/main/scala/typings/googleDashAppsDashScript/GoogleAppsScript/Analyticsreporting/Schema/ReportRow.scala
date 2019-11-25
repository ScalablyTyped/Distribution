package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRow extends js.Object {
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

object ReportRow {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metrics: js.Array[DateRangeValues] = null): ReportRow = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportRow]
  }
}

