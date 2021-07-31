package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to start manual transfer runs.
  */
trait SchemaStartManualTransferRunsResponse extends StObject {
  
  /**
    * The transfer runs that were created.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.undefined
}
object SchemaStartManualTransferRunsResponse {
  
  @scala.inline
  def apply(): SchemaStartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartManualTransferRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaStartManualTransferRunsResponseMutableBuilder[Self <: SchemaStartManualTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuns(value: js.Array[SchemaTransferRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    @scala.inline
    def setRunsVarargs(value: SchemaTransferRun*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
