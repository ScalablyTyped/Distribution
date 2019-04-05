package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryMessageAdded extends js.Object {
  var message: js.UndefOr[Message] = js.undefined
}

object HistoryMessageAdded {
  @scala.inline
  def apply(message: Message = null): HistoryMessageAdded = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[HistoryMessageAdded]
  }
}

