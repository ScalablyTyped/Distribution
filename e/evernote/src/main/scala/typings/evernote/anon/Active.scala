package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.NoteLimits
import typings.evernote.mod.Types.NoteRestrictions
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SharedNote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var attributes: js.UndefOr[NoteAttributes] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentHash: js.UndefOr[String] = js.native
  
  var contentLength: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Double] = js.native
  
  var deleted: js.UndefOr[Double] = js.native
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var limits: js.UndefOr[NoteLimits] = js.native
  
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  
  var restrictions: js.UndefOr[NoteRestrictions] = js.native
  
  var sharedNotes: js.UndefOr[js.Array[SharedNote]] = js.native
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  
  var tagNames: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Double] = js.native
}
object Active {
  
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAttributes(value: NoteAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setLimits(value: NoteLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setRestrictions(value: NoteRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setSharedNotes(value: js.Array[SharedNote]): Self = StObject.set(x, "sharedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedNotesUndefined: Self = StObject.set(x, "sharedNotes", js.undefined)
    
    @scala.inline
    def setSharedNotesVarargs(value: SharedNote*): Self = StObject.set(x, "sharedNotes", js.Array(value :_*))
    
    @scala.inline
    def setTagGuids(value: js.Array[String]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    @scala.inline
    def setTagGuidsVarargs(value: String*): Self = StObject.set(x, "tagGuids", js.Array(value :_*))
    
    @scala.inline
    def setTagNames(value: js.Array[String]): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
    
    @scala.inline
    def setTagNamesVarargs(value: String*): Self = StObject.set(x, "tagNames", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
