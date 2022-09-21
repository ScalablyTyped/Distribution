package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypePushNodesByBackendIdsToFrontendResponse extends StObject {
  
  var paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest]
  
  var returnType: PushNodesByBackendIdsToFrontendResponse
}
object ReturnTypePushNodesByBackendIdsToFrontendResponse {
  
  inline def apply(
    paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest],
    returnType: PushNodesByBackendIdsToFrontendResponse
  ): ReturnTypePushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePushNodesByBackendIdsToFrontendResponse]
  }
  
  extension [Self <: ReturnTypePushNodesByBackendIdsToFrontendResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[PushNodesByBackendIdsToFrontendRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: PushNodesByBackendIdsToFrontendRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: PushNodesByBackendIdsToFrontendResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
