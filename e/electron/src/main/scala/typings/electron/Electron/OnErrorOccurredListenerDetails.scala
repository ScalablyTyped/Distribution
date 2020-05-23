package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorOccurredListenerDetails extends js.Object {
  /**
    * The error description.
    */
  var error: String
  var fromCache: Boolean
  var id: Double
  var method: String
  var referrer: String
  var resourceType: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnErrorOccurredListenerDetails {
  @scala.inline
  def apply(
    error: String,
    fromCache: Boolean,
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    timestamp: Double,
    url: String,
    webContentsId: js.UndefOr[Double] = js.undefined
  ): OnErrorOccurredListenerDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(webContentsId)) __obj.updateDynamic("webContentsId")(webContentsId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorOccurredListenerDetails]
  }
}

