package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatFanFundingEventDetails extends js.Object {
  var amountDisplayString: js.UndefOr[java.lang.String] = js.undefined
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
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

