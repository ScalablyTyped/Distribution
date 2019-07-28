package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageAuthorDetails extends js.Object {
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The channel's URL. */
  var channelUrl: js.UndefOr[String] = js.undefined
  /** The channel's display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Whether the author is a moderator of the live chat. */
  var isChatModerator: js.UndefOr[Boolean] = js.undefined
  /** Whether the author is the owner of the live chat. */
  var isChatOwner: js.UndefOr[Boolean] = js.undefined
  /** Whether the author is a sponsor of the live chat. */
  var isChatSponsor: js.UndefOr[Boolean] = js.undefined
  /** Whether the author's identity has been verified by YouTube. */
  var isVerified: js.UndefOr[Boolean] = js.undefined
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[String] = js.undefined
}

object LiveChatMessageAuthorDetails {
  @scala.inline
  def apply(
    channelId: String = null,
    channelUrl: String = null,
    displayName: String = null,
    isChatModerator: js.UndefOr[Boolean] = js.undefined,
    isChatOwner: js.UndefOr[Boolean] = js.undefined,
    isChatSponsor: js.UndefOr[Boolean] = js.undefined,
    isVerified: js.UndefOr[Boolean] = js.undefined,
    profileImageUrl: String = null
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

