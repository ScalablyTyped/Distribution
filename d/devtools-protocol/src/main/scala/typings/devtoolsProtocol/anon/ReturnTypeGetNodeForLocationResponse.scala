package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetNodeForLocationResponse extends StObject {
  
  var paramsType: js.Array[GetNodeForLocationRequest]
  
  var returnType: GetNodeForLocationResponse
}
object ReturnTypeGetNodeForLocationResponse {
  
  inline def apply(paramsType: js.Array[GetNodeForLocationRequest], returnType: GetNodeForLocationResponse): ReturnTypeGetNodeForLocationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodeForLocationResponse]
  }
  
  extension [Self <: ReturnTypeGetNodeForLocationResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetNodeForLocationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetNodeForLocationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetNodeForLocationResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
