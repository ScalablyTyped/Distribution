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
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DimensionValueRequest]
  }
}

