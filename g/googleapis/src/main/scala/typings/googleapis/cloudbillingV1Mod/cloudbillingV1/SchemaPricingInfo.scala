package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the pricing information for a SKU at a single point of time.
  */
@js.native
trait SchemaPricingInfo extends js.Object {
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression
    * doesn&#39;t require aggregation.
    */
  var aggregationInfo: js.UndefOr[SchemaAggregationInfo] = js.native
  /**
    * Conversion rate used for currency conversion, from USD to the currency
    * specified in the request. This includes any surcharge collected for
    * billing in non USD currency. If a currency is not specified in the
    * request this defaults to 1.0. Example: USD * currency_conversion_rate =
    * JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.native
  /**
    * The timestamp from which this pricing was effective within the requested
    * time range. This is guaranteed to be greater than or equal to the
    * start_time field in the request and less than the end_time field in the
    * request. If a time range was not specified in the request this field will
    * be equivalent to a time within the last 12 hours, indicating the latest
    * pricing info.
    */
  var effectiveTime: js.UndefOr[String] = js.native
  /**
    * Expresses the pricing formula. See `PricingExpression` for an example.
    */
  var pricingExpression: js.UndefOr[SchemaPricingExpression] = js.native
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[String] = js.native
}

object SchemaPricingInfo {
  @scala.inline
  def apply(
    aggregationInfo: SchemaAggregationInfo = null,
    currencyConversionRate: Int | Double = null,
    effectiveTime: String = null,
    pricingExpression: SchemaPricingExpression = null,
    summary: String = null
  ): SchemaPricingInfo = {
    val __obj = js.Dynamic.literal()
    if (aggregationInfo != null) __obj.updateDynamic("aggregationInfo")(aggregationInfo.asInstanceOf[js.Any])
    if (currencyConversionRate != null) __obj.updateDynamic("currencyConversionRate")(currencyConversionRate.asInstanceOf[js.Any])
    if (effectiveTime != null) __obj.updateDynamic("effectiveTime")(effectiveTime.asInstanceOf[js.Any])
    if (pricingExpression != null) __obj.updateDynamic("pricingExpression")(pricingExpression.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPricingInfo]
  }
}

