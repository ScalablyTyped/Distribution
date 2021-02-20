package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeEvaluateOnCallFrameResponse extends StObject {
  
  var paramsType: js.Array[EvaluateOnCallFrameRequest] = js.native
  
  var returnType: EvaluateOnCallFrameResponse = js.native
}
object ReturnTypeEvaluateOnCallFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[EvaluateOnCallFrameRequest], returnType: EvaluateOnCallFrameResponse): ReturnTypeEvaluateOnCallFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeEvaluateOnCallFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeEvaluateOnCallFrameResponseMutableBuilder[Self <: ReturnTypeEvaluateOnCallFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[EvaluateOnCallFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: EvaluateOnCallFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: EvaluateOnCallFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
