package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsRequest extends StObject {
  
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaScheduleTransferRunsRequest {
  
  @scala.inline
  def apply(): SchemaScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsRequest]
  }
  
  @scala.inline
  implicit class SchemaScheduleTransferRunsRequestMutableBuilder[Self <: SchemaScheduleTransferRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
