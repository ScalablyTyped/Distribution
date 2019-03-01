package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanPurchaseUploadAllowance extends js.Object {
  var canPurchaseUploadAllowance: scala.Boolean
  var currentTime: scala.Double
  var premium: scala.Boolean
  var premiumCancellationPending: scala.Boolean
  var premiumExpirationDate: js.UndefOr[scala.Double] = js.undefined
  var premiumExtendable: scala.Boolean
  var premiumPending: scala.Boolean
  var premiumRecurring: scala.Boolean
  var premiumUpgradable: js.UndefOr[scala.Boolean] = js.undefined
  var sponsoredGroupName: js.UndefOr[java.lang.String] = js.undefined
  var sponsoredGroupRole: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole] = js.undefined
}

object Anon_CanPurchaseUploadAllowance {
  @scala.inline
  def apply(
    canPurchaseUploadAllowance: scala.Boolean,
    currentTime: scala.Double,
    premium: scala.Boolean,
    premiumCancellationPending: scala.Boolean,
    premiumExtendable: scala.Boolean,
    premiumPending: scala.Boolean,
    premiumRecurring: scala.Boolean,
    premiumExpirationDate: scala.Int | scala.Double = null,
    premiumUpgradable: js.UndefOr[scala.Boolean] = js.undefined,
    sponsoredGroupName: java.lang.String = null,
    sponsoredGroupRole: evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole = null
  ): Anon_CanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canPurchaseUploadAllowance")(canPurchaseUploadAllowance)
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("premium")(premium)
    __obj.updateDynamic("premiumCancellationPending")(premiumCancellationPending)
    __obj.updateDynamic("premiumExtendable")(premiumExtendable)
    __obj.updateDynamic("premiumPending")(premiumPending)
    __obj.updateDynamic("premiumRecurring")(premiumRecurring)
    if (premiumExpirationDate != null) __obj.updateDynamic("premiumExpirationDate")(premiumExpirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumUpgradable)) __obj.updateDynamic("premiumUpgradable")(premiumUpgradable)
    if (sponsoredGroupName != null) __obj.updateDynamic("sponsoredGroupName")(sponsoredGroupName)
    if (sponsoredGroupRole != null) __obj.updateDynamic("sponsoredGroupRole")(sponsoredGroupRole)
    __obj.asInstanceOf[Anon_CanPurchaseUploadAllowance]
  }
}

