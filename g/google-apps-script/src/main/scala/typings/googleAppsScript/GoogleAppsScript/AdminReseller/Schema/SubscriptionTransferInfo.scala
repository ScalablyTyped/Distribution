package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionTransferInfo extends js.Object {
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}

object SubscriptionTransferInfo {
  @scala.inline
  def apply(minimumTransferableSeats: Int | Double = null, transferabilityExpirationTime: String = null): SubscriptionTransferInfo = {
    val __obj = js.Dynamic.literal()
    if (minimumTransferableSeats != null) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTransferInfo]
  }
}

