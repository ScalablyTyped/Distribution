package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var id: js.UndefOr[String] = js.native
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.native
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.native
  var messages: js.UndefOr[js.Array[Message]] = js.native
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.native
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.native
}

object History {
  @scala.inline
  def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelsAddedVarargs(value: HistoryLabelAdded*): Self = this.set("labelsAdded", js.Array(value :_*))
    @scala.inline
    def setLabelsAdded(value: js.Array[HistoryLabelAdded]): Self = this.set("labelsAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsAdded: Self = this.set("labelsAdded", js.undefined)
    @scala.inline
    def setLabelsRemovedVarargs(value: HistoryLabelRemoved*): Self = this.set("labelsRemoved", js.Array(value :_*))
    @scala.inline
    def setLabelsRemoved(value: js.Array[HistoryLabelRemoved]): Self = this.set("labelsRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsRemoved: Self = this.set("labelsRemoved", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMessagesAddedVarargs(value: HistoryMessageAdded*): Self = this.set("messagesAdded", js.Array(value :_*))
    @scala.inline
    def setMessagesAdded(value: js.Array[HistoryMessageAdded]): Self = this.set("messagesAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesAdded: Self = this.set("messagesAdded", js.undefined)
    @scala.inline
    def setMessagesDeletedVarargs(value: HistoryMessageDeleted*): Self = this.set("messagesDeleted", js.Array(value :_*))
    @scala.inline
    def setMessagesDeleted(value: js.Array[HistoryMessageDeleted]): Self = this.set("messagesDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesDeleted: Self = this.set("messagesDeleted", js.undefined)
  }
  
}

