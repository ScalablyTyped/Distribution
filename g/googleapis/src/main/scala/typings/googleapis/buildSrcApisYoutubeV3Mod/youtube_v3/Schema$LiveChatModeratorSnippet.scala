package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatModeratorSnippet extends js.Object {
  /**
    * The ID of the live chat this moderator can act on.
    */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * Details about the moderator.
    */
  var moderatorDetails: js.UndefOr[Schema$ChannelProfileDetails] = js.native
}

object Schema$LiveChatModeratorSnippet {
  @scala.inline
  def apply(liveChatId: String = null, moderatorDetails: Schema$ChannelProfileDetails = null): Schema$LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (moderatorDetails != null) __obj.updateDynamic("moderatorDetails")(moderatorDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatModeratorSnippet]
  }
}

