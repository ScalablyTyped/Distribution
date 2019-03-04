package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRedirectDetails extends js.Object {
  var fromCache: scala.Boolean
  var id: scala.Double
  /**
    * The server IP address that the request was actually sent to.
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var method: java.lang.String
  var redirectURL: java.lang.String
  var resourceType: java.lang.String
  var responseHeaders: ResponseHeaders
  var statusCode: scala.Double
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnBeforeRedirectDetails {
  @scala.inline
  def apply(
    fromCache: scala.Boolean,
    id: scala.Double,
    method: java.lang.String,
    redirectURL: java.lang.String,
    resourceType: java.lang.String,
    responseHeaders: ResponseHeaders,
    statusCode: scala.Double,
    timestamp: scala.Double,
    url: java.lang.String,
    ip: java.lang.String = null,
    webContentsId: scala.Int | scala.Double = null
  ): OnBeforeRedirectDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, id = id, method = method, redirectURL = redirectURL, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, timestamp = timestamp, url = url)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRedirectDetails]
  }
}

