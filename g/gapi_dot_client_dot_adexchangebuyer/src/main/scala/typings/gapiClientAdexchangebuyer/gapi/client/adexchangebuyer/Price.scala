package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

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
    amountMicros: js.UndefOr[Double] = js.undefined,
    currencyCode: String = null,
    expectedCpmMicros: js.UndefOr[Double] = js.undefined,
    pricingType: String = null
  ): Price = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amountMicros)) __obj.updateDynamic("amountMicros")(amountMicros.get.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(expectedCpmMicros)) __obj.updateDynamic("expectedCpmMicros")(expectedCpmMicros.get.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
}

