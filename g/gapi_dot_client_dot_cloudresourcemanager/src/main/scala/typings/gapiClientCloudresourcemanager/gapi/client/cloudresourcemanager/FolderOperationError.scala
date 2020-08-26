package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderOperationError extends js.Object {
  /** The type of operation error experienced. */
  var errorMessageId: js.UndefOr[String] = js.native
}

object FolderOperationError {
  @scala.inline
  def apply(): FolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderOperationError]
  }
  @scala.inline
  implicit class FolderOperationErrorOps[Self <: FolderOperationError] (val x: Self) extends AnyVal {
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
    def setErrorMessageId(value: String): Self = this.set("errorMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessageId: Self = this.set("errorMessageId", js.undefined)
  }
  
}

