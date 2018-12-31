package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLFetchRequestOptions extends js.Object {
  /**
    * the content type (defaults to 'application/x-www-form-urlencoded'). Another example of content
    * type is 'application/xml; charset=utf-8'.
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if this is set to false, reserved characters in the URL will not be escaped (default: true)
    */
  var escaping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if this is set to false, the fetch not automatically follow HTTP redirects; it will return
    * the original HTTP response. The default is true.
    */
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a JavaScript key/value map of HTTP headers for the request
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * the HTTP method for the request: get, delete, patch, post, or put. The default is get.
    */
  var method: js.UndefOr[
    googleDashAppsDashScriptLib.googleDashAppsDashScriptLibStrings.get | googleDashAppsDashScriptLib.googleDashAppsDashScriptLibStrings.delete | googleDashAppsDashScriptLib.googleDashAppsDashScriptLibStrings.patch | googleDashAppsDashScriptLib.googleDashAppsDashScriptLibStrings.post | googleDashAppsDashScriptLib.googleDashAppsDashScriptLibStrings.put
  ] = js.undefined
  /**
    * if this is set to true, the fetch will not throw an exception if the response code indicates
    * failure, and will instead return the HTTPResponse (default: false)
    */
  var muteHttpExceptions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the payload (e.g. POST body) for the request. Certain HTTP methods (e.g. GET) do not accept a
    * payload. It can be a string, a byte array, or a JavaScript object. A JavaScript object will be
    * interpretted as a map of form field names to values, where the values can be either strings or blobs.
    */
  var payload: js.UndefOr[
    java.lang.String | js.Object | googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  ] = js.undefined
  /**
    * Deprecated. This instructs fetch to resolve the specified URL within the intranet linked to your
    * domain through (deprecated) SDC
    */
  var useIntranet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if this is set to false, the fetch will ignore any invalid certificates for HTTPS requests.
    * The default is true.
    */
  var validateHttpsCertificates: js.UndefOr[scala.Boolean] = js.undefined
}

