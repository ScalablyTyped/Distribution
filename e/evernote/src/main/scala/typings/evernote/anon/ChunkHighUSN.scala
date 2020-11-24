package typings.evernote.anon

import typings.evernote.mod.Types.LinkedNotebook
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SavedSearch
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkHighUSN extends js.Object {
  
  var chunkHighUSN: js.UndefOr[Double] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  
  var expungedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  
  var expungedNotes: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  
  var expungedSearches: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  
  var expungedTags: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.native
  
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
}
object ChunkHighUSN {
  
  @scala.inline
  def apply(): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkHighUSN]
  }
  
  @scala.inline
  implicit class ChunkHighUSNOps[Self <: ChunkHighUSN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkHighUSN(value: Double): Self = this.set("chunkHighUSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkHighUSN: Self = this.set("chunkHighUSN", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    
    @scala.inline
    def setExpungedLinkedNotebooksVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("expungedLinkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedLinkedNotebooks(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("expungedLinkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungedLinkedNotebooks: Self = this.set("expungedLinkedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedNotebooksVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("expungedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotebooks(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("expungedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungedNotebooks: Self = this.set("expungedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedNotesVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("expungedNotes", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotes(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("expungedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungedNotes: Self = this.set("expungedNotes", js.undefined)
    
    @scala.inline
    def setExpungedSearchesVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("expungedSearches", js.Array(value :_*))
    
    @scala.inline
    def setExpungedSearches(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("expungedSearches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungedSearches: Self = this.set("expungedSearches", js.undefined)
    
    @scala.inline
    def setExpungedTagsVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("expungedTags", js.Array(value :_*))
    
    @scala.inline
    def setExpungedTags(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("expungedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungedTags: Self = this.set("expungedTags", js.undefined)
    
    @scala.inline
    def setLinkedNotebooksVarargs(value: LinkedNotebook*): Self = this.set("linkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setLinkedNotebooks(value: js.Array[LinkedNotebook]): Self = this.set("linkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedNotebooks: Self = this.set("linkedNotebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = this.set("notebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = this.set("notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebooks: Self = this.set("notebooks", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: typings.evernote.mod.Types.Note*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typings.evernote.mod.Types.Note]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSearchesVarargs(value: SavedSearch*): Self = this.set("searches", js.Array(value :_*))
    
    @scala.inline
    def setSearches(value: js.Array[SavedSearch]): Self = this.set("searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearches: Self = this.set("searches", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUpdateCount(value: Double): Self = this.set("updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateCount: Self = this.set("updateCount", js.undefined)
  }
}
