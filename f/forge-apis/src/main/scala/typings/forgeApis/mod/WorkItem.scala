package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItem extends js.Object {
  
  var ActivityId: String = js.native
  
  var Arguments: js.Object = js.native
  
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  var Id: String = js.native
  
  var Status: js.UndefOr[String] = js.native
  
  var StatusDetail: js.UndefOr[js.Object] = js.native
  
  var Timestamp: js.UndefOr[String] = js.native
  
  var Version: js.UndefOr[Double] = js.native
}
object WorkItem {
  
  @scala.inline
  def apply(ActivityId: String, Arguments: js.Object, Id: String): WorkItem = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    
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
    def setActivityId(value: String): Self = this.set("ActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArguments(value: js.Object): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: js.Object): Self = this.set("StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetail: Self = this.set("StatusDetail", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
