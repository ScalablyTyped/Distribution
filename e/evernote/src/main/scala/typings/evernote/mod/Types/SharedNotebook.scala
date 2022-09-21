package typings.evernote.mod.Types

import typings.evernote.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SharedNotebook")
@js.native
open class SharedNotebook () extends StObject {
  def this(args: Email) = this()
  
  var email: js.UndefOr[String] = js.native
  
  var globalId: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var notebookGuid: js.UndefOr[Guid] = js.native
  
  var notebookModifiable: js.UndefOr[Boolean] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.native
  
  var recipientUserId: js.UndefOr[UserID] = js.native
  
  var recipientUsername: js.UndefOr[String] = js.native
  
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
  
  var userId: js.UndefOr[UserID] = js.native
  
  var username: js.UndefOr[String] = js.native
}
