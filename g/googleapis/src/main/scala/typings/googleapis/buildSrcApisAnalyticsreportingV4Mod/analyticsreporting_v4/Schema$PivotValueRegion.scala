package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metric values in the pivot region.
  */
@js.native
trait Schema$PivotValueRegion extends js.Object {
  /**
    * The values of the metrics in each of the pivot regions.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PivotValueRegion {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotValueRegion]
  }
}

