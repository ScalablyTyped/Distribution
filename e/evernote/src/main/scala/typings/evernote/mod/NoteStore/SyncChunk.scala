package typings.evernote.mod.NoteStore

import typings.evernote.anon.ChunkHighUSN
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.LinkedNotebook
import typings.evernote.mod.Types.Note
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SavedSearch
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.SyncChunk")
@js.native
open class SyncChunk () extends StObject {
  def this(args: ChunkHighUSN) = this()
  
  var chunkHighUSN: js.UndefOr[Double] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var expungedLinkedNotebooks: js.UndefOr[js.Array[Guid]] = js.native
  
  var expungedNotebooks: js.UndefOr[js.Array[Guid]] = js.native
  
  var expungedNotes: js.UndefOr[js.Array[Guid]] = js.native
  
  var expungedSearches: js.UndefOr[js.Array[Guid]] = js.native
  
  var expungedTags: js.UndefOr[js.Array[Guid]] = js.native
  
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[Note]] = js.native
  
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
}
