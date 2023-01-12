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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetNodeStackTracesResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetNodeStackTracesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetNodeStackTracesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetNodeStackTracesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
