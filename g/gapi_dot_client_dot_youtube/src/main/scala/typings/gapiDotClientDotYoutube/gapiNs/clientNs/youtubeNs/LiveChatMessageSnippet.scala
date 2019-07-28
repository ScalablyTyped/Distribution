package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageSnippet extends js.Object {
  /**
    * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent -
    * the user that funded the broadcast newSponsorEvent - the user that just became a sponsor messageDeletedEvent - the moderator that took the action
    * messageRetractedEvent - the author that retracted their message userBannedEvent - the moderator that took the action superChatEvent - the user that
    * made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.undefined
  /**
    * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE
    * and CHAT_ENDED_EVENT are silent.
    */
  var displayMessage: js.UndefOr[String] = js.undefined
  /** Details about the funding event, this is only set if the type is 'fanFundingEvent'. */
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
  /** Whether the message has display content that should be displayed to users. */
  var hasDisplayContent: js.UndefOr[Boolean] = js.undefined
  var liveChatId: js.UndefOr[String] = js.undefined
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
  var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.undefined
  var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.undefined
  var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.undefined
  var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.undefined
  /** The date and time when the message was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  /** Details about the Super Chat event, this is only set if the type is 'superChatEvent'. */
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.undefined
  /** Details about the text message, this is only set if the type is 'textMessageEvent'. */
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.undefined
  /** The type of message, this will always be present, it determines the contents of the message as well as which fields will be present. */
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
    if (textMessageDetails != null) __obj.updateDynamic("textMessageDetails")(textMessageDetails)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userBannedDetails != null) __obj.updateDynamic("userBannedDetails")(userBannedDetails)
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
}

