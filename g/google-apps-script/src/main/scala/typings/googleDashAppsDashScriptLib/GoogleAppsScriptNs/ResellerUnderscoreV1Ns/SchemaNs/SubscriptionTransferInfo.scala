package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionTransferInfo extends js.Object {
  var minimumTransferableSeats: js.UndefOr[scala.Double] = js.undefined
  var transferabilityExpirationTime: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionTransferInfo {
  @scala.inline
  def apply(
    minimumTransferableSeats: scala.Int | scala.Double = null,
    transferabilityExpirationTime: java.lang.String = null
  ): SubscriptionTransferInfo = {
    val __obj = js.Dynamic.literal()
    if (minimumTransferableSeats != null) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime)
    __obj.asInstanceOf[SubscriptionTransferInfo]
  }
}

