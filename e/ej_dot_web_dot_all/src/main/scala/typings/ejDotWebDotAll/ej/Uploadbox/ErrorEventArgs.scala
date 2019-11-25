package typings.ejDotWebDotAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventArgs extends js.Object {
  /** error event action details.
    */
  var action: js.UndefOr[String] = js.undefined
  /** details about the error information.
    */
  var error: js.UndefOr[String] = js.undefined
  /** returns the file details of the file uploaded
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ErrorEventArgs {
  @scala.inline
  def apply(action: String = null, error: String = null, files: js.Any = null, `type`: String = null): ErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventArgs]
  }
}

