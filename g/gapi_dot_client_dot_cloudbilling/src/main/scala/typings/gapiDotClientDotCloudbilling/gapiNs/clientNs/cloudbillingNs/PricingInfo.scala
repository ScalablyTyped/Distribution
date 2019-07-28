package typings.gapiDotClientDotCloudbilling.gapiNs.clientNs.cloudbillingNs

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
  var currencyConversionRate: js.UndefOr[Double] = js.undefined
  /** The timestamp from which this pricing was effective. */
  var effectiveTime: js.UndefOr[String] = js.undefined
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.undefined
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[String] = js.undefined
}

object PricingInfo {
  @scala.inline
  def apply(
    aggregationInfo: AggregationInfo = null,
    currencyConversionRate: Int | Double = null,
    effectiveTime: String = null,
    pricingExpression: PricingExpression = null,
    summary: String = null
  ): PricingInfo = {
    val __obj = js.Dynamic.literal()
    if (aggregationInfo != null) __obj.updateDynamic("aggregationInfo")(aggregationInfo)
    if (currencyConversionRate != null) __obj.updateDynamic("currencyConversionRate")(currencyConversionRate.asInstanceOf[js.Any])
    if (effectiveTime != null) __obj.updateDynamic("effectiveTime")(effectiveTime)
    if (pricingExpression != null) __obj.updateDynamic("pricingExpression")(pricingExpression)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[PricingInfo]
  }
}

