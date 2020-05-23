package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeRequestListenerDetails extends js.Object {
  var id: Double
  var method: String
  var referrer: String
  var resourceType: String
  var timestamp: Double
  var uploadData: js.Array[UploadData]
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnBeforeRequestListenerDetails {
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    timestamp: Double,
    uploadData: js.Array[UploadData],
    url: String,
    webContentsId: js.UndefOr[Double] = js.undefined
  ): OnBeforeRequestListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(webContentsId)) __obj.updateDynamic("webContentsId")(webContentsId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestListenerDetails]
  }
}

