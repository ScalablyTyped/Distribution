package typings.evernote.mod.NoteStore

import typings.evernote.anon.Invitations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ShareRelationships")
@js.native
class ShareRelationships () extends js.Object {
  def this(args: Invitations) = this()
  
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
}
