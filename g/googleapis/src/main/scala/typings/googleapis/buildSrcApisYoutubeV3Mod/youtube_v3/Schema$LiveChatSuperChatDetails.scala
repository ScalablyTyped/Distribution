package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatSuperChatDetails extends js.Object {
  /**
    * A rendered string that displays the fund amount and currency to the user.
    */
  var amountDisplayString: js.UndefOr[String] = js.native
  /**
    * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
    */
  var amountMicros: js.UndefOr[String] = js.native
  /**
    * The currency in which the purchase was made.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The tier in which the amount belongs. Lower amounts belong to lower
    * tiers. The lowest tier is 1.
    */
  var tier: js.UndefOr[Double] = js.native
  /**
    * The comment added by the user to this Super Chat event.
    */
  var userComment: js.UndefOr[String] = js.native
}

object Schema$LiveChatSuperChatDetails {
  @scala.inline
  def apply(
    amountDisplayString: String = null,
    amountMicros: String = null,
    currency: String = null,
    tier: Int | Double = null,
    userComment: String = null
  ): Schema$LiveChatSuperChatDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString.asInstanceOf[js.Any])
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (userComment != null) __obj.updateDynamic("userComment")(userComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatSuperChatDetails]
  }
}

