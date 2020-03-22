package typings.evernote.mod.NoteStore

import typings.evernote.AnonErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNotebookSharesResult")
@js.native
class ManageNotebookSharesResult () extends js.Object {
  def this(args: AnonErrorsArray) = this()
  var errors: js.UndefOr[js.Array[ManageNotebookSharesError]] = js.native
}

