package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetLayersForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetLayersForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetLayersForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetLayersForNodeRequest]
  
  var returnType: GetLayersForNodeResponse
}
object ReturnTypeGetLayersForNodeResponse {
  
  inline def apply(paramsType: js.Array[GetLayersForNodeRequest], returnType: GetLayersForNodeResponse): ReturnTypeGetLayersForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetLayersForNodeResponse]
  }
  
  extension [Self <: ReturnTypeGetLayersForNodeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetLayersForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetLayersForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetLayersForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
