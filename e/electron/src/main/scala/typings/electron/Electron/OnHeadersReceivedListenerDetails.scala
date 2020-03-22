package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedListenerDetails extends js.Object {
  var id: Double
  var method: String
  var referrer: String
  var requestHeaders: Record[String, String]
  var resourceType: String
  var responseHeaders: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  var statusCode: Double
  var statusLine: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnHeadersReceivedListenerDetails {
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    requestHeaders: Record[String, String],
    resourceType: String,
    statusCode: Double,
    statusLine: String,
    timestamp: Double,
    url: String,
    responseHeaders: Record[String, js.Array[String]] = null,
    webContentsId: Int | Double = null
  ): OnHeadersReceivedListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeadersReceivedListenerDetails]
  }
}

