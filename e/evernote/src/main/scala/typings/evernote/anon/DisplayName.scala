package typings.evernote.anon

import typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typings.evernote.mod.Types.UserID
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends js.Object {
  
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
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setPrivilege(value: ShareRelationshipPrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    
    @scala.inline
    def setRecipientUserIdentity(value: UserIdentity): Self = this.set("recipientUserIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUserIdentity: Self = this.set("recipientUserIdentity", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = this.set("sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharerUserId: Self = this.set("sharerUserId", js.undefined)
  }
}
