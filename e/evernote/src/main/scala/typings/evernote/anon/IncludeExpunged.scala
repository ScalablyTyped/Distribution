package typings.evernote.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeExpunged extends StObject {
  
  var includeExpunged: js.UndefOr[Boolean] = js.undefined
  
  var includeLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  
  var includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  
  var includeNoteAttributes: js.UndefOr[Boolean] = js.undefined
  
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  
  var includeNoteResources: js.UndefOr[Boolean] = js.undefined
  
  var includeNotebooks: js.UndefOr[Boolean] = js.undefined
  
  var includeNotes: js.UndefOr[Boolean] = js.undefined
  
  var includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.undefined
  
  var includeResources: js.UndefOr[Boolean] = js.undefined
  
  var includeSearches: js.UndefOr[Boolean] = js.undefined
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.undefined
  
  var includeTags: js.UndefOr[Boolean] = js.undefined
  
  var notebookGuids: js.UndefOr[Set[String]] = js.undefined
  
  var omitSharedNotebooks: js.UndefOr[Boolean] = js.undefined
  
  var requireNoteContentClass: js.UndefOr[String] = js.undefined
}
object IncludeExpunged {
  
  inline def apply(): IncludeExpunged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeExpunged]
  }
  
  extension [Self <: IncludeExpunged](x: Self) {
    
    inline def setIncludeExpunged(value: Boolean): Self = StObject.set(x, "includeExpunged", value.asInstanceOf[js.Any])
    
    inline def setIncludeExpungedUndefined: Self = StObject.set(x, "includeExpunged", js.undefined)
    
    inline def setIncludeLinkedNotebooks(value: Boolean): Self = StObject.set(x, "includeLinkedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinkedNotebooksUndefined: Self = StObject.set(x, "includeLinkedNotebooks", js.undefined)
    
    inline def setIncludeNoteApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeNoteApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    inline def setIncludeNoteApplicationDataFullMapUndefined: Self = StObject.set(x, "includeNoteApplicationDataFullMap", js.undefined)
    
    inline def setIncludeNoteAttributes(value: Boolean): Self = StObject.set(x, "includeNoteAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeNoteAttributesUndefined: Self = StObject.set(x, "includeNoteAttributes", js.undefined)
    
    inline def setIncludeNoteResourceApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeNoteResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    inline def setIncludeNoteResourceApplicationDataFullMapUndefined: Self = StObject.set(x, "includeNoteResourceApplicationDataFullMap", js.undefined)
    
    inline def setIncludeNoteResources(value: Boolean): Self = StObject.set(x, "includeNoteResources", value.asInstanceOf[js.Any])
    
    inline def setIncludeNoteResourcesUndefined: Self = StObject.set(x, "includeNoteResources", js.undefined)
    
    inline def setIncludeNotebooks(value: Boolean): Self = StObject.set(x, "includeNotebooks", value.asInstanceOf[js.Any])
    
    inline def setIncludeNotebooksUndefined: Self = StObject.set(x, "includeNotebooks", js.undefined)
    
    inline def setIncludeNotes(value: Boolean): Self = StObject.set(x, "includeNotes", value.asInstanceOf[js.Any])
    
    inline def setIncludeNotesUndefined: Self = StObject.set(x, "includeNotes", js.undefined)
    
    inline def setIncludeResourceApplicationDataFullMap(value: Boolean): Self = StObject.set(x, "includeResourceApplicationDataFullMap", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourceApplicationDataFullMapUndefined: Self = StObject.set(x, "includeResourceApplicationDataFullMap", js.undefined)
    
    inline def setIncludeResources(value: Boolean): Self = StObject.set(x, "includeResources", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourcesUndefined: Self = StObject.set(x, "includeResources", js.undefined)
    
    inline def setIncludeSearches(value: Boolean): Self = StObject.set(x, "includeSearches", value.asInstanceOf[js.Any])
    
    inline def setIncludeSearchesUndefined: Self = StObject.set(x, "includeSearches", js.undefined)
    
    inline def setIncludeSharedNotes(value: Boolean): Self = StObject.set(x, "includeSharedNotes", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedNotesUndefined: Self = StObject.set(x, "includeSharedNotes", js.undefined)
    
    inline def setIncludeTags(value: Boolean): Self = StObject.set(x, "includeTags", value.asInstanceOf[js.Any])
    
    inline def setIncludeTagsUndefined: Self = StObject.set(x, "includeTags", js.undefined)
    
    inline def setNotebookGuids(value: Set[String]): Self = StObject.set(x, "notebookGuids", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidsUndefined: Self = StObject.set(x, "notebookGuids", js.undefined)
    
    inline def setOmitSharedNotebooks(value: Boolean): Self = StObject.set(x, "omitSharedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setOmitSharedNotebooksUndefined: Self = StObject.set(x, "omitSharedNotebooks", js.undefined)
    
    inline def setRequireNoteContentClass(value: String): Self = StObject.set(x, "requireNoteContentClass", value.asInstanceOf[js.Any])
    
    inline def setRequireNoteContentClassUndefined: Self = StObject.set(x, "requireNoteContentClass", js.undefined)
  }
}
