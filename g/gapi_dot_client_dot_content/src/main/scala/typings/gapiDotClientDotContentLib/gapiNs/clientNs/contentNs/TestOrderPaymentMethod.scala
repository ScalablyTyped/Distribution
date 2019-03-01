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

object TestOrderPaymentMethod {
  @scala.inline
  def apply(
    expirationMonth: scala.Int | scala.Double = null,
    expirationYear: scala.Int | scala.Double = null,
    lastFourDigits: java.lang.String = null,
    predefinedBillingAddress: java.lang.String = null,
    `type`: java.lang.String = null
  ): TestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth.asInstanceOf[js.Any])
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits)
    if (predefinedBillingAddress != null) __obj.updateDynamic("predefinedBillingAddress")(predefinedBillingAddress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TestOrderPaymentMethod]
  }
}

