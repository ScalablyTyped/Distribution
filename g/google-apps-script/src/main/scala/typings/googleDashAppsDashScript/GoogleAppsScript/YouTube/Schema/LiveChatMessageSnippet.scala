package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

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
    if (authorChannelId != null) __obj.updateDynamic("authorChannelId")(authorChannelId.asInstanceOf[js.Any])
    if (displayMessage != null) __obj.updateDynamic("displayMessage")(displayMessage.asInstanceOf[js.Any])
    if (fanFundingEventDetails != null) __obj.updateDynamic("fanFundingEventDetails")(fanFundingEventDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDisplayContent)) __obj.updateDynamic("hasDisplayContent")(hasDisplayContent.asInstanceOf[js.Any])
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (messageDeletedDetails != null) __obj.updateDynamic("messageDeletedDetails")(messageDeletedDetails.asInstanceOf[js.Any])
    if (messageRetractedDetails != null) __obj.updateDynamic("messageRetractedDetails")(messageRetractedDetails.asInstanceOf[js.Any])
    if (pollClosedDetails != null) __obj.updateDynamic("pollClosedDetails")(pollClosedDetails.asInstanceOf[js.Any])
    if (pollEditedDetails != null) __obj.updateDynamic("pollEditedDetails")(pollEditedDetails.asInstanceOf[js.Any])
    if (pollOpenedDetails != null) __obj.updateDynamic("pollOpenedDetails")(pollOpenedDetails.asInstanceOf[js.Any])
    if (pollVotedDetails != null) __obj.updateDynamic("pollVotedDetails")(pollVotedDetails.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (superChatDetails != null) __obj.updateDynamic("superChatDetails")(superChatDetails.asInstanceOf[js.Any])
    if (superStickerDetails != null) __obj.updateDynamic("superStickerDetails")(superStickerDetails.asInstanceOf[js.Any])
    if (textMessageDetails != null) __obj.updateDynamic("textMessageDetails")(textMessageDetails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userBannedDetails != null) __obj.updateDynamic("userBannedDetails")(userBannedDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
}

