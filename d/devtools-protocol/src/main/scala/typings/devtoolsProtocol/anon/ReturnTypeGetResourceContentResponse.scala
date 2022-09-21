package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentRequest
import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetResourceContentResponse extends StObject {
  
  var paramsType: js.Array[GetResourceContentRequest]
  
  var returnType: GetResourceContentResponse
}
object ReturnTypeGetResourceContentResponse {
  
  inline def apply(paramsType: js.Array[GetResourceContentRequest], returnType: GetResourceContentResponse): ReturnTypeGetResourceContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResourceContentResponse]
  }
  
  extension [Self <: ReturnTypeGetResourceContentResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetResourceContentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetResourceContentRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetResourceContentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
