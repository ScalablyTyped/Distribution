package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsAccount extends js.Object {
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AdWordsAccount {
  @scala.inline
  def apply(
    autoTaggingEnabled: js.UndefOr[Boolean] = js.undefined,
    customerId: String = null,
    kind: String = null
  ): AdWordsAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoTaggingEnabled)) __obj.updateDynamic("autoTaggingEnabled")(autoTaggingEnabled)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdWordsAccount]
  }
}

