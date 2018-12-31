package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingInfo extends js.Object {
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression
    * doesn't require aggregation.
    */
  var aggregationInfo: js.UndefOr[AggregationInfo] = js.undefined
  /**
    * Conversion rate for currency conversion, from USD to the currency specified
    * in the request. If the currency is not specified this defaults to 1.0.
    * Example: USD &#42; currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[scala.Double] = js.undefined
  /** The timestamp from which this pricing was effective. */
  var effectiveTime: js.UndefOr[java.lang.String] = js.undefined
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.undefined
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

