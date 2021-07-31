package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentityId extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}
object RecipientIdentityId {
  
  @scala.inline
  def apply(): RecipientIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityId]
  }
  
  @scala.inline
  implicit class RecipientIdentityIdMutableBuilder[Self <: RecipientIdentityId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientIdentityId(value: typings.evernote.mod.Types.IdentityID): Self = StObject.set(x, "recipientIdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdentityIdUndefined: Self = StObject.set(x, "recipientIdentityId", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
  }
}
