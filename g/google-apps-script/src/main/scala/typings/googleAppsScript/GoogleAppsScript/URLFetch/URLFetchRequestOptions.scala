package typings.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLFetchRequestOptions extends js.Object {
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
  implicit class URLFetchRequestOptionsOps[Self <: URLFetchRequestOptions] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setEscaping(value: Boolean): Self = this.set("escaping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscaping: Self = this.set("escaping", js.undefined)
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMuteHttpExceptions(value: Boolean): Self = this.set("muteHttpExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuteHttpExceptions: Self = this.set("muteHttpExceptions", js.undefined)
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setUseIntranet(value: Boolean): Self = this.set("useIntranet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIntranet: Self = this.set("useIntranet", js.undefined)
    @scala.inline
    def setValidateHttpsCertificates(value: Boolean): Self = this.set("validateHttpsCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateHttpsCertificates: Self = this.set("validateHttpsCertificates", js.undefined)
  }
  
}

