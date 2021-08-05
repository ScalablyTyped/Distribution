package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeQuerySelectorAllResponse extends StObject {
  
  var paramsType: js.Array[QuerySelectorAllRequest]
  
  var returnType: QuerySelectorAllResponse
}
object ReturnTypeQuerySelectorAllResponse {
  
  inline def apply(paramsType: js.Array[QuerySelectorAllRequest], returnType: QuerySelectorAllResponse): ReturnTypeQuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorAllResponse]
  }
  
  extension [Self <: ReturnTypeQuerySelectorAllResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[QuerySelectorAllRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: QuerySelectorAllRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: QuerySelectorAllResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
