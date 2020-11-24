package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityId extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
object RecipientIdentityId {
  
  @scala.inline
  def apply(): RecipientIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityId]
  }
  
  @scala.inline
  implicit class RecipientIdentityIdOps[Self <: RecipientIdentityId] (val x: Self) extends AnyVal {
    
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
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    
    @scala.inline
    def setRecipientIdentityId(value: typings.evernote.mod.Types.IdentityID): Self = this.set("recipientIdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientIdentityId: Self = this.set("recipientIdentityId", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = this.set("sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharerUserId: Self = this.set("sharerUserId", js.undefined)
  }
}
