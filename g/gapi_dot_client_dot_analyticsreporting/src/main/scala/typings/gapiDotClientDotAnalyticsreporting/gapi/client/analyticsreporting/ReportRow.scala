package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportRow extends js.Object {
  /** List of requested dimensions. */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  /** List of metrics for each requested DateRange. */
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

