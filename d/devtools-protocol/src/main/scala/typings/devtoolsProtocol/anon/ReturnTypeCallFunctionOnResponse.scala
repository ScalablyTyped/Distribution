package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCallFunctionOnResponse extends StObject {
  
  var paramsType: js.Array[CallFunctionOnRequest]
  
  var returnType: CallFunctionOnResponse
}
object ReturnTypeCallFunctionOnResponse {
  
  inline def apply(paramsType: js.Array[CallFunctionOnRequest], returnType: CallFunctionOnResponse): ReturnTypeCallFunctionOnResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCallFunctionOnResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCallFunctionOnResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CallFunctionOnRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CallFunctionOnRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CallFunctionOnResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
