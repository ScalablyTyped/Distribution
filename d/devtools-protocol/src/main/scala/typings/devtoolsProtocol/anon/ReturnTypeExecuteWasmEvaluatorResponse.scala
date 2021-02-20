package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeExecuteWasmEvaluatorResponse extends StObject {
  
  var paramsType: js.Array[ExecuteWasmEvaluatorRequest] = js.native
  
  var returnType: ExecuteWasmEvaluatorResponse = js.native
}
object ReturnTypeExecuteWasmEvaluatorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ExecuteWasmEvaluatorRequest], returnType: ExecuteWasmEvaluatorResponse): ReturnTypeExecuteWasmEvaluatorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeExecuteWasmEvaluatorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeExecuteWasmEvaluatorResponseMutableBuilder[Self <: ReturnTypeExecuteWasmEvaluatorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ExecuteWasmEvaluatorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ExecuteWasmEvaluatorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ExecuteWasmEvaluatorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
