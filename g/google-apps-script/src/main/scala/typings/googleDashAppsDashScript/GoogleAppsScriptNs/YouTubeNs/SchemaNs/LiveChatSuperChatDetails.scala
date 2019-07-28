package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperChatDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.undefined
  var amountMicros: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var tier: js.UndefOr[Double] = js.undefined
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

