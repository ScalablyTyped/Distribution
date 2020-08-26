package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Http target. The job will be pushed to the job handler by means of an HTTP
  * request via an http_method such as HTTP POST, HTTP GET, etc. The job is
  * acknowledged by means of an HTTP response code in the range [200 - 299]. A
  * failure to receive a response constitutes a failed execution. For a
  * redirected request, the response returned by the redirected request is
  * considered.
  */
@js.native
trait SchemaHttpTarget extends js.Object {
  /**
    * HTTP request body. A request body is allowed only if the HTTP method is
    * POST, PUT, or PATCH. It is an error to set body on a job with an
    * incompatible HttpMethod.
    */
  var body: js.UndefOr[String] = js.native
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
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Which HTTP method to use for the request.
    */
  var httpMethod: js.UndefOr[String] = js.native
  /**
    * If specified, an [OAuth
    * token](https://developers.google.com/identity/protocols/OAuth2) will be
    * generated and attached as an `Authorization` header in the HTTP request.
    * This type of authorization should be used when sending requests to a GCP
    * endpoint.
    */
  var oauthToken: js.UndefOr[SchemaOAuthToken] = js.native
  /**
    * If specified, an
    * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
    * token will be generated and attached as an `Authorization` header in the
    * HTTP request.  This type of authorization should be used when sending
    * requests to third party endpoints.
    */
  var oidcToken: js.UndefOr[SchemaOidcToken] = js.native
  /**
    * Required.  The full URI path that the request will be sent to. This
    * string must begin with either &quot;http://&quot; or
    * &quot;https://&quot;. Some examples of valid values for uri are:
    * `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will
    * encode some characters for safety and compatibility. The maximum allowed
    * URL length is 2083 characters after encoding.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaHttpTarget {
  @scala.inline
  def apply(): SchemaHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpTarget]
  }
  @scala.inline
  implicit class SchemaHttpTargetOps[Self <: SchemaHttpTarget] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setOauthToken(value: SchemaOAuthToken): Self = this.set("oauthToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthToken: Self = this.set("oauthToken", js.undefined)
    @scala.inline
    def setOidcToken(value: SchemaOidcToken): Self = this.set("oidcToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOidcToken: Self = this.set("oidcToken", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

