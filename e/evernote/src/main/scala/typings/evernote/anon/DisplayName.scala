package typings.evernote.anon

import typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typings.evernote.mod.Types.UserID
import typings.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends StObject {
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.native
  
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
object DisplayName {
  
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPrivilege(value: ShareRelationshipPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setRecipientUserIdentity(value: UserIdentity): Self = StObject.set(x, "recipientUserIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUserIdentityUndefined: Self = StObject.set(x, "recipientUserIdentity", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
  }
}
