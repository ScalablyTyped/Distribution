package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsToCreateOrUpdate extends js.Object {
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.undefined
  var inviteMessage: js.UndefOr[String] = js.undefined
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.undefined
}

object InvitationsToCreateOrUpdate {
  @scala.inline
  def apply(
    invitationsToCreateOrUpdate: js.Array[InvitationShareRelationship] = null,
    inviteMessage: String = null,
    membershipsToUpdate: js.Array[MemberShareRelationship] = null,
    notebookGuid: String = null,
    unshares: js.Array[UserIdentity] = null
  ): InvitationsToCreateOrUpdate = {
    val __obj = js.Dynamic.literal()
    if (invitationsToCreateOrUpdate != null) __obj.updateDynamic("invitationsToCreateOrUpdate")(invitationsToCreateOrUpdate.asInstanceOf[js.Any])
    if (inviteMessage != null) __obj.updateDynamic("inviteMessage")(inviteMessage.asInstanceOf[js.Any])
    if (membershipsToUpdate != null) __obj.updateDynamic("membershipsToUpdate")(membershipsToUpdate.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (unshares != null) __obj.updateDynamic("unshares")(unshares.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationsToCreateOrUpdate]
  }
}

