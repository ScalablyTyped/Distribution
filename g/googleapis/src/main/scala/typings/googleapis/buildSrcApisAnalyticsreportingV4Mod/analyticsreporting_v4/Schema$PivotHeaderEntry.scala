package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for the each of the metric column corresponding to the metrics
  * requested in the pivots section of the response.
  */
@js.native
trait Schema$PivotHeaderEntry extends js.Object {
  /**
    * The name of the dimensions in the pivot response.
    */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The values for the dimensions in the pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The metric header for the metric in the pivot.
    */
  var metric: js.UndefOr[Schema$MetricHeaderEntry] = js.native
}

object Schema$PivotHeaderEntry {
  @scala.inline
  def apply(
    dimensionNames: js.Array[String] = null,
    dimensionValues: js.Array[String] = null,
    metric: Schema$MetricHeaderEntry = null
  ): Schema$PivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames.asInstanceOf[js.Any])
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotHeaderEntry]
  }
}

