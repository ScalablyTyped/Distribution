package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatFanFundingEventDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.undefined
  var amountMicros: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
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

