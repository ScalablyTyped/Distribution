package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /** The end date of the date range, inclusive. A string of the format: "yyyy-MM-dd". */
  var endDate: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dateRange. */
  var kind: js.UndefOr[String] = js.undefined
  /** The date range relative to the date of when the report is run. */
  var relativeDateRange: js.UndefOr[String] = js.undefined
  /** The start date of the date range, inclusive. A string of the format: "yyyy-MM-dd". */
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
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
}

