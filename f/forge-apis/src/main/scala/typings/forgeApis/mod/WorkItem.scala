package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItem extends StObject {
  
  var ActivityId: String
  
  var Arguments: js.Object
  
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  var Id: String
  
  var Status: js.UndefOr[String] = js.undefined
  
  var StatusDetail: js.UndefOr[js.Object] = js.undefined
  
  var Timestamp: js.UndefOr[String] = js.undefined
  
  var Version: js.UndefOr[Double] = js.undefined
}
object WorkItem {
  
  @scala.inline
  def apply(ActivityId: String, Arguments: js.Object, Id: String): WorkItem = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit class WorkItemMutableBuilder[Self <: WorkItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: String): Self = StObject.set(x, "ActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArguments(value: js.Object): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetail(value: js.Object): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
