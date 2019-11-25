package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogReturnValue extends js.Object {
  /**
    * An array matching the filePaths array of base64 encoded strings which contains
    * security scoped bookmark data. securityScopedBookmarks must be enabled for this
    * to be populated.
    */
  var bookmarks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean
  /**
    * An array of file paths chosen by the user. If the dialog is cancelled this will
    * be an empty array.
    */
  var filePaths: js.UndefOr[js.Array[String]] = js.undefined
}

object OpenDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean, bookmarks: js.Array[String] = null, filePaths: js.Array[String] = null): OpenDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (filePaths != null) __obj.updateDynamic("filePaths")(filePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogReturnValue]
  }
}

