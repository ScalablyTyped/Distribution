package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatUserBannedMessageDetails extends js.Object {
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  var banType: js.UndefOr[String] = js.undefined
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object LiveChatUserBannedMessageDetails {
  @scala.inline
  def apply(
    banDurationSeconds: String = null,
    banType: String = null,
    bannedUserDetails: ChannelProfileDetails = null
  ): LiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds.asInstanceOf[js.Any])
    if (banType != null) __obj.updateDynamic("banType")(banType.asInstanceOf[js.Any])
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatUserBannedMessageDetails]
  }
}

