package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatus extends StObject {
  
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object JobStatus {
  
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  @scala.inline
  implicit class JobStatusMutableBuilder[Self <: JobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
