package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementAssignment extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var placementId: js.UndefOr[String] = js.undefined
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var sslRequired: js.UndefOr[Boolean] = js.undefined
}

object PlacementAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    placementId: String = null,
    placementIdDimensionValue: DimensionValue = null,
    sslRequired: js.UndefOr[Boolean] = js.undefined
  ): PlacementAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (placementId != null) __obj.updateDynamic("placementId")(placementId.asInstanceOf[js.Any])
    if (placementIdDimensionValue != null) __obj.updateDynamic("placementIdDimensionValue")(placementIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementAssignment]
  }
}

