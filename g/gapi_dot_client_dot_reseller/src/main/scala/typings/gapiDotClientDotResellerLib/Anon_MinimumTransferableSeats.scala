package typings
package gapiDotClientDotResellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumTransferableSeats extends js.Object {
  /**
    * When inserting a subscription, this is the minimum number of seats listed in the transfer order for this product. For example, if the customer has 20
    * users, the reseller cannot place a transfer order of 15 seats. The minimum is 20 seats.
    */
  var minimumTransferableSeats: js.UndefOr[scala.Double] = js.undefined
  /** The time when transfer token or intent to transfer will expire. The time is in milliseconds using UNIX Epoch format. */
  var transferabilityExpirationTime: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MinimumTransferableSeats {
  @scala.inline
  def apply(
    minimumTransferableSeats: scala.Int | scala.Double = null,
    transferabilityExpirationTime: java.lang.String = null
  ): Anon_MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    if (minimumTransferableSeats != null) __obj.updateDynamic("minimumTransferableSeats")(minimumTransferableSeats.asInstanceOf[js.Any])
    if (transferabilityExpirationTime != null) __obj.updateDynamic("transferabilityExpirationTime")(transferabilityExpirationTime)
    __obj.asInstanceOf[Anon_MinimumTransferableSeats]
  }
}

