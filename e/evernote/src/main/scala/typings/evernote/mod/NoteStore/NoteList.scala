package typings.evernote.mod.NoteStore

import typings.evernote.AnonNotes
import typings.evernote.mod.Types.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteList")
@js.native
class NoteList () extends js.Object {
  def this(args: AnonNotes) = this()
  var notes: js.UndefOr[js.Array[Note]] = js.native
  var searchedWords: js.UndefOr[js.Array[String]] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var stoppedWords: js.UndefOr[js.Array[String]] = js.native
  var totalNotes: js.UndefOr[Double] = js.native
  var updateCount: js.UndefOr[Double] = js.native
}

