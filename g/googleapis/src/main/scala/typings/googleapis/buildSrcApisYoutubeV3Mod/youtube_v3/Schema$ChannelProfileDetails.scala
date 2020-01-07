package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ChannelProfileDetails extends js.Object {
  /**
    * The YouTube channel ID.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The channel&#39;s URL.
    */
  var channelUrl: js.UndefOr[String] = js.native
  /**
    * The channel&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The channels&#39;s avatar URL.
    */
  var profileImageUrl: js.UndefOr[String] = js.native
}

object Schema$ChannelProfileDetails {
  @scala.inline
  def apply(
    channelId: String = null,
    channelUrl: String = null,
    displayName: String = null,
    profileImageUrl: String = null
  ): Schema$ChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelUrl != null) __obj.updateDynamic("channelUrl")(channelUrl.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (profileImageUrl != null) __obj.updateDynamic("profileImageUrl")(profileImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelProfileDetails]
  }
}

