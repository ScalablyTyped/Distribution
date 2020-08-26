package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingInfo extends js.Object {
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression
    * doesn't require aggregation.
    */
  var aggregationInfo: js.UndefOr[AggregationInfo] = js.native
  /**
    * Conversion rate for currency conversion, from USD to the currency specified
    * in the request. If the currency is not specified this defaults to 1.0.
    * Example: USD &#42; currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.native
  /** The timestamp from which this pricing was effective. */
  var effectiveTime: js.UndefOr[String] = js.native
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.native
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[String] = js.native
}

object PricingInfo {
  @scala.inline
  def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  @scala.inline
  implicit class PricingInfoOps[Self <: PricingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregationInfo(value: AggregationInfo): Self = this.set("aggregationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationInfo: Self = this.set("aggregationInfo", js.undefined)
    @scala.inline
    def setCurrencyConversionRate(value: Double): Self = this.set("currencyConversionRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyConversionRate: Self = this.set("currencyConversionRate", js.undefined)
    @scala.inline
    def setEffectiveTime(value: String): Self = this.set("effectiveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveTime: Self = this.set("effectiveTime", js.undefined)
    @scala.inline
    def setPricingExpression(value: PricingExpression): Self = this.set("pricingExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingExpression: Self = this.set("pricingExpression", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

