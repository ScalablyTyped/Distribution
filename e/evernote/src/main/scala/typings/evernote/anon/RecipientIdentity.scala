package typings.evernote.anon

import typings.evernote.mod.Types.Identity
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentity extends StObject {
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentity: js.UndefOr[Identity] = js.native
  
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  
  var sharerUserID: js.UndefOr[UserID] = js.native
}
object RecipientIdentity {
  
  @scala.inline
  def apply(): RecipientIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentity]
  }
  
  @scala.inline
  implicit class RecipientIdentityMutableBuilder[Self <: RecipientIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientIdentity(value: Identity): Self = StObject.set(x, "recipientIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdentityUndefined: Self = StObject.set(x, "recipientIdentity", js.undefined)
    
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
    def setSharerUserID(value: UserID): Self = StObject.set(x, "sharerUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIDUndefined: Self = StObject.set(x, "sharerUserID", js.undefined)
  }
}
