package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAwaitPromiseResponse extends StObject {
  
  var paramsType: js.Array[AwaitPromiseRequest]
  
  var returnType: AwaitPromiseResponse
}
object ReturnTypeAwaitPromiseResponse {
  
  inline def apply(paramsType: js.Array[AwaitPromiseRequest], returnType: AwaitPromiseResponse): ReturnTypeAwaitPromiseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAwaitPromiseResponse]
  }
  
  extension [Self <: ReturnTypeAwaitPromiseResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[AwaitPromiseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AwaitPromiseRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AwaitPromiseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
