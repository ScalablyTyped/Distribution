package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetWindowBoundsResponse extends StObject {
  
  var paramsType: js.Array[GetWindowBoundsRequest]
  
  var returnType: GetWindowBoundsResponse
}
object ReturnTypeGetWindowBoundsResponse {
  
  inline def apply(paramsType: js.Array[GetWindowBoundsRequest], returnType: GetWindowBoundsResponse): ReturnTypeGetWindowBoundsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetWindowBoundsResponse]
  }
  
  extension [Self <: ReturnTypeGetWindowBoundsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetWindowBoundsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetWindowBoundsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetWindowBoundsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
