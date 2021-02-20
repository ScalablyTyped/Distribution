package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsRequest extends StObject {
  
  /**
    * Specific run_time for a transfer run to be started. The
    * requested_run_time must not be in the future.
    */
  var requestedRunTime: js.UndefOr[String] = js.native
  
  /**
    * Time range for the transfer runs that should be started.
    */
  var requestedTimeRange: js.UndefOr[SchemaTimeRange] = js.native
}
object SchemaStartManualTransferRunsRequest {
  
  @scala.inline
  def apply(): SchemaStartManualTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartManualTransferRunsRequest]
  }
  
  @scala.inline
  implicit class SchemaStartManualTransferRunsRequestMutableBuilder[Self <: SchemaStartManualTransferRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedRunTime(value: String): Self = StObject.set(x, "requestedRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedRunTimeUndefined: Self = StObject.set(x, "requestedRunTime", js.undefined)
    
    @scala.inline
    def setRequestedTimeRange(value: SchemaTimeRange): Self = StObject.set(x, "requestedTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedTimeRangeUndefined: Self = StObject.set(x, "requestedTimeRange", js.undefined)
  }
}
