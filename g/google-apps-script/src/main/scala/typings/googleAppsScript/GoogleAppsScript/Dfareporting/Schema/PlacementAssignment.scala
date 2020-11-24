package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementAssignment extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var placementId: js.UndefOr[String] = js.native
  
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
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
