package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldRequest
import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCreateIsolatedWorldResponse extends StObject {
  
  var paramsType: js.Array[CreateIsolatedWorldRequest]
  
  var returnType: CreateIsolatedWorldResponse
}
object ReturnTypeCreateIsolatedWorldResponse {
  
  inline def apply(paramsType: js.Array[CreateIsolatedWorldRequest], returnType: CreateIsolatedWorldResponse): ReturnTypeCreateIsolatedWorldResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateIsolatedWorldResponse]
  }
  
  extension [Self <: ReturnTypeCreateIsolatedWorldResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CreateIsolatedWorldRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CreateIsolatedWorldRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CreateIsolatedWorldResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
