package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollClosedDetails extends js.Object {
  var pollId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatPollClosedDetails {
  @scala.inline
  def apply(pollId: java.lang.String = null): LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    if (pollId != null) __obj.updateDynamic("pollId")(pollId)
    __obj.asInstanceOf[LiveChatPollClosedDetails]
  }
}

