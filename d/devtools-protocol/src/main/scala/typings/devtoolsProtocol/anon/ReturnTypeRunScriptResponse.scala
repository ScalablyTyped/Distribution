package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.RunScriptRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.RunScriptResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRunScriptResponse extends StObject {
  
  var paramsType: js.Array[RunScriptRequest]
  
  var returnType: RunScriptResponse
}
object ReturnTypeRunScriptResponse {
  
  inline def apply(paramsType: js.Array[RunScriptRequest], returnType: RunScriptResponse): ReturnTypeRunScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRunScriptResponse]
  }
  
  extension [Self <: ReturnTypeRunScriptResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[RunScriptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RunScriptRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: RunScriptResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
