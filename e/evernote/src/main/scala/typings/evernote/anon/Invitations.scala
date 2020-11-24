package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.NoteStore.ShareRelationshipRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invitations extends js.Object {
  
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
}
object Invitations {
  
  @scala.inline
  def apply(): Invitations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitations]
  }
  
  @scala.inline
  implicit class InvitationsOps[Self <: Invitations] (val x: Self) extends AnyVal {
    
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
    def setInvitationRestrictions(value: ShareRelationshipRestrictions): Self = this.set("invitationRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationRestrictions: Self = this.set("invitationRestrictions", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: InvitationShareRelationship*): Self = this.set("invitations", js.Array(value :_*))
    
    @scala.inline
    def setInvitations(value: js.Array[InvitationShareRelationship]): Self = this.set("invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitations: Self = this.set("invitations", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: MemberShareRelationship*): Self = this.set("memberships", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: js.Array[MemberShareRelationship]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
  }
}
