package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import typings.evernote.mod.Types.SharedNotebookRecipientSettings
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var globalId: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var notebookModifiable: js.UndefOr[Boolean] = js.undefined
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.undefined
  
  var recipientUserId: js.UndefOr[UserID] = js.undefined
  
  var recipientUsername: js.UndefOr[String] = js.undefined
  
  var serviceAssigned: js.UndefOr[Timestamp] = js.undefined
  
  var serviceCreated: js.UndefOr[Timestamp] = js.undefined
  
  var serviceUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var sharerUserId: js.UndefOr[UserID] = js.undefined
  
  var userId: js.UndefOr[UserID] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIdUndefined: Self = StObject.set(x, "globalId", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setNotebookModifiable(value: Boolean): Self = StObject.set(x, "notebookModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookModifiableUndefined: Self = StObject.set(x, "notebookModifiable", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientIdentityId(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "recipientIdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdentityIdUndefined: Self = StObject.set(x, "recipientIdentityId", js.undefined)
    
    @scala.inline
    def setRecipientSettings(value: SharedNotebookRecipientSettings): Self = StObject.set(x, "recipientSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSettingsUndefined: Self = StObject.set(x, "recipientSettings", js.undefined)
    
    @scala.inline
    def setRecipientUserId(value: UserID): Self = StObject.set(x, "recipientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUserIdUndefined: Self = StObject.set(x, "recipientUserId", js.undefined)
    
    @scala.inline
    def setRecipientUsername(value: String): Self = StObject.set(x, "recipientUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUsernameUndefined: Self = StObject.set(x, "recipientUsername", js.undefined)
    
    @scala.inline
    def setServiceAssigned(value: Timestamp): Self = StObject.set(x, "serviceAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAssignedUndefined: Self = StObject.set(x, "serviceAssigned", js.undefined)
    
    @scala.inline
    def setServiceCreated(value: Timestamp): Self = StObject.set(x, "serviceCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCreatedUndefined: Self = StObject.set(x, "serviceCreated", js.undefined)
    
    @scala.inline
    def setServiceUpdated(value: Timestamp): Self = StObject.set(x, "serviceUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdatedUndefined: Self = StObject.set(x, "serviceUpdated", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
    
    @scala.inline
    def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
