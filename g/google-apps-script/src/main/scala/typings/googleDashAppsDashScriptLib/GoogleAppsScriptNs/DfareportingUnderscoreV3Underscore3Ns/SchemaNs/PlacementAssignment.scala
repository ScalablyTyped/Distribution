package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementAssignment extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var placementId: js.UndefOr[java.lang.String] = js.undefined
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object PlacementAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    placementId: java.lang.String = null,
    placementIdDimensionValue: DimensionValue = null,
    sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): PlacementAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (placementId != null) __obj.updateDynamic("placementId")(placementId)
    if (placementIdDimensionValue != null) __obj.updateDynamic("placementIdDimensionValue")(placementIdDimensionValue)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    __obj.asInstanceOf[PlacementAssignment]
  }
}

