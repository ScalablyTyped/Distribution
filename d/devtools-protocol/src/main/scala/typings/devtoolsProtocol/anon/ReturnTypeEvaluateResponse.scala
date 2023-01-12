package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.EvaluateRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.EvaluateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeEvaluateResponse extends StObject {
  
  var paramsType: js.Array[EvaluateRequest]
  
  var returnType: EvaluateResponse
}
object ReturnTypeEvaluateResponse {
  
  inline def apply(paramsType: js.Array[EvaluateRequest], returnType: EvaluateResponse): ReturnTypeEvaluateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeEvaluateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeEvaluateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[EvaluateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EvaluateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: EvaluateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
