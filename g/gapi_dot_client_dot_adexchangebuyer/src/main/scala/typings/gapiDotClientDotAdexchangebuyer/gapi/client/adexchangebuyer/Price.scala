package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** The price value in micros. */
  var amountMicros: js.UndefOr[Double] = js.undefined
  /** The currency code for the price. */
  var currencyCode: js.UndefOr[String] = js.undefined
  /** In case of CPD deals, the expected CPM in micros. */
  var expectedCpmMicros: js.UndefOr[Double] = js.undefined
  /** The pricing type for the deal/product. */
  var pricingType: js.UndefOr[String] = js.undefined
}

object Price {
  @scala.inline
  def apply(
    amountMicros: Int | Double = null,
    currencyCode: String = null,
    expectedCpmMicros: Int | Double = null,
    pricingType: String = null
  ): Price = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (expectedCpmMicros != null) __obj.updateDynamic("expectedCpmMicros")(expectedCpmMicros.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType)
    __obj.asInstanceOf[Price]
  }
}

