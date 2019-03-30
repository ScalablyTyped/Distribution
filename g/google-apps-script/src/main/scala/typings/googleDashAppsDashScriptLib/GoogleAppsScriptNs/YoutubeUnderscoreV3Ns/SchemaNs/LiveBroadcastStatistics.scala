package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatistics extends js.Object {
  var concurrentViewers: js.UndefOr[java.lang.String] = js.undefined
  var totalChatCount: js.UndefOr[java.lang.String] = js.undefined
}

object LiveBroadcastStatistics {
  @scala.inline
  def apply(concurrentViewers: java.lang.String = null, totalChatCount: java.lang.String = null): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    if (concurrentViewers != null) __obj.updateDynamic("concurrentViewers")(concurrentViewers)
    if (totalChatCount != null) __obj.updateDynamic("totalChatCount")(totalChatCount)
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
}

