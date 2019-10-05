package typings.evernote

import typings.evernote.evernoteMod.Evernote.SponsoredGroupRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanPurchaseUploadAllowance extends js.Object {
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

object Anon_CanPurchaseUploadAllowance {
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
  ): Anon_CanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal(canPurchaseUploadAllowance = canPurchaseUploadAllowance, currentTime = currentTime, premium = premium, premiumCancellationPending = premiumCancellationPending, premiumExtendable = premiumExtendable, premiumPending = premiumPending, premiumRecurring = premiumRecurring)
    if (premiumExpirationDate != null) __obj.updateDynamic("premiumExpirationDate")(premiumExpirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumUpgradable)) __obj.updateDynamic("premiumUpgradable")(premiumUpgradable)
    if (sponsoredGroupName != null) __obj.updateDynamic("sponsoredGroupName")(sponsoredGroupName)
    if (sponsoredGroupRole != null) __obj.updateDynamic("sponsoredGroupRole")(sponsoredGroupRole)
    __obj.asInstanceOf[Anon_CanPurchaseUploadAllowance]
  }
}

