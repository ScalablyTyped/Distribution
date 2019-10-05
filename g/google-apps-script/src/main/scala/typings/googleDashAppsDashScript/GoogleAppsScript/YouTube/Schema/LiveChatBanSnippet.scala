package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBanSnippet extends js.Object {
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  var liveChatId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LiveChatBanSnippet {
  @scala.inline
  def apply(
    banDurationSeconds: String = null,
    bannedUserDetails: ChannelProfileDetails = null,
    liveChatId: String = null,
    `type`: String = null
  ): LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds)
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails)
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiveChatBanSnippet]
  }
}

