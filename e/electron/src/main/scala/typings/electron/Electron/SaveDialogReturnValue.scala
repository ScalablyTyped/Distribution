package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveDialogReturnValue extends js.Object {
  /**
    * Base64 encoded string which contains the security scoped bookmark data for the
    * saved file. `securityScopedBookmarks` must be enabled for this to be present.
    * (For return values, see table here.)
    *
    * @platform darwin,mas
    */
  var bookmark: js.UndefOr[String] = js.native
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean = js.native
  /**
    * If the dialog is canceled, this will be `undefined`.
    */
  var filePath: js.UndefOr[String] = js.native
}

object SaveDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean): SaveDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDialogReturnValue]
  }
  @scala.inline
  implicit class SaveDialogReturnValueOps[Self <: SaveDialogReturnValue] (val x: Self) extends AnyVal {
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
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmark: Self = this.set("bookmark", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
  }
  
}

