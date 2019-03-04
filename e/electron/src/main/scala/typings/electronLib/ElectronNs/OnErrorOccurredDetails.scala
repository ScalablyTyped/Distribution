package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorOccurredDetails extends js.Object {
  /**
    * The error description.
    */
  var error: java.lang.String
  var fromCache: scala.Boolean
  var id: scala.Double
  var method: java.lang.String
  var resourceType: java.lang.String
  var timestamp: scala.Double
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnErrorOccurredDetails {
  @scala.inline
  def apply(
    error: java.lang.String,
    fromCache: scala.Boolean,
    id: scala.Double,
    method: java.lang.String,
    resourceType: java.lang.String,
    timestamp: scala.Double,
    url: java.lang.String,
    webContentsId: scala.Int | scala.Double = null
  ): OnErrorOccurredDetails = {
    val __obj = js.Dynamic.literal(error = error, fromCache = fromCache, id = id, method = method, resourceType = resourceType, timestamp = timestamp, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorOccurredDetails]
  }
}

