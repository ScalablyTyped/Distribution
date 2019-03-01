package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEventSnippet extends js.Object {
  /** The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000. */
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  /** Channel id where the event occurred. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The text contents of the comment left by the user. */
  var commentText: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the event occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var createdAt: js.UndefOr[java.lang.String] = js.undefined
  /** The currency in which the purchase was made. ISO 4217. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** A rendered string that displays the purchase amount and currency (e.g., "$1.00"). The string is rendered for the given language. */
  var displayString: js.UndefOr[java.lang.String] = js.undefined
  /** The tier for the paid message, which is based on the amount of money spent to purchase the message. */
  var messageType: js.UndefOr[scala.Double] = js.undefined
  /** Details about the supporter. */
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object SuperChatEventSnippet {
  @scala.inline
  def apply(
    amountMicros: java.lang.String = null,
    channelId: java.lang.String = null,
    commentText: java.lang.String = null,
    createdAt: java.lang.String = null,
    currency: java.lang.String = null,
    displayString: java.lang.String = null,
    messageType: scala.Int | scala.Double = null,
    supporterDetails: ChannelProfileDetails = null
  ): SuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (commentText != null) __obj.updateDynamic("commentText")(commentText)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (displayString != null) __obj.updateDynamic("displayString")(displayString)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (supporterDetails != null) __obj.updateDynamic("supporterDetails")(supporterDetails)
    __obj.asInstanceOf[SuperChatEventSnippet]
  }
}

