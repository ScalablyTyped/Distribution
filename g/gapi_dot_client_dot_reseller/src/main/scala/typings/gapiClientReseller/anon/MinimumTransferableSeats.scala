package typings.gapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimumTransferableSeats extends js.Object {
  /**
    * When inserting a subscription, this is the minimum number of seats listed in the transfer order for this product. For example, if the customer has 20
    * users, the reseller cannot place a transfer order of 15 seats. The minimum is 20 seats.
    */
  var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
  /** The time when transfer token or intent to transfer will expire. The time is in milliseconds using UNIX Epoch format. */
  var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
}

object MinimumTransferableSeats {
  @scala.inline
  def apply(
    minimumTransferableSeats: js.UndefOr[Double] = js.undefined,
    transferabilityExpirationTime: String = null
  ): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimumTransferableSeats)) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.get.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
}

