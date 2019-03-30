package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLabelRemoved extends js.Object {
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object HistoryLabelRemoved {
  @scala.inline
  def apply(labelIds: js.Array[java.lang.String] = null, message: Message = null): HistoryLabelRemoved = {
    val __obj = js.Dynamic.literal()
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[HistoryLabelRemoved]
  }
}

