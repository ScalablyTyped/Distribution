package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsAccount extends js.Object {
  /** True if auto-tagging is enabled on the AdWords account. Read-only after the insert operation. */
  var autoTaggingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Customer ID. This field is required when creating an AdWords link. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for AdWords account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AdWordsAccount {
  @scala.inline
  def apply(
    autoTaggingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    customerId: java.lang.String = null,
    kind: java.lang.String = null
  ): AdWordsAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoTaggingEnabled)) __obj.updateDynamic("autoTaggingEnabled")(autoTaggingEnabled)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdWordsAccount]
  }
}

