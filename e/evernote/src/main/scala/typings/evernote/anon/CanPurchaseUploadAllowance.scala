package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanPurchaseUploadAllowance extends js.Object {
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

object CanPurchaseUploadAllowance {
  @scala.inline
  def apply(
    canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.undefined,
    currentTime: js.UndefOr[Timestamp] = js.undefined,
    premium: js.UndefOr[Boolean] = js.undefined,
    premiumCancellationPending: js.UndefOr[Boolean] = js.undefined,
    premiumExpirationDate: js.UndefOr[Timestamp] = js.undefined,
    premiumExtendable: js.UndefOr[Boolean] = js.undefined,
    premiumPending: js.UndefOr[Boolean] = js.undefined,
    premiumRecurring: js.UndefOr[Boolean] = js.undefined,
    premiumUpgradable: js.UndefOr[Boolean] = js.undefined
  ): CanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canPurchaseUploadAllowance)) __obj.updateDynamic("canPurchaseUploadAllowance")(canPurchaseUploadAllowance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premium)) __obj.updateDynamic("premium")(premium.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumCancellationPending)) __obj.updateDynamic("premiumCancellationPending")(premiumCancellationPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumExpirationDate)) __obj.updateDynamic("premiumExpirationDate")(premiumExpirationDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumExtendable)) __obj.updateDynamic("premiumExtendable")(premiumExtendable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumPending)) __obj.updateDynamic("premiumPending")(premiumPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumRecurring)) __obj.updateDynamic("premiumRecurring")(premiumRecurring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumUpgradable)) __obj.updateDynamic("premiumUpgradable")(premiumUpgradable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPurchaseUploadAllowance]
  }
}

