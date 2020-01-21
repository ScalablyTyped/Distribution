package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeaderEntry extends js.Object {
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
  var dimensionValues: js.UndefOr[js.Array[String]] = js.undefined
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
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames.asInstanceOf[js.Any])
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHeaderEntry]
  }
}

