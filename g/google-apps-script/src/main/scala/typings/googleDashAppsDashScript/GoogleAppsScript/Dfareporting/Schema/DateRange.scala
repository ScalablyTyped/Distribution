package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var endDate: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var relativeDateRange: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(
    endDate: String = null,
    kind: String = null,
    relativeDateRange: String = null,
    startDate: String = null
  ): DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DateRange]
  }
}

