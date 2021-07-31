package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatus extends StObject {
  
  /**
    * [Output-only] Final error result of the job. If present, indicates that
    * the job has completed and was unsuccessful.
    */
  var errorResult: js.UndefOr[SchemaErrorProto] = js.undefined
  
  /**
    * [Output-only] The first errors encountered during the running of the job.
    * The final message includes the number of errors that caused the process
    * to stop. Errors here do not necessarily mean that the job has completed
    * or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.undefined
  
  /**
    * [Output-only] Running state of the job.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaJobStatus {
  
  @scala.inline
  def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  @scala.inline
  implicit class SchemaJobStatusMutableBuilder[Self <: SchemaJobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorResult(value: SchemaErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[SchemaErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
