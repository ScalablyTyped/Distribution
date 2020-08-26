package typings.evernote.anon

import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTime extends js.Object {
  var currentTime: js.UndefOr[Timestamp] = js.native
  var fullSyncBefore: js.UndefOr[Timestamp] = js.native
  var updateCount: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
  var userLastUpdated: js.UndefOr[Timestamp] = js.native
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.native
}

object CurrentTime {
  @scala.inline
  def apply(): CurrentTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTime]
  }
  @scala.inline
  implicit class CurrentTimeOps[Self <: CurrentTime] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Timestamp): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    @scala.inline
    def setFullSyncBefore(value: Timestamp): Self = this.set("fullSyncBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullSyncBefore: Self = this.set("fullSyncBefore", js.undefined)
    @scala.inline
    def setUpdateCount(value: Double): Self = this.set("updateCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCount: Self = this.set("updateCount", js.undefined)
    @scala.inline
    def setUploaded(value: Double): Self = this.set("uploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploaded: Self = this.set("uploaded", js.undefined)
    @scala.inline
    def setUserLastUpdated(value: Timestamp): Self = this.set("userLastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLastUpdated: Self = this.set("userLastUpdated", js.undefined)
    @scala.inline
    def setUserMaxMessageEventId(value: MessageEventID): Self = this.set("userMaxMessageEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMaxMessageEventId: Self = this.set("userMaxMessageEventId", js.undefined)
  }
  
}

