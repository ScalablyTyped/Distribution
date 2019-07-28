package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

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
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (placementId != null) __obj.updateDynamic("placementId")(placementId)
    if (placementIdDimensionValue != null) __obj.updateDynamic("placementIdDimensionValue")(placementIdDimensionValue)
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired)
    __obj.asInstanceOf[PlacementAssignment]
  }
}

