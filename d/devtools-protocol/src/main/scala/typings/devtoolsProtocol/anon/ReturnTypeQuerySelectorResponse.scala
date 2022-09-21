package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeQuerySelectorResponse extends StObject {
  
  var paramsType: js.Array[QuerySelectorRequest]
  
  var returnType: QuerySelectorResponse
}
object ReturnTypeQuerySelectorResponse {
  
  inline def apply(paramsType: js.Array[QuerySelectorRequest], returnType: QuerySelectorResponse): ReturnTypeQuerySelectorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorResponse]
  }
  
  extension [Self <: ReturnTypeQuerySelectorResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[QuerySelectorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: QuerySelectorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: QuerySelectorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
