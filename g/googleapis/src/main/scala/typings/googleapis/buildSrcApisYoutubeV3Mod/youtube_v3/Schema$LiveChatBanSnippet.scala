package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatBanSnippet extends js.Object {
  /**
    * The duration of a ban, only filled if the ban has type TEMPORARY.
    */
  var banDurationSeconds: js.UndefOr[String] = js.native
  var bannedUserDetails: js.UndefOr[Schema$ChannelProfileDetails] = js.native
  /**
    * The chat this ban is pertinent to.
    */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * The type of ban.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$LiveChatBanSnippet {
  @scala.inline
  def apply(
    banDurationSeconds: String = null,
    bannedUserDetails: Schema$ChannelProfileDetails = null,
    liveChatId: String = null,
    `type`: String = null
  ): Schema$LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds.asInstanceOf[js.Any])
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails.asInstanceOf[js.Any])
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatBanSnippet]
  }
}

