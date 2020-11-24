package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Privilege extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientUserId: js.UndefOr[UserID] = js.native
  
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
object Privilege {
  
  @scala.inline
  def apply(): Privilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privilege]
  }
  
  @scala.inline
  implicit class PrivilegeOps[Self <: Privilege] (val x: Self) extends AnyVal {
    
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
    def setRecipientUserId(value: UserID): Self = this.set("recipientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUserId: Self = this.set("recipientUserId", js.undefined)
    
    @scala.inline
    def setRestrictions(value: NoteShareRelationshipRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    
    @scala.inline
    def setSharerUserId(value: UserID): Self = this.set("sharerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharerUserId: Self = this.set("sharerUserId", js.undefined)
  }
}
