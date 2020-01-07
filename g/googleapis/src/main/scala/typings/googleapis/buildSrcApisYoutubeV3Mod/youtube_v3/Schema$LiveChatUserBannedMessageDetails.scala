package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatUserBannedMessageDetails extends js.Object {
  /**
    * The duration of the ban. This property is only present if the banType is
    * temporary.
    */
  var banDurationSeconds: js.UndefOr[String] = js.native
  /**
    * The type of ban.
    */
  var banType: js.UndefOr[String] = js.native
  /**
    * The details of the user that was banned.
    */
  var bannedUserDetails: js.UndefOr[Schema$ChannelProfileDetails] = js.native
}

object Schema$LiveChatUserBannedMessageDetails {
  @scala.inline
  def apply(
    banDurationSeconds: String = null,
    banType: String = null,
    bannedUserDetails: Schema$ChannelProfileDetails = null
  ): Schema$LiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds.asInstanceOf[js.Any])
    if (banType != null) __obj.updateDynamic("banType")(banType.asInstanceOf[js.Any])
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatUserBannedMessageDetails]
  }
}

