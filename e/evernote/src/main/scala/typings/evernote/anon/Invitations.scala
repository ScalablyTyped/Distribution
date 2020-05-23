package typings.evernote.anon

import typings.evernote.mod.NoteStore.InvitationShareRelationship
import typings.evernote.mod.NoteStore.MemberShareRelationship
import typings.evernote.mod.NoteStore.ShareRelationshipRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitations extends js.Object {
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.undefined
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.undefined
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.undefined
}

object Invitations {
  @scala.inline
  def apply(
    invitationRestrictions: ShareRelationshipRestrictions = null,
    invitations: js.Array[InvitationShareRelationship] = null,
    memberships: js.Array[MemberShareRelationship] = null
  ): Invitations = {
    val __obj = js.Dynamic.literal()
    if (invitationRestrictions != null) __obj.updateDynamic("invitationRestrictions")(invitationRestrictions.asInstanceOf[js.Any])
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitations]
  }
}

