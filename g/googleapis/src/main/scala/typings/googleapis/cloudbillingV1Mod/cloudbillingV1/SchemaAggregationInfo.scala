package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAggregationInfo extends StObject {
  
  /**
    * The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and aggregation_count is 14, aggregation will be over 14 days.
    */
  var aggregationCount: js.UndefOr[Double | Null] = js.undefined
  
  var aggregationInterval: js.UndefOr[String | Null] = js.undefined
  
  var aggregationLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaAggregationInfo {
  
  inline def apply(): SchemaAggregationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregationInfo]
  }
  
  extension [Self <: SchemaAggregationInfo](x: Self) {
    
    inline def setAggregationCount(value: Double): Self = StObject.set(x, "aggregationCount", value.asInstanceOf[js.Any])
    
    inline def setAggregationCountNull: Self = StObject.set(x, "aggregationCount", null)
    
    inline def setAggregationCountUndefined: Self = StObject.set(x, "aggregationCount", js.undefined)
    
    inline def setAggregationInterval(value: String): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalNull: Self = StObject.set(x, "aggregationInterval", null)
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setAggregationLevel(value: String): Self = StObject.set(x, "aggregationLevel", value.asInstanceOf[js.Any])
    
    inline def setAggregationLevelNull: Self = StObject.set(x, "aggregationLevel", null)
    
    inline def setAggregationLevelUndefined: Self = StObject.set(x, "aggregationLevel", js.undefined)
  }
}
