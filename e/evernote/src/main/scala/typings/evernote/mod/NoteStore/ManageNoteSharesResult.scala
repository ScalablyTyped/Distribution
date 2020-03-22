package typings.evernote.mod.NoteStore

import typings.evernote.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNoteSharesResult")
@js.native
class ManageNoteSharesResult () extends js.Object {
  def this(args: AnonErrors) = this()
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.native
}

