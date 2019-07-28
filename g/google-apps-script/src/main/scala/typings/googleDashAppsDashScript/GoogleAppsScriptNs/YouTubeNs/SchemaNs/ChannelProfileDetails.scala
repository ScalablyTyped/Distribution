package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelProfileDetails extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelUrl: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
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
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelUrl != null) __obj.updateDynamic("channelUrl")(channelUrl)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (profileImageUrl != null) __obj.updateDynamic("profileImageUrl")(profileImageUrl)
    __obj.asInstanceOf[ChannelProfileDetails]
  }
}

