package typings.evernote

import typings.evernote.mod.Types.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNote extends js.Object {
  var note: js.UndefOr[Note] = js.undefined
  var updated: js.UndefOr[Boolean] = js.undefined
}

object AnonNote {
  @scala.inline
  def apply(note: Note = null, updated: js.UndefOr[Boolean] = js.undefined): AnonNote = {
    val __obj = js.Dynamic.literal()
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNote]
  }
}

