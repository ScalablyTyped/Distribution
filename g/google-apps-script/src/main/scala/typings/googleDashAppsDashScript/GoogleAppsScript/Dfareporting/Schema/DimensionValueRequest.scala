package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValueRequest extends js.Object {
  var dimensionName: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
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

