package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsAccount extends js.Object {
  /** True if auto-tagging is enabled on the AdWords account. Read-only after the insert operation. */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Customer ID. This field is required when creating an AdWords link. */
  var customerId: js.UndefOr[String] = js.undefined
  /** Resource type for AdWords account. */
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
    if (!js.isUndefined(autoTaggingEnabled)) __obj.updateDynamic("autoTaggingEnabled")(autoTaggingEnabled.get.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdWordsAccount]
  }
}

