package typings.evernote.mod.Types

import typings.evernote.anon.InMyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.NotebookRecipientSettings")
@js.native
open class NotebookRecipientSettings () extends StObject {
  def this(args: InMyList) = this()
  
  var inMyList: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[String] = js.native
}
