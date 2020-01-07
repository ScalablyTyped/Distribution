package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatMessageSnippet extends js.Object {
  /**
    * The ID of the user that authored this message, this field is not always
    * filled. textMessageEvent - the user that wrote the message
    * fanFundingEvent - the user that funded the broadcast newSponsorEvent -
    * the user that just became a sponsor messageDeletedEvent - the moderator
    * that took the action messageRetractedEvent - the author that retracted
    * their message userBannedEvent - the moderator that took the action
    * superChatEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.native
  /**
    * Contains a string that can be displayed to the user. If this field is not
    * present the message is silent, at the moment only messages of type
    * TOMBSTONE and CHAT_ENDED_EVENT are silent.
    */
  var displayMessage: js.UndefOr[String] = js.native
  /**
    * Details about the funding event, this is only set if the type is
    * &#39;fanFundingEvent&#39;.
    */
  var fanFundingEventDetails: js.UndefOr[Schema$LiveChatFanFundingEventDetails] = js.native
  /**
    * Whether the message has display content that should be displayed to
    * users.
    */
  var hasDisplayContent: js.UndefOr[Boolean] = js.native
  var liveChatId: js.UndefOr[String] = js.native
  var messageDeletedDetails: js.UndefOr[Schema$LiveChatMessageDeletedDetails] = js.native
  var messageRetractedDetails: js.UndefOr[Schema$LiveChatMessageRetractedDetails] = js.native
  var pollClosedDetails: js.UndefOr[Schema$LiveChatPollClosedDetails] = js.native
  var pollEditedDetails: js.UndefOr[Schema$LiveChatPollEditedDetails] = js.native
  var pollOpenedDetails: js.UndefOr[Schema$LiveChatPollOpenedDetails] = js.native
  var pollVotedDetails: js.UndefOr[Schema$LiveChatPollVotedDetails] = js.native
  /**
    * The date and time when the message was orignally published. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * Details about the Super Chat event, this is only set if the type is
    * &#39;superChatEvent&#39;.
    */
  var superChatDetails: js.UndefOr[Schema$LiveChatSuperChatDetails] = js.native
  /**
    * Details about the Super Sticker event, this is only set if the type is
    * &#39;superStickerEvent&#39;.
    */
  var superStickerDetails: js.UndefOr[Schema$LiveChatSuperStickerDetails] = js.native
  /**
    * Details about the text message, this is only set if the type is
    * &#39;textMessageEvent&#39;.
    */
  var textMessageDetails: js.UndefOr[Schema$LiveChatTextMessageDetails] = js.native
  /**
    * The type of message, this will always be present, it determines the
    * contents of the message as well as which fields will be present.
    */
  var `type`: js.UndefOr[String] = js.native
  var userBannedDetails: js.UndefOr[Schema$LiveChatUserBannedMessageDetails] = js.native
}

object Schema$LiveChatMessageSnippet {
  @scala.inline
  def apply(
    authorChannelId: String = null,
    displayMessage: String = null,
    fanFundingEventDetails: Schema$LiveChatFanFundingEventDetails = null,
    hasDisplayContent: js.UndefOr[Boolean] = js.undefined,
    liveChatId: String = null,
    messageDeletedDetails: Schema$LiveChatMessageDeletedDetails = null,
    messageRetractedDetails: Schema$LiveChatMessageRetractedDetails = null,
    pollClosedDetails: Schema$LiveChatPollClosedDetails = null,
    pollEditedDetails: Schema$LiveChatPollEditedDetails = null,
    pollOpenedDetails: Schema$LiveChatPollOpenedDetails = null,
    pollVotedDetails: Schema$LiveChatPollVotedDetails = null,
    publishedAt: String = null,
    superChatDetails: Schema$LiveChatSuperChatDetails = null,
    superStickerDetails: Schema$LiveChatSuperStickerDetails = null,
    textMessageDetails: Schema$LiveChatTextMessageDetails = null,
    `type`: String = null,
    userBannedDetails: Schema$LiveChatUserBannedMessageDetails = null
  ): Schema$LiveChatMessageSnippet = {
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
    __obj.asInstanceOf[Schema$LiveChatMessageSnippet]
  }
}

