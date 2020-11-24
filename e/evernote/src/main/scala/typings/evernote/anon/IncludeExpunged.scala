package typings.evernote.anon

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeExpunged extends js.Object {
  
  var includeExpunged: js.UndefOr[Boolean] = js.native
  
  var includeLinkedNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeNoteAttributes: js.UndefOr[Boolean] = js.native
  
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeNoteResources: js.UndefOr[Boolean] = js.native
  
  var includeNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeNotes: js.UndefOr[Boolean] = js.native
  
  var includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeResources: js.UndefOr[Boolean] = js.native
  
  var includeSearches: js.UndefOr[Boolean] = js.native
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
  
  var includeTags: js.UndefOr[Boolean] = js.native
  
  var notebookGuids: js.UndefOr[Set[String]] = js.native
  
  var omitSharedNotebooks: js.UndefOr[Boolean] = js.native
  
  var requireNoteContentClass: js.UndefOr[String] = js.native
}
object IncludeExpunged {
  
  @scala.inline
  def apply(): IncludeExpunged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeExpunged]
  }
  
  @scala.inline
  implicit class IncludeExpungedOps[Self <: IncludeExpunged] (val x: Self) extends AnyVal {
    
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
    def setIncludeExpunged(value: Boolean): Self = this.set("includeExpunged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeExpunged: Self = this.set("includeExpunged", js.undefined)
    
    @scala.inline
    def setIncludeLinkedNotebooks(value: Boolean): Self = this.set("includeLinkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLinkedNotebooks: Self = this.set("includeLinkedNotebooks", js.undefined)
    
    @scala.inline
    def setIncludeNoteApplicationDataFullMap(value: Boolean): Self = this.set("includeNoteApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNoteApplicationDataFullMap: Self = this.set("includeNoteApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeNoteAttributes(value: Boolean): Self = this.set("includeNoteAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNoteAttributes: Self = this.set("includeNoteAttributes", js.undefined)
    
    @scala.inline
    def setIncludeNoteResourceApplicationDataFullMap(value: Boolean): Self = this.set("includeNoteResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNoteResourceApplicationDataFullMap: Self = this.set("includeNoteResourceApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeNoteResources(value: Boolean): Self = this.set("includeNoteResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNoteResources: Self = this.set("includeNoteResources", js.undefined)
    
    @scala.inline
    def setIncludeNotebooks(value: Boolean): Self = this.set("includeNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNotebooks: Self = this.set("includeNotebooks", js.undefined)
    
    @scala.inline
    def setIncludeNotes(value: Boolean): Self = this.set("includeNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNotes: Self = this.set("includeNotes", js.undefined)
    
    @scala.inline
    def setIncludeResourceApplicationDataFullMap(value: Boolean): Self = this.set("includeResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResourceApplicationDataFullMap: Self = this.set("includeResourceApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeResources(value: Boolean): Self = this.set("includeResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeResources: Self = this.set("includeResources", js.undefined)
    
    @scala.inline
    def setIncludeSearches(value: Boolean): Self = this.set("includeSearches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSearches: Self = this.set("includeSearches", js.undefined)
    
    @scala.inline
    def setIncludeSharedNotes(value: Boolean): Self = this.set("includeSharedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSharedNotes: Self = this.set("includeSharedNotes", js.undefined)
    
    @scala.inline
    def setIncludeTags(value: Boolean): Self = this.set("includeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTags: Self = this.set("includeTags", js.undefined)
    
    @scala.inline
    def setNotebookGuids(value: Set[String]): Self = this.set("notebookGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookGuids: Self = this.set("notebookGuids", js.undefined)
    
    @scala.inline
    def setOmitSharedNotebooks(value: Boolean): Self = this.set("omitSharedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitSharedNotebooks: Self = this.set("omitSharedNotebooks", js.undefined)
    
    @scala.inline
    def setRequireNoteContentClass(value: String): Self = this.set("requireNoteContentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireNoteContentClass: Self = this.set("requireNoteContentClass", js.undefined)
  }
}
