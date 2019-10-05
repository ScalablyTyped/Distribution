package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedDetails extends js.Object {
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

object OnHeadersReceivedDetails {
  @scala.inline
  def apply(
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
  ): OnHeadersReceivedDetails = {
    val __obj = js.Dynamic.literal(id = id, method = method, referrer = referrer, resourceType = resourceType, responseHeaders = responseHeaders, statusCode = statusCode, statusLine = statusLine, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeadersReceivedDetails]
  }
}

