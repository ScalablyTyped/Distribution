package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Http target. The job will be pushed to the job handler by means of an HTTP
  * request via an http_method such as HTTP POST, HTTP GET, etc. The job is
  * acknowledged by means of an HTTP response code in the range [200 - 299]. A
  * failure to receive a response constitutes a failed execution. For a
  * redirected request, the response returned by the redirected request is
  * considered.
  */
trait SchemaHttpTarget extends StObject {
  
  /**
    * HTTP request body. A request body is allowed only if the HTTP method is
    * POST, PUT, or PATCH. It is an error to set body on a job with an
    * incompatible HttpMethod.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The user can specify HTTP request headers to send with the job&#39;s HTTP
    * request. This map contains the header field names and values. Repeated
    * headers are not supported, but a header value can contain commas. These
    * headers represent a subset of the headers that will accompany the
    * job&#39;s HTTP request. Some HTTP request headers will be ignored or
    * replaced. A partial list of headers that will be ignored or replaced is
    * below: - Host: This will be computed by Cloud Scheduler and derived from
    * uri. * `Content-Length`: This will be computed by Cloud Scheduler. *
    * `User-Agent`: This will be set to `&quot;Google-Cloud-Scheduler&quot;`. *
    * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google
    * internal use only.  The total size of headers must be less than 80KB.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Which HTTP method to use for the request.
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, an [OAuth
    * token](https://developers.google.com/identity/protocols/OAuth2) will be
    * generated and attached as an `Authorization` header in the HTTP request.
    * This type of authorization should be used when sending requests to a GCP
    * endpoint.
    */
  var oauthToken: js.UndefOr[SchemaOAuthToken] = js.undefined
  
  /**
    * If specified, an
    * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
    * token will be generated and attached as an `Authorization` header in the
    * HTTP request.  This type of authorization should be used when sending
    * requests to third party endpoints.
    */
  var oidcToken: js.UndefOr[SchemaOidcToken] = js.undefined
  
  /**
    * Required.  The full URI path that the request will be sent to. This
    * string must begin with either &quot;http://&quot; or
    * &quot;https://&quot;. Some examples of valid values for uri are:
    * `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will
    * encode some characters for safety and compatibility. The maximum allowed
    * URL length is 2083 characters after encoding.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaHttpTarget {
  
  @scala.inline
  def apply(): SchemaHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpTarget]
  }
  
  @scala.inline
  implicit class SchemaHttpTargetMutableBuilder[Self <: SchemaHttpTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setOauthToken(value: SchemaOAuthToken): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    @scala.inline
    def setOidcToken(value: SchemaOidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
