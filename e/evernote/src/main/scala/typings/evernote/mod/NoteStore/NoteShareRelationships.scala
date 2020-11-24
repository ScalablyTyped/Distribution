package typings.evernote.mod.NoteStore

import typings.evernote.anon.InvitationRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteShareRelationships")
@js.native
class NoteShareRelationships () extends js.Object {
  def this(args: InvitationRestrictions) = this()
  
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
}
