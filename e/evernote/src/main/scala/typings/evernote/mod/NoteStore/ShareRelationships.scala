package typings.evernote.mod.NoteStore

import typings.evernote.AnonInvitations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ShareRelationships")
@js.native
class ShareRelationships () extends js.Object {
  def this(args: AnonInvitations) = this()
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.native
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
}

