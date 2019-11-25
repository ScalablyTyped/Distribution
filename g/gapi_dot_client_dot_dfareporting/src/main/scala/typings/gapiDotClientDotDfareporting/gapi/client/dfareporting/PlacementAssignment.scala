package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementAssignment extends js.Object {
  /** Whether this placement assignment is active. When true, the placement will be included in the ad's rotation. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** ID of the placement to be assigned. This is a required field. */
  var placementId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the placement. This is a read-only, auto-generated field. */
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether the placement to be assigned requires SSL. This is a read-only field that is auto-generated when the ad is inserted or updated. */
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

