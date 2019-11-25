package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDialogReturnValue extends js.Object {
  /**
    * Base64 encoded string which contains the security scoped bookmark data for the
    * saved file. securityScopedBookmarks must be enabled for this to be present.
    */
  var bookmark: js.UndefOr[String] = js.undefined
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean
  /**
    * If the dialog is canceled this will be undefined.
    */
  var filePath: js.UndefOr[String] = js.undefined
}

object SaveDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean, bookmark: String = null, filePath: String = null): SaveDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    if (bookmark != null) __obj.updateDynamic("bookmark")(bookmark.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDialogReturnValue]
  }
}

