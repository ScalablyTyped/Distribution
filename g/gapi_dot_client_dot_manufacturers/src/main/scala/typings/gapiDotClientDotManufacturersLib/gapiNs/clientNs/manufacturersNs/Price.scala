package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** The numeric value of the price. */
  var amount: js.UndefOr[java.lang.String] = js.undefined
  /** The currency in which the price is denoted. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
}

object Price {
  @scala.inline
  def apply(amount: java.lang.String = null, currency: java.lang.String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    __obj.asInstanceOf[Price]
  }
}

