package typings.evernote.mod.NoteStore

import typings.evernote.anon.InvitationsToCreateOrUpdate
import typings.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNotebookSharesParameters")
@js.native
class ManageNotebookSharesParameters () extends StObject {
  def this(args: InvitationsToCreateOrUpdate) = this()
  
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  
  var inviteMessage: js.UndefOr[String] = js.native
  
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
  
  var notebookGuid: js.UndefOr[String] = js.native
  
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.native
}
