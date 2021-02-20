package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLFetch {
  
  /**
    * This class allows users to access specific information on HTTP responses.
    * See also
    *
    * UrlFetchApp
    */
  @js.native
  trait HTTPResponse extends StObject {
    
    def getAllHeaders(): js.Object = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getContent(): js.Array[Byte] = js.native
    
    def getContentText(): String = js.native
    def getContentText(charset: String): String = js.native
    
    def getHeaders(): js.Object = js.native
    
    def getResponseCode(): Integer = js.native
  }
  
  type HttpHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleAppsScript.googleAppsScriptStrings.get
    - typings.googleAppsScript.googleAppsScriptStrings.delete
    - typings.googleAppsScript.googleAppsScriptStrings.patch
    - typings.googleAppsScript.googleAppsScriptStrings.post
    - typings.googleAppsScript.googleAppsScriptStrings.put
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def delete: typings.googleAppsScript.googleAppsScriptStrings.delete = "delete".asInstanceOf[typings.googleAppsScript.googleAppsScriptStrings.delete]
    
    @scala.inline
    def get: typings.googleAppsScript.googleAppsScriptStrings.get = "get".asInstanceOf[typings.googleAppsScript.googleAppsScriptStrings.get]
    
    @scala.inline
    def patch: typings.googleAppsScript.googleAppsScriptStrings.patch = "patch".asInstanceOf[typings.googleAppsScript.googleAppsScriptStrings.patch]
    
    @scala.inline
    def post: typings.googleAppsScript.googleAppsScriptStrings.post = "post".asInstanceOf[typings.googleAppsScript.googleAppsScriptStrings.post]
    
    @scala.inline
    def put: typings.googleAppsScript.googleAppsScriptStrings.put = "put".asInstanceOf[typings.googleAppsScript.googleAppsScriptStrings.put]
  }
  
  type Payload = String | StringDictionary[js.Any] | Blob
  
  @js.native
  trait URLFetchRequest extends URLFetchRequestOptions {
    
    var url: String = js.native
  }
  object URLFetchRequest {
    
    @scala.inline
    def apply(url: String): URLFetchRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLFetchRequest]
    }
    
    @scala.inline
    implicit class URLFetchRequestMutableBuilder[Self <: URLFetchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URLFetchRequestOptions extends StObject {
    
    /**
      * the content type (defaults to 'application/x-www-form-urlencoded'). Another example of content
      * type is 'application/xml; charset=utf-8'.
      */
    var contentType: js.UndefOr[String] = js.native
    
    /**
      * if this is set to false, reserved characters in the URL will not be escaped (default: true)
      */
    var escaping: js.UndefOr[Boolean] = js.native
    
    /**
      * if this is set to false, the fetch not automatically follow HTTP redirects; it will return
      * the original HTTP response. The default is true.
      */
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    /**
      * a JavaScript key/value map of HTTP headers for the request
      */
    var headers: js.UndefOr[HttpHeaders] = js.native
    
    /**
      * the HTTP method for the request: get, delete, patch, post, or put. The default is get.
      */
    var method: js.UndefOr[HttpMethod] = js.native
    
    /**
      * if this is set to true, the fetch will not throw an exception if the response code indicates
      * failure, and will instead return the HTTPResponse (default: false)
      */
    var muteHttpExceptions: js.UndefOr[Boolean] = js.native
    
    /**
      * the payload (e.g. POST body) for the request. Certain HTTP methods (e.g. GET) do not accept a
      * payload. It can be a string, a byte array, or a JavaScript object. A JavaScript object will be
      * interpretted as a map of form field names to values, where the values can be either strings or blobs.
      */
    var payload: js.UndefOr[Payload] = js.native
    
    /**
      * Deprecated. This instructs fetch to resolve the specified URL within the intranet linked to your
      * domain through (deprecated) SDC
      */
    var useIntranet: js.UndefOr[Boolean] = js.native
    
    /**
      * if this is set to false, the fetch will ignore any invalid certificates for HTTPS requests.
      * The default is true.
      */
    var validateHttpsCertificates: js.UndefOr[Boolean] = js.native
  }
  object URLFetchRequestOptions {
    
    @scala.inline
    def apply(): URLFetchRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFetchRequestOptions]
    }
    
    @scala.inline
    implicit class URLFetchRequestOptionsMutableBuilder[Self <: URLFetchRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setEscaping(value: Boolean): Self = StObject.set(x, "escaping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapingUndefined: Self = StObject.set(x, "escaping", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMuteHttpExceptions(value: Boolean): Self = StObject.set(x, "muteHttpExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteHttpExceptionsUndefined: Self = StObject.set(x, "muteHttpExceptions", js.undefined)
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setUseIntranet(value: Boolean): Self = StObject.set(x, "useIntranet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIntranetUndefined: Self = StObject.set(x, "useIntranet", js.undefined)
      
      @scala.inline
      def setValidateHttpsCertificates(value: Boolean): Self = StObject.set(x, "validateHttpsCertificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateHttpsCertificatesUndefined: Self = StObject.set(x, "validateHttpsCertificates", js.undefined)
    }
  }
  
  /**
    * Fetch resources and communicate with other hosts over the Internet.
    *
    * This service allows scripts to communicate with other applications or access other resources
    * on the web by fetching URLs. A script can use the URL Fetch service to issue HTTP and HTTPS
    * requests and receive responses. The URL Fetch service uses Google's network infrastructure for
    * efficiency and scaling purposes.
    *
    * Requests made using this service originate from a set pool of IP ranges. You can look up the full list of IP addresses
    * if you need to whitelist or approve these requests.
    *
    * This service requires the https://www.googleapis.com/auth/script.external_request
    * scope. In most cases Apps Script automatically detects and includes the scopes a script needs,
    * but if you are setting your scopes
    * explicitly you must manually add this scope to use UrlFetchApp.
    * See also
    *
    * HTTPResponse
    *
    * Setting explicit scopes
    */
  @js.native
  trait UrlFetchApp extends StObject {
    
    def fetch(url: String): HTTPResponse = js.native
    def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse = js.native
    
    def fetchAll(requests: js.Array[URLFetchRequest | String]): js.Array[HTTPResponse] = js.native
    
    def getRequest(url: String): URLFetchRequest = js.native
    def getRequest(url: String, params: URLFetchRequestOptions): URLFetchRequest = js.native
  }
}
