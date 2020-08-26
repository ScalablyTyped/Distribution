package typings.fineUploader.mod

import typings.fineUploader.coreMod.DeleteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDeleteFileOptions extends DeleteFileOptions {
  /**
    * The message displayed in the confirm delete dialog
    *
    * @default `'Are you sure you want to delete {filename}?'`
    */
  var confirmMessage: js.UndefOr[String] = js.native
  /**
    * The status message to appear next to a file that has failed to delete
    *
    * @default `'Delete failed'`
    */
  var deletingFailedText: js.UndefOr[String] = js.native
  /**
    * The status message to appear next to a file that is pending deletion
    *
    * @default `'Deleting...'`
    */
  var deletingStatusText: js.UndefOr[String] = js.native
  /**
    * If this value is set to `true`, the user will be required to confirm the file delete request via a confirmation dialog
    *
    * @default `false`
    */
  var forceConfirm: js.UndefOr[Boolean] = js.native
}

object UIDeleteFileOptions {
  @scala.inline
  def apply(): UIDeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDeleteFileOptions]
  }
  @scala.inline
  implicit class UIDeleteFileOptionsOps[Self <: UIDeleteFileOptions] (val x: Self) extends AnyVal {
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
    def setConfirmMessage(value: String): Self = this.set("confirmMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmMessage: Self = this.set("confirmMessage", js.undefined)
    @scala.inline
    def setDeletingFailedText(value: String): Self = this.set("deletingFailedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletingFailedText: Self = this.set("deletingFailedText", js.undefined)
    @scala.inline
    def setDeletingStatusText(value: String): Self = this.set("deletingStatusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletingStatusText: Self = this.set("deletingStatusText", js.undefined)
    @scala.inline
    def setForceConfirm(value: Boolean): Self = this.set("forceConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceConfirm: Self = this.set("forceConfirm", js.undefined)
  }
  
}

