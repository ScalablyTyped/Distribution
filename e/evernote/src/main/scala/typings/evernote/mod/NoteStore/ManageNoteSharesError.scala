package typings.evernote.mod.NoteStore

import typings.evernote.anon.IdentityID
import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesError")
@js.native
open class ManageNoteSharesError () extends StObject {
  def this(args: IdentityID) = this()
  
  var identityID: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.native
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userID: js.UndefOr[UserID] = js.native
}
