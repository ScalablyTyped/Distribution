package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to schedule transfer runs for a time range.
  */
trait SchemaScheduleTransferRunsResponse extends StObject {
  
  /**
    * The transfer runs that were scheduled.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.undefined
}
object SchemaScheduleTransferRunsResponse {
  
  @scala.inline
  def apply(): SchemaScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaScheduleTransferRunsResponseMutableBuilder[Self <: SchemaScheduleTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuns(value: js.Array[SchemaTransferRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    @scala.inline
    def setRunsVarargs(value: SchemaTransferRun*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
