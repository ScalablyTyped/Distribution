package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeValues extends js.Object {
  var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.undefined
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DateRangeValues {
  @scala.inline
  def apply(pivotValueRegions: js.Array[PivotValueRegion] = null, values: js.Array[java.lang.String] = null): DateRangeValues = {
    val __obj = js.Dynamic.literal()
    if (pivotValueRegions != null) __obj.updateDynamic("pivotValueRegions")(pivotValueRegions)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DateRangeValues]
  }
}

