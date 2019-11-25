package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelProfileDetails extends js.Object {
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The channel's URL. */
  var channelUrl: js.UndefOr[String] = js.undefined
  /** The channel's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[String] = js.undefined
}

object ChannelProfileDetails {
  @scala.inline
  def apply(
    channelId: String = null,
    channelUrl: String = null,
    displayName: String = null,
    profileImageUrl: String = null
  ): ChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelUrl != null) __obj.updateDynamic("channelUrl")(channelUrl.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (profileImageUrl != null) __obj.updateDynamic("profileImageUrl")(profileImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelProfileDetails]
  }
}

