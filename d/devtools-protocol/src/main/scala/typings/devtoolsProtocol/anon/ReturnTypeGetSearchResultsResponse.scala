package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSearchResultsResponse extends StObject {
  
  var paramsType: js.Array[GetSearchResultsRequest]
  
  var returnType: GetSearchResultsResponse
}
object ReturnTypeGetSearchResultsResponse {
  
  inline def apply(paramsType: js.Array[GetSearchResultsRequest], returnType: GetSearchResultsResponse): ReturnTypeGetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSearchResultsResponse]
  }
  
  extension [Self <: ReturnTypeGetSearchResultsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetSearchResultsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetSearchResultsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetSearchResultsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
