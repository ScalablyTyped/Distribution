package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFrequencyCap extends StObject {
  
  /**
    * The maximum number of impressions that can be served to a user within the specified time period.
    */
  var maxImpressions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time unit. Along with num_time_units defines the amount of time over which impressions per user are counted and capped.
    */
  var timeUnitType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of time, in the units specified by time_unit_type. Defines the amount of time over which impressions per user are counted and capped.
    */
  var timeUnitsCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFrequencyCap {
  
  inline def apply(): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
  
  extension [Self <: SchemaFrequencyCap](x: Self) {
    
    inline def setMaxImpressions(value: Double): Self = StObject.set(x, "maxImpressions", value.asInstanceOf[js.Any])
    
    inline def setMaxImpressionsNull: Self = StObject.set(x, "maxImpressions", null)
    
    inline def setMaxImpressionsUndefined: Self = StObject.set(x, "maxImpressions", js.undefined)
    
    inline def setTimeUnitType(value: String): Self = StObject.set(x, "timeUnitType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitTypeNull: Self = StObject.set(x, "timeUnitType", null)
    
    inline def setTimeUnitTypeUndefined: Self = StObject.set(x, "timeUnitType", js.undefined)
    
    inline def setTimeUnitsCount(value: Double): Self = StObject.set(x, "timeUnitsCount", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitsCountNull: Self = StObject.set(x, "timeUnitsCount", null)
    
    inline def setTimeUnitsCountUndefined: Self = StObject.set(x, "timeUnitsCount", js.undefined)
  }
}
