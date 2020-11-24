package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsRequest extends js.Object {
  
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
  implicit class SchemaStartManualTransferRunsRequestOps[Self <: SchemaStartManualTransferRunsRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestedRunTime(value: String): Self = this.set("requestedRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedRunTime: Self = this.set("requestedRunTime", js.undefined)
    
    @scala.inline
    def setRequestedTimeRange(value: SchemaTimeRange): Self = this.set("requestedTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedTimeRange: Self = this.set("requestedTimeRange", js.undefined)
  }
}
