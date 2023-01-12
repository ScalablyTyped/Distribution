package typings.evernote.anon

import typings.evernote.mod.Types.Identity
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentity extends StObject {
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  
  var recipientIdentity: js.UndefOr[Identity] = js.undefined
  
  var serviceAssigned: js.UndefOr[Timestamp] = js.undefined
  
  var serviceCreated: js.UndefOr[Timestamp] = js.undefined
  
  var serviceUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var sharerUserID: js.UndefOr[UserID] = js.undefined
}
object RecipientIdentity {
  
  inline def apply(): RecipientIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientIdentity] (val x: Self) extends AnyVal {
    
    inline def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setRecipientIdentity(value: Identity): Self = StObject.set(x, "recipientIdentity", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdentityUndefined: Self = StObject.set(x, "recipientIdentity", js.undefined)
    
    inline def setServiceAssigned(value: Timestamp): Self = StObject.set(x, "serviceAssigned", value.asInstanceOf[js.Any])
    
    inline def setServiceAssignedUndefined: Self = StObject.set(x, "serviceAssigned", js.undefined)
    
    inline def setServiceCreated(value: Timestamp): Self = StObject.set(x, "serviceCreated", value.asInstanceOf[js.Any])
    
    inline def setServiceCreatedUndefined: Self = StObject.set(x, "serviceCreated", js.undefined)
    
    inline def setServiceUpdated(value: Timestamp): Self = StObject.set(x, "serviceUpdated", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdatedUndefined: Self = StObject.set(x, "serviceUpdated", js.undefined)
    
    inline def setSharerUserID(value: UserID): Self = StObject.set(x, "sharerUserID", value.asInstanceOf[js.Any])
    
    inline def setSharerUserIDUndefined: Self = StObject.set(x, "sharerUserID", js.undefined)
  }
}
