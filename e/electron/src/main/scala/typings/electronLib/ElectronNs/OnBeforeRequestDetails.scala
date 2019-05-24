package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRequestDetails extends js.Object {
  var id: scala.Double
  var method: java.lang.String
  var referrer: java.lang.String
  var resourceType: java.lang.String
  var timestamp: scala.Double
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
  var webContentsId: js.UndefOr[scala.Double] = js.undefined
}

object OnBeforeRequestDetails {
  @scala.inline
  def apply(
    id: scala.Double,
    method: java.lang.String,
    referrer: java.lang.String,
    resourceType: java.lang.String,
    timestamp: scala.Double,
    uploadData: js.Array[UploadData],
    url: java.lang.String,
    webContentsId: scala.Int | scala.Double = null
  ): OnBeforeRequestDetails = {
    val __obj = js.Dynamic.literal(id = id, method = method, referrer = referrer, resourceType = resourceType, timestamp = timestamp, uploadData = uploadData, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestDetails]
  }
}

