package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSearchInResponseBodyResponse extends StObject {
  
  var paramsType: js.Array[SearchInResponseBodyRequest]
  
  var returnType: SearchInResponseBodyResponse
}
object ReturnTypeSearchInResponseBodyResponse {
  
  inline def apply(paramsType: js.Array[SearchInResponseBodyRequest], returnType: SearchInResponseBodyResponse): ReturnTypeSearchInResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInResponseBodyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeSearchInResponseBodyResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SearchInResponseBodyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SearchInResponseBodyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SearchInResponseBodyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
