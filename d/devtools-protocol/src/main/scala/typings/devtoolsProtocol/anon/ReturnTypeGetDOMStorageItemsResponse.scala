package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsRequest
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetDOMStorageItemsResponse extends StObject {
  
  var paramsType: js.Array[GetDOMStorageItemsRequest]
  
  var returnType: GetDOMStorageItemsResponse
}
object ReturnTypeGetDOMStorageItemsResponse {
  
  inline def apply(paramsType: js.Array[GetDOMStorageItemsRequest], returnType: GetDOMStorageItemsResponse): ReturnTypeGetDOMStorageItemsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDOMStorageItemsResponse]
  }
  
  extension [Self <: ReturnTypeGetDOMStorageItemsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetDOMStorageItemsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetDOMStorageItemsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetDOMStorageItemsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
