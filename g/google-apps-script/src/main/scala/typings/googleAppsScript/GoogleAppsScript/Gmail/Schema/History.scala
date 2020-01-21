package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.undefined
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.undefined
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.undefined
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.undefined
}

object History {
  @scala.inline
  def apply(
    id: String = null,
    labelsAdded: js.Array[HistoryLabelAdded] = null,
    labelsRemoved: js.Array[HistoryLabelRemoved] = null,
    messages: js.Array[Message] = null,
    messagesAdded: js.Array[HistoryMessageAdded] = null,
    messagesDeleted: js.Array[HistoryMessageDeleted] = null
  ): History = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelsAdded != null) __obj.updateDynamic("labelsAdded")(labelsAdded.asInstanceOf[js.Any])
    if (labelsRemoved != null) __obj.updateDynamic("labelsRemoved")(labelsRemoved.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (messagesAdded != null) __obj.updateDynamic("messagesAdded")(messagesAdded.asInstanceOf[js.Any])
    if (messagesDeleted != null) __obj.updateDynamic("messagesDeleted")(messagesDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
}

