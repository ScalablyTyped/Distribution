package typings.devtoolsProtocol.mod.Protocol.Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueWithAuthRequest extends js.Object {
  
  /**
    * Response to  with an authChallenge.
    */
  var authChallengeResponse: AuthChallengeResponse = js.native
  
  /**
    * An id the client received in authRequired event.
    */
  var requestId: RequestId = js.native
}
object ContinueWithAuthRequest {
  
  @scala.inline
  def apply(authChallengeResponse: AuthChallengeResponse, requestId: RequestId): ContinueWithAuthRequest = {
    val __obj = js.Dynamic.literal(authChallengeResponse = authChallengeResponse.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueWithAuthRequest]
  }
  
  @scala.inline
  implicit class ContinueWithAuthRequestOps[Self <: ContinueWithAuthRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthChallengeResponse(value: AuthChallengeResponse): Self = this.set("authChallengeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
