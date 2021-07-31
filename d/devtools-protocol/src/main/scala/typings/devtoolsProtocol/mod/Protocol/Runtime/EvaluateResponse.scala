package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateResponse extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}
object EvaluateResponse {
  
  @scala.inline
  def apply(result: RemoteObject): EvaluateResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateResponse]
  }
  
  @scala.inline
  implicit class EvaluateResponseMutableBuilder[Self <: EvaluateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
