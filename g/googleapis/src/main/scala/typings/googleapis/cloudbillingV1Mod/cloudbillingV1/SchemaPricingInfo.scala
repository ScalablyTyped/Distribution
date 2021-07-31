package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the pricing information for a SKU at a single point of time.
  */
trait SchemaPricingInfo extends StObject {
  
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression
    * doesn&#39;t require aggregation.
    */
  var aggregationInfo: js.UndefOr[SchemaAggregationInfo] = js.undefined
  
  /**
    * Conversion rate used for currency conversion, from USD to the currency
    * specified in the request. This includes any surcharge collected for
    * billing in non USD currency. If a currency is not specified in the
    * request this defaults to 1.0. Example: USD * currency_conversion_rate =
    * JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The timestamp from which this pricing was effective within the requested
    * time range. This is guaranteed to be greater than or equal to the
    * start_time field in the request and less than the end_time field in the
    * request. If a time range was not specified in the request this field will
    * be equivalent to a time within the last 12 hours, indicating the latest
    * pricing info.
    */
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  /**
    * Expresses the pricing formula. See `PricingExpression` for an example.
    */
  var pricingExpression: js.UndefOr[SchemaPricingExpression] = js.undefined
  
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[String] = js.undefined
}
object SchemaPricingInfo {
  
  @scala.inline
  def apply(): SchemaPricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingInfo]
  }
  
  @scala.inline
  implicit class SchemaPricingInfoMutableBuilder[Self <: SchemaPricingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationInfo(value: SchemaAggregationInfo): Self = StObject.set(x, "aggregationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationInfoUndefined: Self = StObject.set(x, "aggregationInfo", js.undefined)
    
    @scala.inline
    def setCurrencyConversionRate(value: Double): Self = StObject.set(x, "currencyConversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyConversionRateUndefined: Self = StObject.set(x, "currencyConversionRate", js.undefined)
    
    @scala.inline
    def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    @scala.inline
    def setPricingExpression(value: SchemaPricingExpression): Self = StObject.set(x, "pricingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingExpressionUndefined: Self = StObject.set(x, "pricingExpression", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
