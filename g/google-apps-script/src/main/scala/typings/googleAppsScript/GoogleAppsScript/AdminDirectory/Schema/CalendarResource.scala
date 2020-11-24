package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarResource extends js.Object {
  
  var buildingId: js.UndefOr[String] = js.native
  
  var capacity: js.UndefOr[Double] = js.native
  
  var etags: js.UndefOr[String] = js.native
  
  var featureInstances: js.UndefOr[js.Object] = js.native
  
  var floorName: js.UndefOr[String] = js.native
  
  var floorSection: js.UndefOr[String] = js.native
  
  var generatedResourceName: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var resourceCategory: js.UndefOr[String] = js.native
  
  var resourceDescription: js.UndefOr[String] = js.native
  
  var resourceEmail: js.UndefOr[String] = js.native
  
  var resourceId: js.UndefOr[String] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
  
  var resourceType: js.UndefOr[String] = js.native
  
  var userVisibleDescription: js.UndefOr[String] = js.native
}
object CalendarResource {
  
  @scala.inline
  def apply(): CalendarResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarResource]
  }
  
  @scala.inline
  implicit class CalendarResourceOps[Self <: CalendarResource] (val x: Self) extends AnyVal {
    
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
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    
    @scala.inline
    def setFeatureInstances(value: js.Object): Self = this.set("featureInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureInstances: Self = this.set("featureInstances", js.undefined)
    
    @scala.inline
    def setFloorName(value: String): Self = this.set("floorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorName: Self = this.set("floorName", js.undefined)
    
    @scala.inline
    def setFloorSection(value: String): Self = this.set("floorSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorSection: Self = this.set("floorSection", js.undefined)
    
    @scala.inline
    def setGeneratedResourceName(value: String): Self = this.set("generatedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedResourceName: Self = this.set("generatedResourceName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourceCategory(value: String): Self = this.set("resourceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCategory: Self = this.set("resourceCategory", js.undefined)
    
    @scala.inline
    def setResourceDescription(value: String): Self = this.set("resourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDescription: Self = this.set("resourceDescription", js.undefined)
    
    @scala.inline
    def setResourceEmail(value: String): Self = this.set("resourceEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceEmail: Self = this.set("resourceEmail", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setUserVisibleDescription(value: String): Self = this.set("userVisibleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleDescription: Self = this.set("userVisibleDescription", js.undefined)
  }
}
