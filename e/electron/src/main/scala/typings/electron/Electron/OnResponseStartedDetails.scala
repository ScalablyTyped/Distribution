package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnResponseStartedDetails extends js.Object {
  /**
    * Indicates whether the response was fetched from disk cache.
    */
  var fromCache: Boolean
  var id: Double
  var method: String
  var referrer: String
  var resourceType: String
  var responseHeaders: ResponseHeaders
  var statusCode: Double
  var statusLine: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnResponseStartedDetails {
  @scala.inline
  def apply(
    fromCache: Boolean,
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    responseHeaders: ResponseHeaders,
    statusCode: Double,
    statusLine: String,
    timestamp: Double,
    url: String,
    webContentsId: Int | Double = null
  ): OnResponseStartedDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, id = id, method = method, referrer = referrer, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, statusLine = statusLine, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResponseStartedDetails]
  }
}

