package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollVotedDetails extends js.Object {
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var pollId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatPollVotedDetails {
  @scala.inline
  def apply(itemId: java.lang.String = null, pollId: java.lang.String = null): LiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (pollId != null) __obj.updateDynamic("pollId")(pollId)
    __obj.asInstanceOf[LiveChatPollVotedDetails]
  }
}

