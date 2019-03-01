package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatFanFundingEventDetails extends js.Object {
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[java.lang.String] = js.undefined
  /** The amount of the fund. */
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  /** The currency in which the fund was made. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The comment added by the user to this fan funding event. */
  var userComment: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatFanFundingEventDetails {
  @scala.inline
  def apply(
    amountDisplayString: java.lang.String = null,
    amountMicros: java.lang.String = null,
    currency: java.lang.String = null,
    userComment: java.lang.String = null
  ): LiveChatFanFundingEventDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString)
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (userComment != null) __obj.updateDynamic("userComment")(userComment)
    __obj.asInstanceOf[LiveChatFanFundingEventDetails]
  }
}

