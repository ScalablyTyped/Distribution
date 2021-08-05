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
  
  inline def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  extension [Self <: JobStatus](x: Self) {
    
    inline def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    inline def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
