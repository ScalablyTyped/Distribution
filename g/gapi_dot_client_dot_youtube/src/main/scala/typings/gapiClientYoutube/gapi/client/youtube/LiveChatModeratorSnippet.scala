package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorSnippet extends js.Object {
  /** The ID of the live chat this moderator can act on. */
  var liveChatId: js.UndefOr[String] = js.undefined
  /** Details about the moderator. */
  var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object LiveChatModeratorSnippet {
  @scala.inline
  def apply(liveChatId: String = null, moderatorDetails: ChannelProfileDetails = null): LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (moderatorDetails != null) __obj.updateDynamic("moderatorDetails")(moderatorDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatModeratorSnippet]
  }
}

