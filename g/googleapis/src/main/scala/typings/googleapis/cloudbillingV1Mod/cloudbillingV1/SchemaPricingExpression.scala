package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricingExpression extends StObject {
  
  /**
    * The base unit for the SKU which is the unit used in usage exports. Example: "By"
    */
  var baseUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Conversion factor for converting from price per usage_unit to price per base_unit, and start_usage_amount to start_usage_amount in base_unit. unit_price / base_unit_conversion_factor = price per base_unit. start_usage_amount * base_unit_conversion_factor = start_usage_amount in base_unit.
    */
  var baseUnitConversionFactor: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The base unit in human readable form. Example: "byte".
    */
  var baseUnitDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The recommended quantity of units for displaying pricing info. When displaying pricing info it is recommended to display: (unit_price * display_quantity) per display_quantity usage_unit. This field does not affect the pricing formula and is for display purposes only. Example: If the unit_price is "0.0001 USD", the usage_unit is "GB" and the display_quantity is "1000" then the recommended way of displaying the pricing info is "0.10 USD per 1000 GB"
    */
  var displayQuantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of tiered rates for this pricing. The total cost is computed by applying each of the tiered rates on usage. This repeated list is sorted by ascending order of start_usage_amount.
    */
  var tieredRates: js.UndefOr[js.Array[SchemaTierRate]] = js.undefined
  
  /**
    * The short hand for unit of usage this pricing is specified in. Example: usage_unit of "GiBy" means that usage is specified in "Gibi Byte".
    */
  var usageUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit of usage in human readable form. Example: "gibi byte".
    */
  var usageUnitDescription: js.UndefOr[String | Null] = js.undefined
}
object SchemaPricingExpression {
  
  inline def apply(): SchemaPricingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingExpression]
  }
  
  extension [Self <: SchemaPricingExpression](x: Self) {
    
    inline def setBaseUnit(value: String): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitConversionFactor(value: Double): Self = StObject.set(x, "baseUnitConversionFactor", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitConversionFactorNull: Self = StObject.set(x, "baseUnitConversionFactor", null)
    
    inline def setBaseUnitConversionFactorUndefined: Self = StObject.set(x, "baseUnitConversionFactor", js.undefined)
    
    inline def setBaseUnitDescription(value: String): Self = StObject.set(x, "baseUnitDescription", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitDescriptionNull: Self = StObject.set(x, "baseUnitDescription", null)
    
    inline def setBaseUnitDescriptionUndefined: Self = StObject.set(x, "baseUnitDescription", js.undefined)
    
    inline def setBaseUnitNull: Self = StObject.set(x, "baseUnit", null)
    
    inline def setBaseUnitUndefined: Self = StObject.set(x, "baseUnit", js.undefined)
    
    inline def setDisplayQuantity(value: Double): Self = StObject.set(x, "displayQuantity", value.asInstanceOf[js.Any])
    
    inline def setDisplayQuantityNull: Self = StObject.set(x, "displayQuantity", null)
    
    inline def setDisplayQuantityUndefined: Self = StObject.set(x, "displayQuantity", js.undefined)
    
    inline def setTieredRates(value: js.Array[SchemaTierRate]): Self = StObject.set(x, "tieredRates", value.asInstanceOf[js.Any])
    
    inline def setTieredRatesUndefined: Self = StObject.set(x, "tieredRates", js.undefined)
    
    inline def setTieredRatesVarargs(value: SchemaTierRate*): Self = StObject.set(x, "tieredRates", js.Array(value*))
    
    inline def setUsageUnit(value: String): Self = StObject.set(x, "usageUnit", value.asInstanceOf[js.Any])
    
    inline def setUsageUnitDescription(value: String): Self = StObject.set(x, "usageUnitDescription", value.asInstanceOf[js.Any])
    
    inline def setUsageUnitDescriptionNull: Self = StObject.set(x, "usageUnitDescription", null)
    
    inline def setUsageUnitDescriptionUndefined: Self = StObject.set(x, "usageUnitDescription", js.undefined)
    
    inline def setUsageUnitNull: Self = StObject.set(x, "usageUnit", null)
    
    inline def setUsageUnitUndefined: Self = StObject.set(x, "usageUnit", js.undefined)
  }
}
