package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderPaymentMethod extends js.Object {
  /** The card expiration month (January = 1, February = 2 etc.). */
  var expirationMonth: js.UndefOr[scala.Double] = js.undefined
  /** The card expiration year (4-digit, e.g. 2015). */
  var expirationYear: js.UndefOr[scala.Double] = js.undefined
  /** The last four digits of the card number. */
  var lastFourDigits: js.UndefOr[java.lang.String] = js.undefined
  /** The billing address. */
  var predefinedBillingAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The type of instrument. Note that real orders might have different values than the four values accepted by createTestOrder. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

