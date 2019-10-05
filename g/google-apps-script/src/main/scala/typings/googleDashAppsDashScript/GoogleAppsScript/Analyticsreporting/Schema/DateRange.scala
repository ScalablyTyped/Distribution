package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var endDate: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(endDate: String = null, startDate: String = null): DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DateRange]
  }
}

