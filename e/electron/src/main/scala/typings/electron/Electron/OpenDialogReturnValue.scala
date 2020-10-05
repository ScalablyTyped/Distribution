package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDialogReturnValue extends js.Object {
  /**
    * An array matching the `filePaths` array of base64 encoded strings which contains
    * security scoped bookmark data. `securityScopedBookmarks` must be enabled for
    * this to be populated. (For return values, see table here.)
    *
    * @platform darwin,mas
    */
  var bookmarks: js.UndefOr[js.Array[String]] = js.native
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean = js.native
  /**
    * An array of file paths chosen by the user. If the dialog is cancelled this will
    * be an empty array.
    */
  var filePaths: js.Array[String] = js.native
}

object OpenDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean, filePaths: js.Array[String]): OpenDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogReturnValue]
  }
  @scala.inline
  implicit class OpenDialogReturnValueOps[Self <: OpenDialogReturnValue] (val x: Self) extends AnyVal {
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
    def setFilePathsVarargs(value: String*): Self = this.set("filePaths", js.Array(value :_*))
    @scala.inline
    def setFilePaths(value: js.Array[String]): Self = this.set("filePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmarksVarargs(value: String*): Self = this.set("bookmarks", js.Array(value :_*))
    @scala.inline
    def setBookmarks(value: js.Array[String]): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
  }
  
}

