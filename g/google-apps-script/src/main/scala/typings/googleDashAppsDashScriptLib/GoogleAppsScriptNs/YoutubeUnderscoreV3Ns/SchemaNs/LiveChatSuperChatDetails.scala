package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperChatDetails extends js.Object {
  var amountDisplayString: js.UndefOr[java.lang.String] = js.undefined
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var tier: js.UndefOr[scala.Double] = js.undefined
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

