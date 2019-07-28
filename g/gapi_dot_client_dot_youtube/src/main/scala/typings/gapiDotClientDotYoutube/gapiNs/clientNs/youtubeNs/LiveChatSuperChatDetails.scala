package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperChatDetails extends js.Object {
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[String] = js.undefined
  /** The amount purchased by the user, in micros (1,750,000 micros = 1.75). */
  var amountMicros: js.UndefOr[String] = js.undefined
  /** The currency in which the purchase was made. */
  var currency: js.UndefOr[String] = js.undefined
  /** The tier in which the amount belongs to. Lower amounts belong to lower tiers. Starts at 1. */
  var tier: js.UndefOr[Double] = js.undefined
  /** The comment added by the user to this Super Chat event. */
  var userComment: js.UndefOr[String] = js.undefined
}

object LiveChatSuperChatDetails {
  @scala.inline
  def apply(
    amountDisplayString: String = null,
    amountMicros: String = null,
    currency: String = null,
    tier: Int | Double = null,
    userComment: String = null
  ): LiveChatSuperChatDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString)
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (userComment != null) __obj.updateDynamic("userComment")(userComment)
    __obj.asInstanceOf[LiveChatSuperChatDetails]
  }
}

