package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLineItemsResponse extends js.Object {
  /** Status of upload. */
  var uploadStatus: js.UndefOr[UploadStatus] = js.undefined
}

object UploadLineItemsResponse {
  @scala.inline
  def apply(uploadStatus: UploadStatus = null): UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLineItemsResponse]
  }
}

