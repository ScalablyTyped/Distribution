package typings.evernote.mod.NoteStore

import typings.evernote.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNoteSharesResult")
@js.native
class ManageNoteSharesResult () extends js.Object {
  def this(args: Errors) = this()
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.native
}

