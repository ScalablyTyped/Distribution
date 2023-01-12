package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueInterceptedRequestRequest extends StObject {
  
  /**
    * Response to a requestIntercepted with an authChallenge. Must not be set otherwise.
    */
  var authChallengeResponse: js.UndefOr[AuthChallengeResponse] = js.undefined
  
  /**
    * If set this causes the request to fail with the given reason. Passing `Aborted` for requests
    * marked with `isNavigationRequest` also cancels the navigation. Must not be set in response
    * to an authChallenge.
    */
  var errorReason: js.UndefOr[ErrorReason] = js.undefined
  
  /**
    * If set this allows the request headers to be changed. Must not be set in response to an
    * authChallenge.
    */
  var headers: js.UndefOr[Headers] = js.undefined
  
  var interceptionId: InterceptionId
  
  /**
    * If set this allows the request method to be overridden. Must not be set in response to an
    * authChallenge.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * If set this allows postData to be set. Must not be set in response to an authChallenge.
    */
  var postData: js.UndefOr[String] = js.undefined
  
  /**
    * If set the requests completes using with the provided base64 encoded raw response, including
    * HTTP status line and headers etc... Must not be set in response to an authChallenge. (Encoded as a base64 string when passed over JSON)
    */
  var rawResponse: js.UndefOr[String] = js.undefined
  
  /**
    * If set the request url will be modified in a way that's not observable by page. Must not be
    * set in response to an authChallenge.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ContinueInterceptedRequestRequest {
  
  inline def apply(interceptionId: InterceptionId): ContinueInterceptedRequestRequest = {
    val __obj = js.Dynamic.literal(interceptionId = interceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueInterceptedRequestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueInterceptedRequestRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthChallengeResponse(value: AuthChallengeResponse): Self = StObject.set(x, "authChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setAuthChallengeResponseUndefined: Self = StObject.set(x, "authChallengeResponse", js.undefined)
    
    inline def setErrorReason(value: ErrorReason): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInterceptionId(value: InterceptionId): Self = StObject.set(x, "interceptionId", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setRawResponse(value: String): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
    
    inline def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
