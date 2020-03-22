package typings.evernote

import typings.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typings.evernote.mod.NoteStore.NoteMemberShareRelationship
import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvitationsToUnshare extends js.Object {
  var invitationsToUnshare: js.UndefOr[js.Array[IdentityID]] = js.undefined
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.undefined
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.undefined
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.undefined
  var noteGuid: js.UndefOr[String] = js.undefined
}

object AnonInvitationsToUnshare {
  @scala.inline
  def apply(
    invitationsToUnshare: js.Array[IdentityID] = null,
    invitationsToUpdate: js.Array[NoteInvitationShareRelationship] = null,
    membershipsToUnshare: js.Array[UserID] = null,
    membershipsToUpdate: js.Array[NoteMemberShareRelationship] = null,
    noteGuid: String = null
  ): AnonInvitationsToUnshare = {
    val __obj = js.Dynamic.literal()
    if (invitationsToUnshare != null) __obj.updateDynamic("invitationsToUnshare")(invitationsToUnshare.asInstanceOf[js.Any])
    if (invitationsToUpdate != null) __obj.updateDynamic("invitationsToUpdate")(invitationsToUpdate.asInstanceOf[js.Any])
    if (membershipsToUnshare != null) __obj.updateDynamic("membershipsToUnshare")(membershipsToUnshare.asInstanceOf[js.Any])
    if (membershipsToUpdate != null) __obj.updateDynamic("membershipsToUpdate")(membershipsToUpdate.asInstanceOf[js.Any])
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvitationsToUnshare]
  }
}

