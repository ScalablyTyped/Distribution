package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.EvaluateRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.EvaluateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeEvaluateResponse extends StObject {
  
  var paramsType: js.Array[EvaluateRequest] = js.native
  
  var returnType: EvaluateResponse = js.native
}
object ReturnTypeEvaluateResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[EvaluateRequest], returnType: EvaluateResponse): ReturnTypeEvaluateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeEvaluateResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeEvaluateResponseMutableBuilder[Self <: ReturnTypeEvaluateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[EvaluateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: EvaluateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: EvaluateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
