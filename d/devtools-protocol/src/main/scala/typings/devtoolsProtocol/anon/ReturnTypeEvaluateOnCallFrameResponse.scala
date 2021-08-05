package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeEvaluateOnCallFrameResponse extends StObject {
  
  var paramsType: js.Array[EvaluateOnCallFrameRequest]
  
  var returnType: EvaluateOnCallFrameResponse
}
object ReturnTypeEvaluateOnCallFrameResponse {
  
  inline def apply(paramsType: js.Array[EvaluateOnCallFrameRequest], returnType: EvaluateOnCallFrameResponse): ReturnTypeEvaluateOnCallFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeEvaluateOnCallFrameResponse]
  }
  
  extension [Self <: ReturnTypeEvaluateOnCallFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[EvaluateOnCallFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EvaluateOnCallFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: EvaluateOnCallFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
