package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValueRequest extends js.Object {
  /** The name of the dimension for which values should be requested. */
  var dimensionName: js.UndefOr[String] = js.undefined
  /** The end date of the date range for which to retrieve dimension values. A string of the format "yyyy-MM-dd". */
  var endDate: js.UndefOr[String] = js.undefined
  /** The list of filters by which to filter values. The filters are ANDed. */
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  /** The kind of request this is, in this case dfareporting#dimensionValueRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** The start date of the date range for which to retrieve dimension values. A string of the format "yyyy-MM-dd". */
  var startDate: js.UndefOr[String] = js.undefined
}

object DimensionValueRequest {
  @scala.inline
  def apply(
    dimensionName: String = null,
    endDate: String = null,
    filters: js.Array[DimensionFilter] = null,
    kind: String = null,
    startDate: String = null
  ): DimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionValueRequest]
  }
}

