package typings.evernote.mod.NoteStore

import typings.evernote.AnonNotebookCounts
import typings.evernote.mod.Types.Guid
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteCollectionCounts")
@js.native
class NoteCollectionCounts () extends js.Object {
  def this(args: AnonNotebookCounts) = this()
  var notebookCounts: js.UndefOr[Map[Guid, Double]] = js.native
  var tagCounts: js.UndefOr[Map[Guid, Double]] = js.native
  var trashCount: js.UndefOr[Double] = js.native
}

