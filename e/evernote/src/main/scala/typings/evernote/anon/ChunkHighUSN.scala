package typings.evernote.anon

import typings.evernote.mod.Types.LinkedNotebook
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SavedSearch
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkHighUSN extends StObject {
  
  var chunkHighUSN: js.UndefOr[Double] = js.undefined
  
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedNotes: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedSearches: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedTags: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.undefined
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.undefined
  
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  var updateCount: js.UndefOr[Double] = js.undefined
}
object ChunkHighUSN {
  
  @scala.inline
  def apply(): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkHighUSN]
  }
  
  @scala.inline
  implicit class ChunkHighUSNMutableBuilder[Self <: ChunkHighUSN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkHighUSN(value: Double): Self = StObject.set(x, "chunkHighUSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkHighUSNUndefined: Self = StObject.set(x, "chunkHighUSN", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setExpungedLinkedNotebooks(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedLinkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedLinkedNotebooksUndefined: Self = StObject.set(x, "expungedLinkedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedLinkedNotebooksVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedLinkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotebooks(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedNotebooksUndefined: Self = StObject.set(x, "expungedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedNotebooksVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotes(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedNotesUndefined: Self = StObject.set(x, "expungedNotes", js.undefined)
    
    @scala.inline
    def setExpungedNotesVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotes", js.Array(value :_*))
    
    @scala.inline
    def setExpungedSearches(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedSearches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedSearchesUndefined: Self = StObject.set(x, "expungedSearches", js.undefined)
    
    @scala.inline
    def setExpungedSearchesVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedSearches", js.Array(value :_*))
    
    @scala.inline
    def setExpungedTags(value: js.Array[typings.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedTagsUndefined: Self = StObject.set(x, "expungedTags", js.undefined)
    
    @scala.inline
    def setExpungedTagsVarargs(value: typings.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedTags", js.Array(value :_*))
    
    @scala.inline
    def setLinkedNotebooks(value: js.Array[LinkedNotebook]): Self = StObject.set(x, "linkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedNotebooksUndefined: Self = StObject.set(x, "linkedNotebooks", js.undefined)
    
    @scala.inline
    def setLinkedNotebooksVarargs(value: LinkedNotebook*): Self = StObject.set(x, "linkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typings.evernote.mod.Types.Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: typings.evernote.mod.Types.Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSearches(value: js.Array[SavedSearch]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    @scala.inline
    def setSearchesVarargs(value: SavedSearch*): Self = StObject.set(x, "searches", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
