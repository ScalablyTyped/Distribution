package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload line items response.
  */
@js.native
trait Schema$UploadLineItemsResponse extends js.Object {
  /**
    * Status of upload.
    */
  var uploadStatus: js.UndefOr[Schema$UploadStatus] = js.native
}

object Schema$UploadLineItemsResponse {
  @scala.inline
  def apply(uploadStatus: Schema$UploadStatus = null): Schema$UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UploadLineItemsResponse]
  }
}

