package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelProfileDetails extends js.Object {
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The channel's URL. */
  var channelUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The channel's display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelProfileDetails {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelUrl: java.lang.String = null,
    displayName: java.lang.String = null,
    profileImageUrl: java.lang.String = null
  ): ChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelUrl != null) __obj.updateDynamic("channelUrl")(channelUrl)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (profileImageUrl != null) __obj.updateDynamic("profileImageUrl")(profileImageUrl)
    __obj.asInstanceOf[ChannelProfileDetails]
  }
}

