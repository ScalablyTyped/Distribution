package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Building extends js.Object {
  
  var address: js.UndefOr[BuildingAddress] = js.native
  
  var buildingId: js.UndefOr[String] = js.native
  
  var buildingName: js.UndefOr[String] = js.native
  
  var coordinates: js.UndefOr[BuildingCoordinates] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var etags: js.UndefOr[String] = js.native
  
  var floorNames: js.UndefOr[js.Array[String]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object Building {
  
  @scala.inline
  def apply(): Building = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Building]
  }
  
  @scala.inline
  implicit class BuildingOps[Self <: Building] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: BuildingAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    
    @scala.inline
    def setBuildingName(value: String): Self = this.set("buildingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingName: Self = this.set("buildingName", js.undefined)
    
    @scala.inline
    def setCoordinates(value: BuildingCoordinates): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    
    @scala.inline
    def setFloorNamesVarargs(value: String*): Self = this.set("floorNames", js.Array(value :_*))
    
    @scala.inline
    def setFloorNames(value: js.Array[String]): Self = this.set("floorNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorNames: Self = this.set("floorNames", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
