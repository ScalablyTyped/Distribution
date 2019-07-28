package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageSnippet extends js.Object {
  var authorChannelId: js.UndefOr[String] = js.undefined
  var displayMessage: js.UndefOr[String] = js.undefined
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
  var hasDisplayContent: js.UndefOr[Boolean] = js.undefined
  var liveChatId: js.UndefOr[String] = js.undefined
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
  var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.undefined
  var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.undefined
  var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.undefined
  var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.undefined
  var superStickerDetails: js.UndefOr[LiveChatSuperStickerDetails] = js.undefined
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.undefined
}

object LiveChatMessageSnippet {
  @scala.inline
  def apply(
    authorChannelId: String = null,
    displayMessage: String = null,
    fanFundingEventDetails: LiveChatFanFundingEventDetails = null,
    hasDisplayContent: js.UndefOr[Boolean] = js.undefined,
    liveChatId: String = null,
    messageDeletedDetails: LiveChatMessageDeletedDetails = null,
    messageRetractedDetails: LiveChatMessageRetractedDetails = null,
    pollClosedDetails: LiveChatPollClosedDetails = null,
    pollEditedDetails: LiveChatPollEditedDetails = null,
    pollOpenedDetails: LiveChatPollOpenedDetails = null,
    pollVotedDetails: LiveChatPollVotedDetails = null,
    publishedAt: String = null,
    superChatDetails: LiveChatSuperChatDetails = null,
    superStickerDetails: LiveChatSuperStickerDetails = null,
    textMessageDetails: LiveChatTextMessageDetails = null,
    `type`: String = null,
    userBannedDetails: LiveChatUserBannedMessageDetails = null
  ): LiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    if (authorChannelId != null) __obj.updateDynamic("authorChannelId")(authorChannelId)
    if (displayMessage != null) __obj.updateDynamic("displayMessage")(displayMessage)
    if (fanFundingEventDetails != null) __obj.updateDynamic("fanFundingEventDetails")(fanFundingEventDetails)
    if (!js.isUndefined(hasDisplayContent)) __obj.updateDynamic("hasDisplayContent")(hasDisplayContent)
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId)
    if (messageDeletedDetails != null) __obj.updateDynamic("messageDeletedDetails")(messageDeletedDetails)
    if (messageRetractedDetails != null) __obj.updateDynamic("messageRetractedDetails")(messageRetractedDetails)
    if (pollClosedDetails != null) __obj.updateDynamic("pollClosedDetails")(pollClosedDetails)
    if (pollEditedDetails != null) __obj.updateDynamic("pollEditedDetails")(pollEditedDetails)
    if (pollOpenedDetails != null) __obj.updateDynamic("pollOpenedDetails")(pollOpenedDetails)
    if (pollVotedDetails != null) __obj.updateDynamic("pollVotedDetails")(pollVotedDetails)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (superChatDetails != null) __obj.updateDynamic("superChatDetails")(superChatDetails)
    if (superStickerDetails != null) __obj.updateDynamic("superStickerDetails")(superStickerDetails)
    if (textMessageDetails != null) __obj.updateDynamic("textMessageDetails")(textMessageDetails)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userBannedDetails != null) __obj.updateDynamic("userBannedDetails")(userBannedDetails)
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
}

