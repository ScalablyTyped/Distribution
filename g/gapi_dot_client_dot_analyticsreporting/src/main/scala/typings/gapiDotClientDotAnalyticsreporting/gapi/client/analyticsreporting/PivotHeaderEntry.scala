package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeaderEntry extends js.Object {
  /** The name of the dimensions in the pivot response. */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The values for the dimensions in the pivot. */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.undefined
  /** The metric header for the metric in the pivot. */
  var metric: js.UndefOr[MetricHeaderEntry] = js.undefined
}

object PivotHeaderEntry {
  @scala.inline
  def apply(
    dimensionNames: js.Array[String] = null,
    dimensionValues: js.Array[String] = null,
    metric: MetricHeaderEntry = null
  ): PivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames)
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    __obj.asInstanceOf[PivotHeaderEntry]
  }
}

