package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

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
  var authorChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE
               * and CHAT_ENDED_EVENT are silent.
               */
  var displayMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Details about the funding event, this is only set if the type is 'fanFundingEvent'. */
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
  /** Whether the message has display content that should be displayed to users. */
  var hasDisplayContent: js.UndefOr[scala.Boolean] = js.undefined
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
  var pollClosedDetails: js.UndefOr[LiveChatPollClosedDetails] = js.undefined
  var pollEditedDetails: js.UndefOr[LiveChatPollEditedDetails] = js.undefined
  var pollOpenedDetails: js.UndefOr[LiveChatPollOpenedDetails] = js.undefined
  var pollVotedDetails: js.UndefOr[LiveChatPollVotedDetails] = js.undefined
  /** The date and time when the message was orignally published. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** Details about the Super Chat event, this is only set if the type is 'superChatEvent'. */
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.undefined
  /** Details about the text message, this is only set if the type is 'textMessageEvent'. */
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.undefined
  /** The type of message, this will always be present, it determines the contents of the message as well as which fields will be present. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.undefined
}

