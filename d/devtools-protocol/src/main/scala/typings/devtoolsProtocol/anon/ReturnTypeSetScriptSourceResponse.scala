package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetScriptSourceResponse extends StObject {
  
  var paramsType: js.Array[SetScriptSourceRequest]
  
  var returnType: SetScriptSourceResponse
}
object ReturnTypeSetScriptSourceResponse {
  
  inline def apply(paramsType: js.Array[SetScriptSourceRequest], returnType: SetScriptSourceResponse): ReturnTypeSetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetScriptSourceResponse]
  }
  
  extension [Self <: ReturnTypeSetScriptSourceResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetScriptSourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetScriptSourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: SetScriptSourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
