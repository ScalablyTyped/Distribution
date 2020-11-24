package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns value for event handlers that have the 'blocking' extraInfoSpec applied. Allows the event handler to modify network requests.
  */
@js.native
trait BlockingResponse extends js.Object {
  
  /**
    * Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials.
    */
  var authCredentials: js.UndefOr[BlockingResponseAuthCredentials] = js.native
  
  /**
    * If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /**
    * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set, the original request is prevented from being sent/completed and is instead redirected to the given URL. Redirections to non-HTTP schemes such as data: are allowed. Redirects initiated by a redirect action use the original request method for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage, then the redirect will be issued using the GET method.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  
  /**
    * Only used as a response to the onBeforeSendHeaders event. If set, the request is made with these request headers instead.
    */
  var requestHeaders: js.UndefOr[HttpHeaders] = js.native
  
  /**
    * Only used as a response to the onHeadersReceived event. If set, the server is assumed to have responded with these response headers instead. Only return `responseHeaders` if you really want to modify the headers in order to limit the number of conflicts (only one extension may modify `responseHeaders` for each request).
    */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.native
  
  /**
    * Only used as a response to the onBeforeRequest event. If set, the original request is prevented from being sent/completed and is instead upgraded to a secure request. If any extension returns `redirectUrl` during onBeforeRequest, `upgradeToSecure` will have no affect.
    */
  var upgradeToSecure: js.UndefOr[Boolean] = js.native
}
object BlockingResponse {
  
  @scala.inline
  def apply(): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockingResponse]
  }
  
  @scala.inline
  implicit class BlockingResponseOps[Self <: BlockingResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthCredentials(value: BlockingResponseAuthCredentials): Self = this.set("authCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCredentials: Self = this.set("authCredentials", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setRequestHeadersVarargs(value: _HttpHeaders*): Self = this.set("requestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeaders(value: HttpHeaders): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: _HttpHeaders*): Self = this.set("responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeaders(value: HttpHeaders): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setUpgradeToSecure(value: Boolean): Self = this.set("upgradeToSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeToSecure: Self = this.set("upgradeToSecure", js.undefined)
  }
}
