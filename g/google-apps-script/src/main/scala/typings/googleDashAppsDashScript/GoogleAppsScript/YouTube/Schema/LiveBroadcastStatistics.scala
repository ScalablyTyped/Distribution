package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatistics extends js.Object {
  var concurrentViewers: js.UndefOr[String] = js.undefined
  var totalChatCount: js.UndefOr[String] = js.undefined
}

object LiveBroadcastStatistics {
  @scala.inline
  def apply(concurrentViewers: String = null, totalChatCount: String = null): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    if (concurrentViewers != null) __obj.updateDynamic("concurrentViewers")(concurrentViewers.asInstanceOf[js.Any])
    if (totalChatCount != null) __obj.updateDynamic("totalChatCount")(totalChatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
}

