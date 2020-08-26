package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementAssignment extends js.Object {
  /** Whether this placement assignment is active. When true, the placement will be included in the ad's rotation. */
  var active: js.UndefOr[Boolean] = js.native
  /** ID of the placement to be assigned. This is a required field. */
  var placementId: js.UndefOr[String] = js.native
  /** Dimension value for the ID of the placement. This is a read-only, auto-generated field. */
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Whether the placement to be assigned requires SSL. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslRequired: js.UndefOr[Boolean] = js.native
}

object PlacementAssignment {
  @scala.inline
  def apply(): PlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementAssignment]
  }
  @scala.inline
  implicit class PlacementAssignmentOps[Self <: PlacementAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setPlacementId(value: String): Self = this.set("placementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementId: Self = this.set("placementId", js.undefined)
    @scala.inline
    def setPlacementIdDimensionValue(value: DimensionValue): Self = this.set("placementIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementIdDimensionValue: Self = this.set("placementIdDimensionValue", js.undefined)
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
  }
  
}

