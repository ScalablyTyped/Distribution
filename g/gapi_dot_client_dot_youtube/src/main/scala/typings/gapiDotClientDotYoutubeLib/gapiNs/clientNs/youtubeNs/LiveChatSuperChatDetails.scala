package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperChatDetails extends js.Object {
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[java.lang.String] = js.undefined
  /** The amount purchased by the user, in micros (1,750,000 micros = 1.75). */
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  /** The currency in which the purchase was made. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The tier in which the amount belongs to. Lower amounts belong to lower tiers. Starts at 1. */
  var tier: js.UndefOr[scala.Double] = js.undefined
  /** The comment added by the user to this Super Chat event. */
  var userComment: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatSuperChatDetails {
  @scala.inline
  def apply(
    amountDisplayString: java.lang.String = null,
    amountMicros: java.lang.String = null,
    currency: java.lang.String = null,
    tier: scala.Int | scala.Double = null,
    userComment: java.lang.String = null
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

