package typings.evernote.mod.NoteStore

import typings.evernote.anon.NotFoundException
import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNotebookSharesError")
@js.native
class ManageNotebookSharesError () extends StObject {
  def this(args: NotFoundException) = this()
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}
