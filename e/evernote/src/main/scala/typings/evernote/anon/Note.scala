package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Note extends js.Object {
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.undefined
  var updated: js.UndefOr[Boolean] = js.undefined
}

object Note {
  @scala.inline
  def apply(note: typings.evernote.mod.Types.Note = null, updated: js.UndefOr[Boolean] = js.undefined): Note = {
    val __obj = js.Dynamic.literal()
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
}

