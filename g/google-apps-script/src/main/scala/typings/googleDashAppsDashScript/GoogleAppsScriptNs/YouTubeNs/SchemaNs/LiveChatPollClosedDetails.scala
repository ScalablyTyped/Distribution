package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollClosedDetails extends js.Object {
  var pollId: js.UndefOr[String] = js.undefined
}

object LiveChatPollClosedDetails {
  @scala.inline
  def apply(pollId: String = null): LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    if (pollId != null) __obj.updateDynamic("pollId")(pollId)
    __obj.asInstanceOf[LiveChatPollClosedDetails]
  }
}

