package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetRootAXNodeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetRootAXNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetRootAXNodeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetRootAXNodeRequest]]
  
  var returnType: GetRootAXNodeResponse
}
object ReturnTypeGetRootAXNodeResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetRootAXNodeRequest]], returnType: GetRootAXNodeResponse): ReturnTypeGetRootAXNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRootAXNodeResponse]
  }
  
  extension [Self <: ReturnTypeGetRootAXNodeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetRootAXNodeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetRootAXNodeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetRootAXNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
