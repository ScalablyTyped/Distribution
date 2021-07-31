package typings.evernote.mod.NoteStore

import typings.evernote.anon.NotebookCounts
import typings.evernote.mod.Types.Guid
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteCollectionCounts")
@js.native
class NoteCollectionCounts () extends StObject {
  def this(args: NotebookCounts) = this()
  
  var notebookCounts: js.UndefOr[Map[Guid, Double]] = js.native
  
  var tagCounts: js.UndefOr[Map[Guid, Double]] = js.native
  
  var trashCount: js.UndefOr[Double] = js.native
}
