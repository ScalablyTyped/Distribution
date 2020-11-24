package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer-when-downgrade`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`origin-when-cross-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`same-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin-when-cross-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`unsafe-url`
import typings.devtoolsProtocol.devtoolsProtocolStrings.origin
import typings.devtoolsProtocol.mod.Protocol.Security.MixedContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /**
    * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
    */
  var hasPostData: js.UndefOr[Boolean] = js.native
  
  /**
    * HTTP request headers.
    */
  var headers: Headers = js.native
  
  /**
    * Priority of the resource request at the time request is sent.
    */
  var initialPriority: ResourcePriority = js.native
  
  /**
    * Whether is loaded via link preload.
    */
  var isLinkPreload: js.UndefOr[Boolean] = js.native
  
  /**
    * HTTP request method.
    */
  var method: String = js.native
  
  /**
    * The mixed content type of the request.
    */
  var mixedContentType: js.UndefOr[MixedContentType] = js.native
  
  /**
    * HTTP POST request data.
    */
  var postData: js.UndefOr[String] = js.native
  
  /**
    * Request body elements. This will be converted from base64 to binary
    */
  var postDataEntries: js.UndefOr[js.Array[PostDataEntry]] = js.native
  
  /**
    * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/ (RequestReferrerPolicy enum)
    */
  var referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` = js.native
  
  /**
    * Set for requests when the TrustToken API is used. Contains the parameters
    * passed by the developer (e.g. via "fetch") as understood by the backend.
    */
  var trustTokenParams: js.UndefOr[TrustTokenParams] = js.native
  
  /**
    * Request URL (without fragment).
    */
  var url: String = js.native
  
  /**
    * Fragment of the requested URL starting with hash, if present.
    */
  var urlFragment: js.UndefOr[String] = js.native
}
object Request {
  
  @scala.inline
  def apply(
    headers: Headers,
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPriority(value: ResourcePriority): Self = this.set("initialPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicy(
      value: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
    ): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPostData(value: Boolean): Self = this.set("hasPostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasPostData: Self = this.set("hasPostData", js.undefined)
    
    @scala.inline
    def setIsLinkPreload(value: Boolean): Self = this.set("isLinkPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLinkPreload: Self = this.set("isLinkPreload", js.undefined)
    
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = this.set("mixedContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixedContentType: Self = this.set("mixedContentType", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    
    @scala.inline
    def setPostDataEntriesVarargs(value: PostDataEntry*): Self = this.set("postDataEntries", js.Array(value :_*))
    
    @scala.inline
    def setPostDataEntries(value: js.Array[PostDataEntry]): Self = this.set("postDataEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostDataEntries: Self = this.set("postDataEntries", js.undefined)
    
    @scala.inline
    def setTrustTokenParams(value: TrustTokenParams): Self = this.set("trustTokenParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustTokenParams: Self = this.set("trustTokenParams", js.undefined)
    
    @scala.inline
    def setUrlFragment(value: String): Self = this.set("urlFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlFragment: Self = this.set("urlFragment", js.undefined)
  }
}
