package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRequestDetails extends js.Object {
  var id: Double
  var method: String
  var referrer: String
  var resourceType: String
  var timestamp: Double
  var uploadData: js.Array[UploadData]
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnBeforeRequestDetails {
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    timestamp: Double,
    uploadData: js.Array[UploadData],
    url: String,
    webContentsId: Int | Double = null
  ): OnBeforeRequestDetails = {
    val __obj = js.Dynamic.literal(id = id, method = method, referrer = referrer, resourceType = resourceType, timestamp = timestamp, uploadData = uploadData, url = url)
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestDetails]
  }
}

