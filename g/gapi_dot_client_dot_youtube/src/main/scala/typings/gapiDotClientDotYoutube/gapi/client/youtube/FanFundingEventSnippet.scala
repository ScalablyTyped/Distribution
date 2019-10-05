package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventSnippet extends js.Object {
  /** The amount of funding in micros of fund_currency. e.g., 1 is represented */
  var amountMicros: js.UndefOr[String] = js.undefined
  /** Channel id where the funding event occurred. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The text contents of the comment left by the user. */
  var commentText: js.UndefOr[String] = js.undefined
  /** The date and time when the funding occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var createdAt: js.UndefOr[String] = js.undefined
  /** The currency in which the fund was made. ISO 4217. */
  var currency: js.UndefOr[String] = js.undefined
  /** A rendered string that displays the fund amount and currency (e.g., "$1.00"). The string is rendered for the given language. */
  var displayString: js.UndefOr[String] = js.undefined
  /** Details about the supporter. Only filled if the event was made public by the user. */
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object FanFundingEventSnippet {
  @scala.inline
  def apply(
    amountMicros: String = null,
    channelId: String = null,
    commentText: String = null,
    createdAt: String = null,
    currency: String = null,
    displayString: String = null,
    supporterDetails: ChannelProfileDetails = null
  ): FanFundingEventSnippet = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (commentText != null) __obj.updateDynamic("commentText")(commentText)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (displayString != null) __obj.updateDynamic("displayString")(displayString)
    if (supporterDetails != null) __obj.updateDynamic("supporterDetails")(supporterDetails)
    __obj.asInstanceOf[FanFundingEventSnippet]
  }
}

