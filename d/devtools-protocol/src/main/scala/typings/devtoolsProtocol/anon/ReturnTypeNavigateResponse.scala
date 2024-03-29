package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.NavigateRequest
import typings.devtoolsProtocol.mod.Protocol.Page.NavigateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeNavigateResponse extends StObject {
  
  var paramsType: js.Array[NavigateRequest]
  
  var returnType: NavigateResponse
}
object ReturnTypeNavigateResponse {
  
  inline def apply(paramsType: js.Array[NavigateRequest], returnType: NavigateResponse): ReturnTypeNavigateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNavigateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeNavigateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[NavigateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: NavigateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: NavigateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
