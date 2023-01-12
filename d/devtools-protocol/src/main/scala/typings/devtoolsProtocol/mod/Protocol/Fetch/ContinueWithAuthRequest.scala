package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueWithAuthRequest extends StObject {
  
  /**
    * Response to  with an authChallenge.
    */
  var authChallengeResponse: AuthChallengeResponse
  
  /**
    * An id the client received in authRequired event.
    */
  var requestId: RequestId
}
object ContinueWithAuthRequest {
  
  inline def apply(authChallengeResponse: AuthChallengeResponse, requestId: RequestId): ContinueWithAuthRequest = {
    val __obj = js.Dynamic.literal(authChallengeResponse = authChallengeResponse.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueWithAuthRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueWithAuthRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthChallengeResponse(value: AuthChallengeResponse): Self = StObject.set(x, "authChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
