package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetWasmBytecodeResponse extends StObject {
  
  var paramsType: js.Array[GetWasmBytecodeRequest]
  
  var returnType: GetWasmBytecodeResponse
}
object ReturnTypeGetWasmBytecodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetWasmBytecodeRequest], returnType: GetWasmBytecodeResponse): ReturnTypeGetWasmBytecodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetWasmBytecodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetWasmBytecodeResponseMutableBuilder[Self <: ReturnTypeGetWasmBytecodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetWasmBytecodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetWasmBytecodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetWasmBytecodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
