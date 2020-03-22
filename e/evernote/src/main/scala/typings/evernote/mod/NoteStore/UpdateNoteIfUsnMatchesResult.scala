package typings.evernote.mod.NoteStore

import typings.evernote.AnonNote
import typings.evernote.mod.Types.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.UpdateNoteIfUsnMatchesResult")
@js.native
class UpdateNoteIfUsnMatchesResult () extends js.Object {
  def this(args: AnonNote) = this()
  var note: js.UndefOr[Note] = js.native
  var updated: js.UndefOr[Boolean] = js.native
}

