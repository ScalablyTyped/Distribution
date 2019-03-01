package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValueRequest extends js.Object {
  /** The name of the dimension for which values should be requested. */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /** The end date of the date range for which to retrieve dimension values. A string of the format "yyyy-MM-dd". */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** The list of filters by which to filter values. The filters are ANDed. */
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  /** The kind of request this is, in this case dfareporting#dimensionValueRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The start date of the date range for which to retrieve dimension values. A string of the format "yyyy-MM-dd". */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionValueRequest {
  @scala.inline
  def apply(
    dimensionName: java.lang.String = null,
    endDate: java.lang.String = null,
    filters: js.Array[DimensionFilter] = null,
    kind: java.lang.String = null,
    startDate: java.lang.String = null
  ): DimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DimensionValueRequest]
  }
}

