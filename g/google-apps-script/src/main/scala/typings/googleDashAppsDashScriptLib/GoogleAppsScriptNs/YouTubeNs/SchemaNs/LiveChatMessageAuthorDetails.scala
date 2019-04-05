package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageAuthorDetails extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelUrl: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var isChatModerator: js.UndefOr[scala.Boolean] = js.undefined
  var isChatOwner: js.UndefOr[scala.Boolean] = js.undefined
  var isChatSponsor: js.UndefOr[scala.Boolean] = js.undefined
  var isVerified: js.UndefOr[scala.Boolean] = js.undefined
  var profileImageUrl: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatMessageAuthorDetails {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelUrl: java.lang.String = null,
    displayName: java.lang.String = null,
    isChatModerator: js.UndefOr[scala.Boolean] = js.undefined,
    isChatOwner: js.UndefOr[scala.Boolean] = js.undefined,
    isChatSponsor: js.UndefOr[scala.Boolean] = js.undefined,
    isVerified: js.UndefOr[scala.Boolean] = js.undefined,
    profileImageUrl: java.lang.String = null
  ): LiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelUrl != null) __obj.updateDynamic("channelUrl")(channelUrl)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(isChatModerator)) __obj.updateDynamic("isChatModerator")(isChatModerator)
    if (!js.isUndefined(isChatOwner)) __obj.updateDynamic("isChatOwner")(isChatOwner)
    if (!js.isUndefined(isChatSponsor)) __obj.updateDynamic("isChatSponsor")(isChatSponsor)
    if (!js.isUndefined(isVerified)) __obj.updateDynamic("isVerified")(isVerified)
    if (profileImageUrl != null) __obj.updateDynamic("profileImageUrl")(profileImageUrl)
    __obj.asInstanceOf[LiveChatMessageAuthorDetails]
  }
}

