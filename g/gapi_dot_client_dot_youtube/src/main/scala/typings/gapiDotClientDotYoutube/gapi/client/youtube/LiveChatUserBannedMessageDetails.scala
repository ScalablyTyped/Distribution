package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatUserBannedMessageDetails extends js.Object {
  /** The duration of the ban. This property is only present if the banType is temporary. */
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  /** The type of ban. */
  var banType: js.UndefOr[String] = js.undefined
  /** The details of the user that was banned. */
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
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds)
    if (banType != null) __obj.updateDynamic("banType")(banType)
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails)
    __obj.asInstanceOf[LiveChatUserBannedMessageDetails]
  }
}

