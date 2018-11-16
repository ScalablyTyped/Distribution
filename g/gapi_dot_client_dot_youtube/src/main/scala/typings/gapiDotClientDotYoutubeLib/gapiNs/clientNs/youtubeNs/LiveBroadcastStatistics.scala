package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LiveBroadcastStatistics extends js.Object {
  /**
               * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the
               * broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the
               * broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
               */
  var concurrentViewers: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live
               * chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not
               * identify the number of chat messages for an archived video of a completed live broadcast.
               */
  var totalChatCount: js.UndefOr[java.lang.String] = js.undefined
}

