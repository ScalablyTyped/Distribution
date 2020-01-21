package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadErrorEventArgs extends js.Object {
  /** error event action details
    */
  var action: js.UndefOr[String] = js.undefined
  /** details about the error information
    */
  var error: js.UndefOr[String] = js.undefined
  /** returns the details of the uploaded files
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object UploadErrorEventArgs {
  @scala.inline
  def apply(action: String = null, error: String = null, files: js.Any = null, `type`: String = null): UploadErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadErrorEventArgs]
  }
}

