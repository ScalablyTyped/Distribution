package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(endDate: java.lang.String = null, startDate: java.lang.String = null): DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DateRange]
  }
}

