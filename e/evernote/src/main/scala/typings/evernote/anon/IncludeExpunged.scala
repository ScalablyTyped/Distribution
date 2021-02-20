package typings.evernote.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeExpunged extends StObject {
  
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
  implicit class IncludeExpungedMutableBuilder[Self <: IncludeExpunged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeExpunged(value: Boolean): Self = StObject.set(x, "includeExpunged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExpungedUndefined: Self = StObject.set(x, "includeExpunged", js.undefined)
    
    @scala.inline
    def setIncludeLinkedNotebooks(value: Boolean): Self = StObject.set(x, "includeLinkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinkedNotebooksUndefined: Self = StObject.set(x, "includeLinkedNotebooks", js.undefined)
    
    @scala.inline
    def setIncludeNoteApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeNoteApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNoteApplicationDataFullMapUndefined: Self = StObject.set(x, "includeNoteApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeNoteAttributes(value: Boolean): Self = StObject.set(x, "includeNoteAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNoteAttributesUndefined: Self = StObject.set(x, "includeNoteAttributes", js.undefined)
    
    @scala.inline
    def setIncludeNoteResourceApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeNoteResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNoteResourceApplicationDataFullMapUndefined: Self = StObject.set(x, "includeNoteResourceApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeNoteResources(value: Boolean): Self = StObject.set(x, "includeNoteResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNoteResourcesUndefined: Self = StObject.set(x, "includeNoteResources", js.undefined)
    
    @scala.inline
    def setIncludeNotebooks(value: Boolean): Self = StObject.set(x, "includeNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNotebooksUndefined: Self = StObject.set(x, "includeNotebooks", js.undefined)
    
    @scala.inline
    def setIncludeNotes(value: Boolean): Self = StObject.set(x, "includeNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNotesUndefined: Self = StObject.set(x, "includeNotes", js.undefined)
    
    @scala.inline
    def setIncludeResourceApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourceApplicationDataFullMapUndefined: Self = StObject.set(x, "includeResourceApplicationDataFullMap", js.undefined)
    
    @scala.inline
    def setIncludeResources(value: Boolean): Self = StObject.set(x, "includeResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourcesUndefined: Self = StObject.set(x, "includeResources", js.undefined)
    
    @scala.inline
    def setIncludeSearches(value: Boolean): Self = StObject.set(x, "includeSearches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSearchesUndefined: Self = StObject.set(x, "includeSearches", js.undefined)
    
    @scala.inline
    def setIncludeSharedNotes(value: Boolean): Self = StObject.set(x, "includeSharedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSharedNotesUndefined: Self = StObject.set(x, "includeSharedNotes", js.undefined)
    
    @scala.inline
    def setIncludeTags(value: Boolean): Self = StObject.set(x, "includeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTagsUndefined: Self = StObject.set(x, "includeTags", js.undefined)
    
    @scala.inline
    def setNotebookGuids(value: Set[String]): Self = StObject.set(x, "notebookGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidsUndefined: Self = StObject.set(x, "notebookGuids", js.undefined)
    
    @scala.inline
    def setOmitSharedNotebooks(value: Boolean): Self = StObject.set(x, "omitSharedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitSharedNotebooksUndefined: Self = StObject.set(x, "omitSharedNotebooks", js.undefined)
    
    @scala.inline
    def setRequireNoteContentClass(value: String): Self = StObject.set(x, "requireNoteContentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireNoteContentClassUndefined: Self = StObject.set(x, "requireNoteContentClass", js.undefined)
  }
}
