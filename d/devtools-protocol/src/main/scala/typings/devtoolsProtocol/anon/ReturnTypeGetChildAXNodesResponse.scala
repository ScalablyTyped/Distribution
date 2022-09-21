package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetChildAXNodesRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetChildAXNodesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetChildAXNodesResponse extends StObject {
  
  var paramsType: js.Array[GetChildAXNodesRequest]
  
  var returnType: GetChildAXNodesResponse
}
object ReturnTypeGetChildAXNodesResponse {
  
  inline def apply(paramsType: js.Array[GetChildAXNodesRequest], returnType: GetChildAXNodesResponse): ReturnTypeGetChildAXNodesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetChildAXNodesResponse]
  }
  
  extension [Self <: ReturnTypeGetChildAXNodesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetChildAXNodesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetChildAXNodesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetChildAXNodesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
