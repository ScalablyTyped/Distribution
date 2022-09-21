package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceRequest
import typings.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeLoadNetworkResourceResponse extends StObject {
  
  var paramsType: js.Array[LoadNetworkResourceRequest]
  
  var returnType: LoadNetworkResourceResponse
}
object ReturnTypeLoadNetworkResourceResponse {
  
  inline def apply(paramsType: js.Array[LoadNetworkResourceRequest], returnType: LoadNetworkResourceResponse): ReturnTypeLoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadNetworkResourceResponse]
  }
  
  extension [Self <: ReturnTypeLoadNetworkResourceResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[LoadNetworkResourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: LoadNetworkResourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: LoadNetworkResourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
