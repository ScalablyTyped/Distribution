package typings.evernote.mod.NoteStore

import typings.evernote.anon.RecipientIdentityId
import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteInvitationShareRelationship")
@js.native
class NoteInvitationShareRelationship () extends js.Object {
  def this(args: RecipientIdentityId) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

