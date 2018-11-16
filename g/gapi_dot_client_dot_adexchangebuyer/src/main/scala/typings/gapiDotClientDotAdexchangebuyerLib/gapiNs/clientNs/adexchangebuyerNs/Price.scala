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

