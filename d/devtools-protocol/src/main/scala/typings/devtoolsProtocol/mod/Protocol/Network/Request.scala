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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
    */
  var hasPostData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTTP request headers.
    */
  var headers: Headers
  
  /**
    * Priority of the resource request at the time request is sent.
    */
  var initialPriority: ResourcePriority
  
  /**
    * Whether is loaded via link preload.
    */
  var isLinkPreload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTTP request method.
    */
  var method: String
  
  /**
    * The mixed content type of the request.
    */
  var mixedContentType: js.UndefOr[MixedContentType] = js.undefined
  
  /**
    * HTTP POST request data.
    */
  var postData: js.UndefOr[String] = js.undefined
  
  /**
    * Request body elements. This will be converted from base64 to binary
    */
  var postDataEntries: js.UndefOr[js.Array[PostDataEntry]] = js.undefined
  
  /**
    * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/ (RequestReferrerPolicy enum)
    */
  var referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
  
  /**
    * Set for requests when the TrustToken API is used. Contains the parameters
    * passed by the developer (e.g. via "fetch") as understood by the backend.
    */
  var trustTokenParams: js.UndefOr[TrustTokenParams] = js.undefined
  
  /**
    * Request URL (without fragment).
    */
  var url: String
  
  /**
    * Fragment of the requested URL starting with hash, if present.
    */
  var urlFragment: js.UndefOr[String] = js.undefined
}
object Request {
  
  inline def apply(
    headers: Headers,
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
    
    inline def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
    
    inline def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
    
    inline def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
    
    inline def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataEntries(value: js.Array[PostDataEntry]): Self = StObject.set(x, "postDataEntries", value.asInstanceOf[js.Any])
    
    inline def setPostDataEntriesUndefined: Self = StObject.set(x, "postDataEntries", js.undefined)
    
    inline def setPostDataEntriesVarargs(value: PostDataEntry*): Self = StObject.set(x, "postDataEntries", js.Array(value :_*))
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setReferrerPolicy(
      value: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setTrustTokenParams(value: TrustTokenParams): Self = StObject.set(x, "trustTokenParams", value.asInstanceOf[js.Any])
    
    inline def setTrustTokenParamsUndefined: Self = StObject.set(x, "trustTokenParams", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
