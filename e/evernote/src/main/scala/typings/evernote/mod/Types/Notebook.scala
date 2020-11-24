package typings.evernote.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Notebook")
@js.native
class Notebook () extends js.Object {
  def this(args: typings.evernote.anon.BusinessNotebook) = this()
  
  var businessNotebook: js.UndefOr[BusinessNotebook] = js.native
  
  var contact: js.UndefOr[User] = js.native
  
  var defaultNotebook: js.UndefOr[Boolean] = js.native
  
  var guid: js.UndefOr[Guid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var published: js.UndefOr[Boolean] = js.native
  
  var publishing: js.UndefOr[Publishing] = js.native
  
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.native
  
  var restrictions: js.UndefOr[NotebookRestrictions] = js.native
  
  var serviceCreated: js.UndefOr[Double] = js.native
  
  var serviceUpdated: js.UndefOr[Double] = js.native
  
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.native
  
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
