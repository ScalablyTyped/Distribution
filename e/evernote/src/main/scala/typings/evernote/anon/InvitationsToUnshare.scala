package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typings.evernote.mod.NoteStore.NoteMemberShareRelationship
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsToUnshare extends js.Object {
  var invitationsToUnshare: js.UndefOr[js.Array[typings.evernote.mod.Types.IdentityID]] = js.native
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.native
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
  var noteGuid: js.UndefOr[String] = js.native
}

object InvitationsToUnshare {
  @scala.inline
  def apply(): InvitationsToUnshare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToUnshare]
  }
  @scala.inline
  implicit class InvitationsToUnshareOps[Self <: InvitationsToUnshare] (val x: Self) extends AnyVal {
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
    def setInvitationsToUnshareVarargs(value: typings.evernote.mod.Types.IdentityID*): Self = this.set("invitationsToUnshare", js.Array(value :_*))
    @scala.inline
    def setInvitationsToUnshare(value: js.Array[typings.evernote.mod.Types.IdentityID]): Self = this.set("invitationsToUnshare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationsToUnshare: Self = this.set("invitationsToUnshare", js.undefined)
    @scala.inline
    def setInvitationsToUpdateVarargs(value: NoteInvitationShareRelationship*): Self = this.set("invitationsToUpdate", js.Array(value :_*))
    @scala.inline
    def setInvitationsToUpdate(value: js.Array[NoteInvitationShareRelationship]): Self = this.set("invitationsToUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationsToUpdate: Self = this.set("invitationsToUpdate", js.undefined)
    @scala.inline
    def setMembershipsToUnshareVarargs(value: UserID*): Self = this.set("membershipsToUnshare", js.Array(value :_*))
    @scala.inline
    def setMembershipsToUnshare(value: js.Array[UserID]): Self = this.set("membershipsToUnshare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembershipsToUnshare: Self = this.set("membershipsToUnshare", js.undefined)
    @scala.inline
    def setMembershipsToUpdateVarargs(value: NoteMemberShareRelationship*): Self = this.set("membershipsToUpdate", js.Array(value :_*))
    @scala.inline
    def setMembershipsToUpdate(value: js.Array[NoteMemberShareRelationship]): Self = this.set("membershipsToUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembershipsToUpdate: Self = this.set("membershipsToUpdate", js.undefined)
    @scala.inline
    def setNoteGuid(value: String): Self = this.set("noteGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteGuid: Self = this.set("noteGuid", js.undefined)
  }
  
}

