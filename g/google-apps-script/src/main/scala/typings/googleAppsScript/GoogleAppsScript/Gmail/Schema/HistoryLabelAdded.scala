package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryLabelAdded extends js.Object {
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object HistoryLabelAdded {
  @scala.inline
  def apply(labelIds: js.Array[String] = null, message: Message = null): HistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryLabelAdded]
  }
}

