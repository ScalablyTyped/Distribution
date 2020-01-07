package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
@js.native
trait Schema$DateRangeValues extends js.Object {
  /**
    * The values of each pivot region.
    */
  var pivotValueRegions: js.UndefOr[js.Array[Schema$PivotValueRegion]] = js.native
  /**
    * Each value corresponds to each Metric in the request.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DateRangeValues {
  @scala.inline
  def apply(pivotValueRegions: js.Array[Schema$PivotValueRegion] = null, values: js.Array[String] = null): Schema$DateRangeValues = {
    val __obj = js.Dynamic.literal()
    if (pivotValueRegions != null) __obj.updateDynamic("pivotValueRegions")(pivotValueRegions.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DateRangeValues]
  }
}

