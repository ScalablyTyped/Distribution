package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryMessageDeleted extends js.Object {
  var message: js.UndefOr[Message] = js.undefined
}

object HistoryMessageDeleted {
  @scala.inline
  def apply(message: Message = null): HistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessageDeleted]
  }
}

