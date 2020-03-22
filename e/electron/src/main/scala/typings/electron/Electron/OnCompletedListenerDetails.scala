package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCompletedListenerDetails extends js.Object {
  var error: String
  var fromCache: Boolean
  var id: Double
  var method: String
  var referrer: String
  var resourceType: String
  var responseHeaders: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  var statusCode: Double
  var statusLine: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnCompletedListenerDetails {
  @scala.inline
  def apply(
    error: String,
    fromCache: Boolean,
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    statusCode: Double,
    statusLine: String,
    timestamp: Double,
    url: String,
    responseHeaders: Record[String, js.Array[String]] = null,
    webContentsId: Int | Double = null
  ): OnCompletedListenerDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompletedListenerDetails]
  }
}

