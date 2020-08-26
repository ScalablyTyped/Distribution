package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMessagesResponse extends js.Object {
  var messages: js.UndefOr[js.Array[Message]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object ListMessagesResponse {
  @scala.inline
  def apply(): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMessagesResponse]
  }
  @scala.inline
  implicit class ListMessagesResponseOps[Self <: ListMessagesResponse] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = this.set("resultSizeEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSizeEstimate: Self = this.set("resultSizeEstimate", js.undefined)
  }
  
}

