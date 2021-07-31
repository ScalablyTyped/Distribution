package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetScriptSourceResponse extends StObject {
  
  var paramsType: js.Array[GetScriptSourceRequest]
  
  var returnType: GetScriptSourceResponse
}
object ReturnTypeGetScriptSourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetScriptSourceRequest], returnType: GetScriptSourceResponse): ReturnTypeGetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetScriptSourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetScriptSourceResponseMutableBuilder[Self <: ReturnTypeGetScriptSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetScriptSourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetScriptSourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetScriptSourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
