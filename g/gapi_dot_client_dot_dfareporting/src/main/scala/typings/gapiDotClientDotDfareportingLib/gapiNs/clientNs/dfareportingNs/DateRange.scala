package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /** The end date of the date range, inclusive. A string of the format: "yyyy-MM-dd". */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dateRange. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The date range relative to the date of when the report is run. */
  var relativeDateRange: js.UndefOr[java.lang.String] = js.undefined
  /** The start date of the date range, inclusive. A string of the format: "yyyy-MM-dd". */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(
    endDate: java.lang.String = null,
    kind: java.lang.String = null,
    relativeDateRange: java.lang.String = null,
    startDate: java.lang.String = null
  ): DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DateRange]
  }
}

