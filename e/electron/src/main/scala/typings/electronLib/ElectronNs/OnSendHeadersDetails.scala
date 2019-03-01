package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSendHeadersDetails extends js.Object {
  var id: scala.Double
  var method: java.lang.String
  var requestHeaders: RequestHeaders
  var resourceType: java.lang.String
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnSendHeadersDetails {
  @scala.inline
  def apply(
    id: scala.Double,
    method: java.lang.String,
    requestHeaders: RequestHeaders,
    resourceType: java.lang.String,
    timestamp: scala.Double,
    url: java.lang.String,
    webContentsId: scala.Int | scala.Double = null
  ): OnSendHeadersDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.updateDynamic("resourceType")(resourceType)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("url")(url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSendHeadersDetails]
  }
}

