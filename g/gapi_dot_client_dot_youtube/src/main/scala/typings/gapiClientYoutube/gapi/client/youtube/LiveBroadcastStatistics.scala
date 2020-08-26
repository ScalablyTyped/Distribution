package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastStatistics extends js.Object {
  /**
    * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the
    * broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the
    * broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
    */
  var concurrentViewers: js.UndefOr[String] = js.native
  /**
    * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live
    * chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not
    * identify the number of chat messages for an archived video of a completed live broadcast.
    */
  var totalChatCount: js.UndefOr[String] = js.native
}

object LiveBroadcastStatistics {
  @scala.inline
  def apply(): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
  @scala.inline
  implicit class LiveBroadcastStatisticsOps[Self <: LiveBroadcastStatistics] (val x: Self) extends AnyVal {
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
    def setConcurrentViewers(value: String): Self = this.set("concurrentViewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentViewers: Self = this.set("concurrentViewers", js.undefined)
    @scala.inline
    def setTotalChatCount(value: String): Self = this.set("totalChatCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalChatCount: Self = this.set("totalChatCount", js.undefined)
  }
  
}

