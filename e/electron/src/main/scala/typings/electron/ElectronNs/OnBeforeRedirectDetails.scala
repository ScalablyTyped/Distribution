package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRedirectDetails extends js.Object {
  var fromCache: Boolean
  var id: Double
  /**
    * The server IP address that the request was actually sent to.
    */
  var ip: js.UndefOr[String] = js.undefined
  var method: String
  var redirectURL: String
  var referrer: String
  var resourceType: String
  var responseHeaders: ResponseHeaders
  var statusCode: Double
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnBeforeRedirectDetails {
  @scala.inline
  def apply(
    fromCache: Boolean,
    id: Double,
    method: String,
    redirectURL: String,
    referrer: String,
    resourceType: String,
    responseHeaders: ResponseHeaders,
    statusCode: Double,
    timestamp: Double,
    url: String,
    ip: String = null,
    webContentsId: Int | Double = null
  ): OnBeforeRedirectDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, id = id, method = method, redirectURL = redirectURL, referrer = referrer, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, timestamp = timestamp, url = url)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRedirectDetails]
  }
}

