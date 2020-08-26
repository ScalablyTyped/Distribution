package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var historyId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var internalDate: js.UndefOr[String] = js.native
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var payload: js.UndefOr[MessagePart] = js.native
  var raw: js.UndefOr[String] = js.native
  var sizeEstimate: js.UndefOr[Double] = js.native
  var snippet: js.UndefOr[String] = js.native
  var threadId: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalDate(value: String): Self = this.set("internalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalDate: Self = this.set("internalDate", js.undefined)
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    @scala.inline
    def setPayload(value: MessagePart): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setSizeEstimate(value: Double): Self = this.set("sizeEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeEstimate: Self = this.set("sizeEstimate", js.undefined)
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setThreadId(value: String): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
  }
  
}

