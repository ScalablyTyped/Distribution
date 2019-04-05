package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValueRequest extends js.Object {
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
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

