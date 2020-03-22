package typings.evernote.mod.NoteStore

import typings.evernote.AnonSearchedWords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NotesMetadataList")
@js.native
class NotesMetadataList () extends js.Object {
  def this(args: AnonSearchedWords) = this()
  var notes: js.UndefOr[js.Array[NoteMetadata]] = js.native
  var searchedWords: js.UndefOr[js.Array[String]] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var stoppedWords: js.UndefOr[js.Array[String]] = js.native
  var totalNotes: js.UndefOr[Double] = js.native
  var updateCount: js.UndefOr[Double] = js.native
}

