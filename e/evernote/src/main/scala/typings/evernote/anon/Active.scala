package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.NoteLimits
import typings.evernote.mod.Types.NoteRestrictions
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SharedNote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var contentHash: js.UndefOr[String] = js.undefined
  
  var contentLength: js.UndefOr[Double] = js.undefined
  
  var created: js.UndefOr[Double] = js.undefined
  
  var deleted: js.UndefOr[Double] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var limits: js.UndefOr[NoteLimits] = js.undefined
  
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  
  var restrictions: js.UndefOr[NoteRestrictions] = js.undefined
  
  var sharedNotes: js.UndefOr[js.Array[SharedNote]] = js.undefined
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  
  var tagNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[Double] = js.undefined
}
object Active {
  
  inline def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAttributes(value: NoteAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setLimits(value: NoteLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    inline def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    inline def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRestrictions(value: NoteRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setSharedNotes(value: js.Array[SharedNote]): Self = StObject.set(x, "sharedNotes", value.asInstanceOf[js.Any])
    
    inline def setSharedNotesUndefined: Self = StObject.set(x, "sharedNotes", js.undefined)
    
    inline def setSharedNotesVarargs(value: SharedNote*): Self = StObject.set(x, "sharedNotes", js.Array(value*))
    
    inline def setTagGuids(value: js.Array[String]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    inline def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    inline def setTagGuidsVarargs(value: String*): Self = StObject.set(x, "tagGuids", js.Array(value*))
    
    inline def setTagNames(value: js.Array[String]): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    inline def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
    
    inline def setTagNamesVarargs(value: String*): Self = StObject.set(x, "tagNames", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
