package typings.evernote

import typings.evernote.mod.NoteStore.ManageNoteSharesError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.undefined
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[ManageNoteSharesError] = null): AnonErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

