package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnResponseStartedDetails extends js.Object {
  /**
    * Indicates whether the response was fetched from disk cache.
    */
  var fromCache: scala.Boolean
  var id: scala.Double
  var method: java.lang.String
  var referrer: java.lang.String
  var resourceType: java.lang.String
  var responseHeaders: ResponseHeaders
  var statusCode: scala.Double
  var statusLine: java.lang.String
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnResponseStartedDetails {
  @scala.inline
  def apply(
    fromCache: scala.Boolean,
    id: scala.Double,
    method: java.lang.String,
    referrer: java.lang.String,
    resourceType: java.lang.String,
    responseHeaders: ResponseHeaders,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    timestamp: scala.Double,
    url: java.lang.String,
    webContentsId: scala.Int | scala.Double = null
  ): OnResponseStartedDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, id = id, method = method, referrer = referrer, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, statusLine = statusLine, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResponseStartedDetails]
  }
}

