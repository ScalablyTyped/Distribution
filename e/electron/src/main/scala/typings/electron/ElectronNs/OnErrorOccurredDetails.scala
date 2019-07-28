package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorOccurredDetails extends js.Object {
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

object OnErrorOccurredDetails {
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
    webContentsId: Int | Double = null
  ): OnErrorOccurredDetails = {
    val __obj = js.Dynamic.literal(error = error, fromCache = fromCache, id = id, method = method, referrer = referrer, resourceType = resourceType, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorOccurredDetails]
  }
}

