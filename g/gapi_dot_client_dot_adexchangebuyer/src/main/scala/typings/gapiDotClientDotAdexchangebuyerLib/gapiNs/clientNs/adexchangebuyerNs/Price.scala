package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** The price value in micros. */
  var amountMicros: js.UndefOr[scala.Double] = js.undefined
  /** The currency code for the price. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /** In case of CPD deals, the expected CPM in micros. */
  var expectedCpmMicros: js.UndefOr[scala.Double] = js.undefined
  /** The pricing type for the deal/product. */
  var pricingType: js.UndefOr[java.lang.String] = js.undefined
}

object Price {
  @scala.inline
  def apply(
    amountMicros: scala.Int | scala.Double = null,
    currencyCode: java.lang.String = null,
    expectedCpmMicros: scala.Int | scala.Double = null,
    pricingType: java.lang.String = null
  ): Price = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (expectedCpmMicros != null) __obj.updateDynamic("expectedCpmMicros")(expectedCpmMicros.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType)
    __obj.asInstanceOf[Price]
  }
}

