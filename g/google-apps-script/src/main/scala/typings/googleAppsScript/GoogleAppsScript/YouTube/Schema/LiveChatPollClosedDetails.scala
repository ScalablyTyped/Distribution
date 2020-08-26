package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatPollClosedDetails extends js.Object {
  var pollId: js.UndefOr[String] = js.native
}

object LiveChatPollClosedDetails {
  @scala.inline
  def apply(): LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatPollClosedDetails]
  }
  @scala.inline
  implicit class LiveChatPollClosedDetailsOps[Self <: LiveChatPollClosedDetails] (val x: Self) extends AnyVal {
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
    def setPollId(value: String): Self = this.set("pollId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollId: Self = this.set("pollId", js.undefined)
  }
  
}

