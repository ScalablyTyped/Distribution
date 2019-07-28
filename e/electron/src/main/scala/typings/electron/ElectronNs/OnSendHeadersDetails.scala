package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSendHeadersDetails extends js.Object {
  var id: Double
  var method: String
  var referrer: String
  var requestHeaders: RequestHeaders
  var resourceType: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnSendHeadersDetails {
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    requestHeaders: RequestHeaders,
    resourceType: String,
    timestamp: Double,
    url: String,
    webContentsId: Int | Double = null
  ): OnSendHeadersDetails = {
    val __obj = js.Dynamic.literal(id = id, method = method, referrer = referrer, requestHeaders = requestHeaders, resourceType = resourceType, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSendHeadersDetails]
  }
}

