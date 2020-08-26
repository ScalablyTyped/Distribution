package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHistoryResponse extends js.Object {
  /** List of history records. Any messages contained in the response will typically only have id and threadId fields populated. */
  var history: js.UndefOr[js.Array[History]] = js.native
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[String] = js.native
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListHistoryResponse {
  @scala.inline
  def apply(): ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHistoryResponse]
  }
  @scala.inline
  implicit class ListHistoryResponseOps[Self <: ListHistoryResponse] (val x: Self) extends AnyVal {
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
    def setHistoryVarargs(value: History*): Self = this.set("history", js.Array(value :_*))
    @scala.inline
    def setHistory(value: js.Array[History]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

