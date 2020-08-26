package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatPollVotedDetails extends js.Object {
  /** The poll item the user chose. */
  var itemId: js.UndefOr[String] = js.native
  /** The poll the user voted on. */
  var pollId: js.UndefOr[String] = js.native
}

object LiveChatPollVotedDetails {
  @scala.inline
  def apply(): LiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatPollVotedDetails]
  }
  @scala.inline
  implicit class LiveChatPollVotedDetailsOps[Self <: LiveChatPollVotedDetails] (val x: Self) extends AnyVal {
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setPollId(value: String): Self = this.set("pollId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollId: Self = this.set("pollId", js.undefined)
  }
  
}

