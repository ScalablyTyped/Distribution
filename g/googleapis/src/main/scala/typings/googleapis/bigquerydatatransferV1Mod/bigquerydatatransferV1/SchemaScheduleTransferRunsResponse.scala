package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsResponse extends js.Object {
  
  /**
    * The transfer runs that were scheduled.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}
object SchemaScheduleTransferRunsResponse {
  
  @scala.inline
  def apply(): SchemaScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaScheduleTransferRunsResponseOps[Self <: SchemaScheduleTransferRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setRunsVarargs(value: SchemaTransferRun*): Self = this.set("runs", js.Array(value :_*))
    
    @scala.inline
    def setRuns(value: js.Array[SchemaTransferRun]): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
  }
}
