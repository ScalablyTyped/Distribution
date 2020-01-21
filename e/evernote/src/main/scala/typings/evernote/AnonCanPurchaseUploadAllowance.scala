package typings.evernote

import typings.evernote.mod.Evernote.SponsoredGroupRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanPurchaseUploadAllowance extends js.Object {
  var canPurchaseUploadAllowance: Boolean
  var currentTime: Double
  var premium: Boolean
  var premiumCancellationPending: Boolean
  var premiumExpirationDate: js.UndefOr[Double] = js.undefined
  var premiumExtendable: Boolean
  var premiumPending: Boolean
  var premiumRecurring: Boolean
  var premiumUpgradable: js.UndefOr[Boolean] = js.undefined
  var sponsoredGroupName: js.UndefOr[String] = js.undefined
  var sponsoredGroupRole: js.UndefOr[SponsoredGroupRole] = js.undefined
}

object AnonCanPurchaseUploadAllowance {
  @scala.inline
  def apply(
    canPurchaseUploadAllowance: Boolean,
    currentTime: Double,
    premium: Boolean,
    premiumCancellationPending: Boolean,
    premiumExtendable: Boolean,
    premiumPending: Boolean,
    premiumRecurring: Boolean,
    premiumExpirationDate: Int | Double = null,
    premiumUpgradable: js.UndefOr[Boolean] = js.undefined,
    sponsoredGroupName: String = null,
    sponsoredGroupRole: SponsoredGroupRole = null
  ): AnonCanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal(canPurchaseUploadAllowance = canPurchaseUploadAllowance.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], premium = premium.asInstanceOf[js.Any], premiumCancellationPending = premiumCancellationPending.asInstanceOf[js.Any], premiumExtendable = premiumExtendable.asInstanceOf[js.Any], premiumPending = premiumPending.asInstanceOf[js.Any], premiumRecurring = premiumRecurring.asInstanceOf[js.Any])
    if (premiumExpirationDate != null) __obj.updateDynamic("premiumExpirationDate")(premiumExpirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumUpgradable)) __obj.updateDynamic("premiumUpgradable")(premiumUpgradable.asInstanceOf[js.Any])
    if (sponsoredGroupName != null) __obj.updateDynamic("sponsoredGroupName")(sponsoredGroupName.asInstanceOf[js.Any])
    if (sponsoredGroupRole != null) __obj.updateDynamic("sponsoredGroupRole")(sponsoredGroupRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanPurchaseUploadAllowance]
  }
}

