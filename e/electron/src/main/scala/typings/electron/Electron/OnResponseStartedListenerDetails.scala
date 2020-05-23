package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnResponseStartedListenerDetails extends js.Object {
  /**
    * Indicates whether the response was fetched from disk cache.
    */
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

object OnResponseStartedListenerDetails {
  @scala.inline
  def apply(
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
    webContentsId: js.UndefOr[Double] = js.undefined
  ): OnResponseStartedListenerDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(webContentsId)) __obj.updateDynamic("webContentsId")(webContentsId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResponseStartedListenerDetails]
  }
}

