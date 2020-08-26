package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimHistory extends js.Object {
  var event: js.UndefOr[js.Array[ClaimEvent]] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var uploaderChannelId: js.UndefOr[String] = js.native
}

object ClaimHistory {
  @scala.inline
  def apply(): ClaimHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimHistory]
  }
  @scala.inline
  implicit class ClaimHistoryOps[Self <: ClaimHistory] (val x: Self) extends AnyVal {
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
    def setEventVarargs(value: ClaimEvent*): Self = this.set("event", js.Array(value :_*))
    @scala.inline
    def setEvent(value: js.Array[ClaimEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUploaderChannelId(value: String): Self = this.set("uploaderChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploaderChannelId: Self = this.set("uploaderChannelId", js.undefined)
  }
  
}

