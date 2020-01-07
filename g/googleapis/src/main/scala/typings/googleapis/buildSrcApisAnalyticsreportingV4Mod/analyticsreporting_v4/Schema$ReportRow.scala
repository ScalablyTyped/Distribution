package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row in the report.
  */
@js.native
trait Schema$ReportRow extends js.Object {
  /**
    * List of requested dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of metrics for each requested DateRange.
    */
  var metrics: js.UndefOr[js.Array[Schema$DateRangeValues]] = js.native
}

object Schema$ReportRow {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metrics: js.Array[Schema$DateRangeValues] = null): Schema$ReportRow = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportRow]
  }
}

