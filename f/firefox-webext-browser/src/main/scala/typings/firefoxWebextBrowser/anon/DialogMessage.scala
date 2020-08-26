package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogMessage extends js.Object {
  /** The message to display to a user when being asked to confirm removal of the extension. */
  var dialogMessage: js.UndefOr[String] = js.native
  /** Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false. */
  var showConfirmDialog: js.UndefOr[Boolean] = js.native
}

object DialogMessage {
  @scala.inline
  def apply(): DialogMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogMessage]
  }
  @scala.inline
  implicit class DialogMessageOps[Self <: DialogMessage] (val x: Self) extends AnyVal {
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
    def setDialogMessage(value: String): Self = this.set("dialogMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogMessage: Self = this.set("dialogMessage", js.undefined)
    @scala.inline
    def setShowConfirmDialog(value: Boolean): Self = this.set("showConfirmDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConfirmDialog: Self = this.set("showConfirmDialog", js.undefined)
  }
  
}

