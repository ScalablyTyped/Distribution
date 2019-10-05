package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeValues extends js.Object {
  var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object DateRangeValues {
  @scala.inline
  def apply(pivotValueRegions: js.Array[PivotValueRegion] = null, values: js.Array[String] = null): DateRangeValues = {
    val __obj = js.Dynamic.literal()
    if (pivotValueRegions != null) __obj.updateDynamic("pivotValueRegions")(pivotValueRegions)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DateRangeValues]
  }
}

