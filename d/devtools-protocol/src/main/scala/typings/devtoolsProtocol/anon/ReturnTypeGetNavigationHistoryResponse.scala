package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetNavigationHistoryResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetNavigationHistoryResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetNavigationHistoryResponse
}
object ReturnTypeGetNavigationHistoryResponse {
  
  inline def apply(paramsType: js.Array[js.Any], returnType: GetNavigationHistoryResponse): ReturnTypeGetNavigationHistoryResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNavigationHistoryResponse]
  }
  
  extension [Self <: ReturnTypeGetNavigationHistoryResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetNavigationHistoryResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
