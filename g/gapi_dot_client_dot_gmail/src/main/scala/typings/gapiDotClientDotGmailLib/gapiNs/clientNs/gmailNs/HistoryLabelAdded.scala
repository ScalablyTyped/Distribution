package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLabelAdded extends js.Object {
  /** Label IDs added to the message. */
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object HistoryLabelAdded {
  @scala.inline
  def apply(labelIds: js.Array[java.lang.String] = null, message: Message = null): HistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[HistoryLabelAdded]
  }
}

