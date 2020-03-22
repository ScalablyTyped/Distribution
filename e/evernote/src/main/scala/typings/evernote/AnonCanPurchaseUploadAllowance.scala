package typings.evernote

import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanPurchaseUploadAllowance extends js.Object {
  var canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.undefined
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var premium: js.UndefOr[Boolean] = js.undefined
  var premiumCancellationPending: js.UndefOr[Boolean] = js.undefined
  var premiumExpirationDate: js.UndefOr[Timestamp] = js.undefined
  var premiumExtendable: js.UndefOr[Boolean] = js.undefined
  var premiumPending: js.UndefOr[Boolean] = js.undefined
  var premiumRecurring: js.UndefOr[Boolean] = js.undefined
  var premiumUpgradable: js.UndefOr[Boolean] = js.undefined
}

object AnonCanPurchaseUploadAllowance {
  @scala.inline
  def apply(
    canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.undefined,
    currentTime: Int | Double = null,
    premium: js.UndefOr[Boolean] = js.undefined,
    premiumCancellationPending: js.UndefOr[Boolean] = js.undefined,
    premiumExpirationDate: Int | Double = null,
    premiumExtendable: js.UndefOr[Boolean] = js.undefined,
    premiumPending: js.UndefOr[Boolean] = js.undefined,
    premiumRecurring: js.UndefOr[Boolean] = js.undefined,
    premiumUpgradable: js.UndefOr[Boolean] = js.undefined
  ): AnonCanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canPurchaseUploadAllowance)) __obj.updateDynamic("canPurchaseUploadAllowance")(canPurchaseUploadAllowance.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(premium)) __obj.updateDynamic("premium")(premium.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumCancellationPending)) __obj.updateDynamic("premiumCancellationPending")(premiumCancellationPending.asInstanceOf[js.Any])
    if (premiumExpirationDate != null) __obj.updateDynamic("premiumExpirationDate")(premiumExpirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumExtendable)) __obj.updateDynamic("premiumExtendable")(premiumExtendable.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumPending)) __obj.updateDynamic("premiumPending")(premiumPending.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumRecurring)) __obj.updateDynamic("premiumRecurring")(premiumRecurring.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumUpgradable)) __obj.updateDynamic("premiumUpgradable")(premiumUpgradable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanPurchaseUploadAllowance]
  }
}

