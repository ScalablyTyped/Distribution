package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatFanFundingEventDetails extends js.Object {
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[String] = js.undefined
  /** The amount of the fund. */
  var amountMicros: js.UndefOr[String] = js.undefined
  /** The currency in which the fund was made. */
  var currency: js.UndefOr[String] = js.undefined
  /** The comment added by the user to this fan funding event. */
  var userComment: js.UndefOr[String] = js.undefined
}

object LiveChatFanFundingEventDetails {
  @scala.inline
  def apply(
    amountDisplayString: String = null,
    amountMicros: String = null,
    currency: String = null,
    userComment: String = null
  ): LiveChatFanFundingEventDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString)
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (userComment != null) __obj.updateDynamic("userComment")(userComment)
    __obj.asInstanceOf[LiveChatFanFundingEventDetails]
  }
}

