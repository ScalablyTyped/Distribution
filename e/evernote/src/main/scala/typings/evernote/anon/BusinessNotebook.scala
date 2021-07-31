package typings.evernote.anon

import typings.evernote.mod.Types.NotebookRecipientSettings
import typings.evernote.mod.Types.NotebookRestrictions
import typings.evernote.mod.Types.Publishing
import typings.evernote.mod.Types.SharedNotebook
import typings.evernote.mod.Types.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessNotebook extends StObject {
  
  var businessNotebook: js.UndefOr[typings.evernote.mod.Types.BusinessNotebook] = js.undefined
  
  var contact: js.UndefOr[User] = js.undefined
  
  var defaultNotebook: js.UndefOr[Boolean] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var published: js.UndefOr[Boolean] = js.undefined
  
  var publishing: js.UndefOr[Publishing] = js.undefined
  
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.undefined
  
  var restrictions: js.UndefOr[NotebookRestrictions] = js.undefined
  
  var serviceCreated: js.UndefOr[Double] = js.undefined
  
  var serviceUpdated: js.UndefOr[Double] = js.undefined
  
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}
object BusinessNotebook {
  
  @scala.inline
  def apply(): BusinessNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessNotebook]
  }
  
  @scala.inline
  implicit class BusinessNotebookMutableBuilder[Self <: BusinessNotebook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessNotebook(value: typings.evernote.mod.Types.BusinessNotebook): Self = StObject.set(x, "businessNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessNotebookUndefined: Self = StObject.set(x, "businessNotebook", js.undefined)
    
    @scala.inline
    def setContact(value: User): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setDefaultNotebook(value: Boolean): Self = StObject.set(x, "defaultNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNotebookUndefined: Self = StObject.set(x, "defaultNotebook", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setPublishing(value: Publishing): Self = StObject.set(x, "publishing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishingUndefined: Self = StObject.set(x, "publishing", js.undefined)
    
    @scala.inline
    def setRecipientSettings(value: NotebookRecipientSettings): Self = StObject.set(x, "recipientSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSettingsUndefined: Self = StObject.set(x, "recipientSettings", js.undefined)
    
    @scala.inline
    def setRestrictions(value: NotebookRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setServiceCreated(value: Double): Self = StObject.set(x, "serviceCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCreatedUndefined: Self = StObject.set(x, "serviceCreated", js.undefined)
    
    @scala.inline
    def setServiceUpdated(value: Double): Self = StObject.set(x, "serviceUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdatedUndefined: Self = StObject.set(x, "serviceUpdated", js.undefined)
    
    @scala.inline
    def setSharedNotebookIds(value: js.Array[Double]): Self = StObject.set(x, "sharedNotebookIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedNotebookIdsUndefined: Self = StObject.set(x, "sharedNotebookIds", js.undefined)
    
    @scala.inline
    def setSharedNotebookIdsVarargs(value: Double*): Self = StObject.set(x, "sharedNotebookIds", js.Array(value :_*))
    
    @scala.inline
    def setSharedNotebooks(value: js.Array[SharedNotebook]): Self = StObject.set(x, "sharedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedNotebooksUndefined: Self = StObject.set(x, "sharedNotebooks", js.undefined)
    
    @scala.inline
    def setSharedNotebooksVarargs(value: SharedNotebook*): Self = StObject.set(x, "sharedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
  }
}
