package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBeforeRequestListenerDetails extends js.Object {
  var id: Double = js.native
  var method: String = js.native
  var referrer: String = js.native
  var resourceType: String = js.native
  var timestamp: Double = js.native
  var uploadData: js.Array[UploadData] = js.native
  var url: String = js.native
  var webContentsId: js.UndefOr[Double] = js.native
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
    url: String
  ): OnBeforeRequestListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeRequestListenerDetails]
  }
  @scala.inline
  implicit class OnBeforeRequestListenerDetailsOps[Self <: OnBeforeRequestListenerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDataVarargs(value: UploadData*): Self = this.set("uploadData", js.Array(value :_*))
    @scala.inline
    def setUploadData(value: js.Array[UploadData]): Self = this.set("uploadData", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebContentsId(value: Double): Self = this.set("webContentsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebContentsId: Self = this.set("webContentsId", js.undefined)
  }
  
}

