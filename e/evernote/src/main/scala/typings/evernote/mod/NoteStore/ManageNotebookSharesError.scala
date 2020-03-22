package typings.evernote.mod.NoteStore

import typings.evernote.AnonNotFoundException
import typings.evernote.mod.Errors.EDAMNotFoundException
import typings.evernote.mod.Errors.EDAMUserException
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNotebookSharesError")
@js.native
class ManageNotebookSharesError () extends js.Object {
  def this(args: AnonNotFoundException) = this()
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

