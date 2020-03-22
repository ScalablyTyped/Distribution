package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogReturnValue extends js.Object {
  /**
    * An array matching the `filePaths` array of base64 encoded strings which contains
    * security scoped bookmark data. `securityScopedBookmarks` must be enabled for
    * this to be populated. (For return values, see table here.)
    *
    * @platform darwin,mas
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
  var filePaths: js.Array[String]
}

object OpenDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean, filePaths: js.Array[String], bookmarks: js.Array[String] = null): OpenDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any])
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogReturnValue]
  }
}

