package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueInterceptedRequestRequest extends js.Object {
  /**
    * Response to a requestIntercepted with an authChallenge. Must not be set otherwise.
    */
  var authChallengeResponse: js.UndefOr[AuthChallengeResponse] = js.native
  /**
    * If set this causes the request to fail with the given reason. Passing `Aborted` for requests
    * marked with `isNavigationRequest` also cancels the navigation. Must not be set in response
    * to an authChallenge.
    */
  var errorReason: js.UndefOr[ErrorReason] = js.native
  /**
    * If set this allows the request headers to be changed. Must not be set in response to an
    * authChallenge.
    */
  var headers: js.UndefOr[Headers] = js.native
  var interceptionId: InterceptionId = js.native
  /**
    * If set this allows the request method to be overridden. Must not be set in response to an
    * authChallenge.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * If set this allows postData to be set. Must not be set in response to an authChallenge.
    */
  var postData: js.UndefOr[String] = js.native
  /**
    * If set the requests completes using with the provided base64 encoded raw response, including
    * HTTP status line and headers etc... Must not be set in response to an authChallenge.
    */
  var rawResponse: js.UndefOr[String] = js.native
  /**
    * If set the request url will be modified in a way that's not observable by page. Must not be
    * set in response to an authChallenge.
    */
  var url: js.UndefOr[String] = js.native
}

object ContinueInterceptedRequestRequest {
  @scala.inline
  def apply(interceptionId: InterceptionId): ContinueInterceptedRequestRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueInterceptedRequestRequest]
  }
  @scala.inline
  implicit class ContinueInterceptedRequestRequestOps[Self <: ContinueInterceptedRequestRequest] (val x: Self) extends AnyVal {
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
    def setInterceptionId(value: InterceptionId): Self = this.set("interceptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthChallengeResponse(value: AuthChallengeResponse): Self = this.set("authChallengeResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthChallengeResponse: Self = this.set("authChallengeResponse", js.undefined)
    @scala.inline
    def setErrorReason(value: ErrorReason): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReason: Self = this.set("errorReason", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    @scala.inline
    def setRawResponse(value: String): Self = this.set("rawResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawResponse: Self = this.set("rawResponse", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

