package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsToCreateOrUpdate extends js.Object {
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  var inviteMessage: js.UndefOr[String] = js.native
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.native
}

object InvitationsToCreateOrUpdate {
  @scala.inline
  def apply(): InvitationsToCreateOrUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToCreateOrUpdate]
  }
  @scala.inline
  implicit class InvitationsToCreateOrUpdateOps[Self <: InvitationsToCreateOrUpdate] (val x: Self) extends AnyVal {
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
    def setInvitationsToCreateOrUpdateVarargs(value: InvitationShareRelationship*): Self = this.set("invitationsToCreateOrUpdate", js.Array(value :_*))
    @scala.inline
    def setInvitationsToCreateOrUpdate(value: js.Array[InvitationShareRelationship]): Self = this.set("invitationsToCreateOrUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationsToCreateOrUpdate: Self = this.set("invitationsToCreateOrUpdate", js.undefined)
    @scala.inline
    def setInviteMessage(value: String): Self = this.set("inviteMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteMessage: Self = this.set("inviteMessage", js.undefined)
    @scala.inline
    def setMembershipsToUpdateVarargs(value: MemberShareRelationship*): Self = this.set("membershipsToUpdate", js.Array(value :_*))
    @scala.inline
    def setMembershipsToUpdate(value: js.Array[MemberShareRelationship]): Self = this.set("membershipsToUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembershipsToUpdate: Self = this.set("membershipsToUpdate", js.undefined)
    @scala.inline
    def setNotebookGuid(value: String): Self = this.set("notebookGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookGuid: Self = this.set("notebookGuid", js.undefined)
    @scala.inline
    def setUnsharesVarargs(value: UserIdentity*): Self = this.set("unshares", js.Array(value :_*))
    @scala.inline
    def setUnshares(value: js.Array[UserIdentity]): Self = this.set("unshares", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnshares: Self = this.set("unshares", js.undefined)
  }
  
}

