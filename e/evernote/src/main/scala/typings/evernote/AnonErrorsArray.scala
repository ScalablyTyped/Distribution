package typings.evernote

import typings.evernote.mod.NoteStore.ManageNotebookSharesError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorsArray extends js.Object {
  var errors: js.UndefOr[js.Array[ManageNotebookSharesError]] = js.undefined
}

object AnonErrorsArray {
  @scala.inline
  def apply(errors: js.Array[ManageNotebookSharesError] = null): AnonErrorsArray = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorsArray]
  }
}

