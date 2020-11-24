package typings.evernote.mod.Types

import typings.evernote.anon.ReminderNotifyEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SharedNotebookRecipientSettings")
@js.native
class SharedNotebookRecipientSettings () extends js.Object {
  def this(args: ReminderNotifyEmail) = this()
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
}
