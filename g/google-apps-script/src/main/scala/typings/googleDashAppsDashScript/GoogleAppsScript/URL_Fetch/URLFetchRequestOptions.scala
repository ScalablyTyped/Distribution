package typings.googleDashAppsDashScript.GoogleAppsScript.URL_Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLFetchRequestOptions extends js.Object {
  /**
    * the content type (defaults to 'application/x-www-form-urlencoded'). Another example of content
    * type is 'application/xml; charset=utf-8'.
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * if this is set to false, reserved characters in the URL will not be escaped (default: true)
    */
  var escaping: js.UndefOr[Boolean] = js.undefined
  /**
    * if this is set to false, the fetch not automatically follow HTTP redirects; it will return
    * the original HTTP response. The default is true.
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * a JavaScript key/value map of HTTP headers for the request
    */
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  /**
    * the HTTP method for the request: get, delete, patch, post, or put. The default is get.
    */
  var method: js.UndefOr[HttpMethod] = js.undefined
  /**
    * if this is set to true, the fetch will not throw an exception if the response code indicates
    * failure, and will instead return the HTTPResponse (default: false)
    */
  var muteHttpExceptions: js.UndefOr[Boolean] = js.undefined
  /**
    * the payload (e.g. POST body) for the request. Certain HTTP methods (e.g. GET) do not accept a
    * payload. It can be a string, a byte array, or a JavaScript object. A JavaScript object will be
    * interpretted as a map of form field names to values, where the values can be either strings or blobs.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  /**
    * Deprecated. This instructs fetch to resolve the specified URL within the intranet linked to your
    * domain through (deprecated) SDC
    */
  var useIntranet: js.UndefOr[Boolean] = js.undefined
  /**
    * if this is set to false, the fetch will ignore any invalid certificates for HTTPS requests.
    * The default is true.
    */
  var validateHttpsCertificates: js.UndefOr[Boolean] = js.undefined
}

object URLFetchRequestOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    escaping: js.UndefOr[Boolean] = js.undefined,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: HttpHeaders = null,
    method: HttpMethod = null,
    muteHttpExceptions: js.UndefOr[Boolean] = js.undefined,
    payload: Payload = null,
    useIntranet: js.UndefOr[Boolean] = js.undefined,
    validateHttpsCertificates: js.UndefOr[Boolean] = js.undefined
  ): URLFetchRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(escaping)) __obj.updateDynamic("escaping")(escaping.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(muteHttpExceptions)) __obj.updateDynamic("muteHttpExceptions")(muteHttpExceptions.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntranet)) __obj.updateDynamic("useIntranet")(useIntranet.asInstanceOf[js.Any])
    if (!js.isUndefined(validateHttpsCertificates)) __obj.updateDynamic("validateHttpsCertificates")(validateHttpsCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLFetchRequestOptions]
  }
}

