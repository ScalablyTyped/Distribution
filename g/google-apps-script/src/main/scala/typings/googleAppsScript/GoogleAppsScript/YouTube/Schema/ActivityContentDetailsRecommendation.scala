package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsRecommendation extends js.Object {
  
  var reason: js.UndefOr[String] = js.native
  
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  var seedResourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsRecommendation {
  
  @scala.inline
  def apply(): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsRecommendationOps[Self <: ActivityContentDetailsRecommendation] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setSeedResourceId(value: ResourceId): Self = this.set("seedResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeedResourceId: Self = this.set("seedResourceId", js.undefined)
  }
}
