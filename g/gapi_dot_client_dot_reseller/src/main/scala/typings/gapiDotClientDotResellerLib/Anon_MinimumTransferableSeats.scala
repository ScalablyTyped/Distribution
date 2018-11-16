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

