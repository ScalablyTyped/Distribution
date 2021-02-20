package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypePushNodesByBackendIdsToFrontendResponse extends StObject {
  
  var paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest] = js.native
  
  var returnType: PushNodesByBackendIdsToFrontendResponse = js.native
}
object ReturnTypePushNodesByBackendIdsToFrontendResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[PushNodesByBackendIdsToFrontendRequest],
    returnType: PushNodesByBackendIdsToFrontendResponse
  ): ReturnTypePushNodesByBackendIdsToFrontendResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePushNodesByBackendIdsToFrontendResponse]
  }
  
  @scala.inline
  implicit class ReturnTypePushNodesByBackendIdsToFrontendResponseMutableBuilder[Self <: ReturnTypePushNodesByBackendIdsToFrontendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[PushNodesByBackendIdsToFrontendRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: PushNodesByBackendIdsToFrontendRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: PushNodesByBackendIdsToFrontendResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
