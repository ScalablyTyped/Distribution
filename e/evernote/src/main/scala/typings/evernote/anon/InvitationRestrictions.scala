package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typings.evernote.mod.NoteStore.NoteMemberShareRelationship
import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationRestrictions extends js.Object {
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.undefined
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.undefined
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.undefined
}

object InvitationRestrictions {
  @scala.inline
  def apply(
    invitationRestrictions: NoteShareRelationshipRestrictions = null,
    invitations: js.Array[NoteInvitationShareRelationship] = null,
    memberships: js.Array[NoteMemberShareRelationship] = null
  ): InvitationRestrictions = {
    val __obj = js.Dynamic.literal()
    if (invitationRestrictions != null) __obj.updateDynamic("invitationRestrictions")(invitationRestrictions.asInstanceOf[js.Any])
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationRestrictions]
  }
}

