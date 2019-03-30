package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorSnippet extends js.Object {
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object LiveChatModeratorSnippet {
  @scala.inline
  def apply(liveChatId: java.lang.String = null, moderatorDetails: ChannelProfileDetails = null): LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId)
    if (moderatorDetails != null) __obj.updateDynamic("moderatorDetails")(moderatorDetails)
    __obj.asInstanceOf[LiveChatModeratorSnippet]
  }
}

