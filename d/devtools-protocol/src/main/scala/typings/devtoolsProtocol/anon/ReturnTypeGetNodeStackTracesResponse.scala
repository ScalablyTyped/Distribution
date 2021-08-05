package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetNodeStackTracesResponse extends StObject {
  
  var paramsType: js.Array[GetNodeStackTracesRequest]
  
  var returnType: GetNodeStackTracesResponse
}
object ReturnTypeGetNodeStackTracesResponse {
  
  inline def apply(paramsType: js.Array[GetNodeStackTracesRequest], returnType: GetNodeStackTracesResponse): ReturnTypeGetNodeStackTracesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodeStackTracesResponse]
  }
  
  extension [Self <: ReturnTypeGetNodeStackTracesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetNodeStackTracesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetNodeStackTracesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetNodeStackTracesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
