package typings.evernote.mod.NoteStore

import typings.evernote.AnonDisplayName
import typings.evernote.mod.Types.UserID
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.InvitationShareRelationship")
@js.native
class InvitationShareRelationship () extends js.Object {
  def this(args: AnonDisplayName) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.native
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

