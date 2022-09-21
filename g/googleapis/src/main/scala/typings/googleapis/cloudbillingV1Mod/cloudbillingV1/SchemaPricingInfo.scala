package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricingInfo extends StObject {
  
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression doesn't require aggregation.
    */
  var aggregationInfo: js.UndefOr[SchemaAggregationInfo] = js.undefined
  
  /**
    * Conversion rate used for currency conversion, from USD to the currency specified in the request. This includes any surcharge collected for billing in non USD currency. If a currency is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The timestamp from which this pricing was effective within the requested time range. This is guaranteed to be greater than or equal to the start_time field in the request and less than the end_time field in the request. If a time range was not specified in the request this field will be equivalent to a time within the last 12 hours, indicating the latest pricing info.
    */
  var effectiveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expresses the pricing formula. See `PricingExpression` for an example.
    */
  var pricingExpression: js.UndefOr[SchemaPricingExpression] = js.undefined
  
  /**
    * An optional human readable summary of the pricing information, has a maximum length of 256 characters.
    */
  var summary: js.UndefOr[String | Null] = js.undefined
}
object SchemaPricingInfo {
  
  inline def apply(): SchemaPricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingInfo]
  }
  
  extension [Self <: SchemaPricingInfo](x: Self) {
    
    inline def setAggregationInfo(value: SchemaAggregationInfo): Self = StObject.set(x, "aggregationInfo", value.asInstanceOf[js.Any])
    
    inline def setAggregationInfoUndefined: Self = StObject.set(x, "aggregationInfo", js.undefined)
    
    inline def setCurrencyConversionRate(value: Double): Self = StObject.set(x, "currencyConversionRate", value.asInstanceOf[js.Any])
    
    inline def setCurrencyConversionRateNull: Self = StObject.set(x, "currencyConversionRate", null)
    
    inline def setCurrencyConversionRateUndefined: Self = StObject.set(x, "currencyConversionRate", js.undefined)
    
    inline def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeNull: Self = StObject.set(x, "effectiveTime", null)
    
    inline def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    inline def setPricingExpression(value: SchemaPricingExpression): Self = StObject.set(x, "pricingExpression", value.asInstanceOf[js.Any])
    
    inline def setPricingExpressionUndefined: Self = StObject.set(x, "pricingExpression", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
