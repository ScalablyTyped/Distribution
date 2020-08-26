package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryLabelAdded extends js.Object {
  /** Label IDs added to the message. */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var message: js.UndefOr[Message] = js.native
}

object HistoryLabelAdded {
  @scala.inline
  def apply(): HistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLabelAdded]
  }
  @scala.inline
  implicit class HistoryLabelAddedOps[Self <: HistoryLabelAdded] (val x: Self) extends AnyVal {
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
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

