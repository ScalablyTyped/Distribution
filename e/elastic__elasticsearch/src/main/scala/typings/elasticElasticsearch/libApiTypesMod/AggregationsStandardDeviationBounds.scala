package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStandardDeviationBounds extends StObject {
  
  var lower: double | Null
  
  var lower_population: double | Null
  
  var lower_sampling: double | Null
  
  var upper: double | Null
  
  var upper_population: double | Null
  
  var upper_sampling: double | Null
}
object AggregationsStandardDeviationBounds {
  
  inline def apply(): AggregationsStandardDeviationBounds = {
    val __obj = js.Dynamic.literal(lower = null, lower_population = null, lower_sampling = null, upper = null, upper_population = null, upper_sampling = null)
    __obj.asInstanceOf[AggregationsStandardDeviationBounds]
  }
  
  extension [Self <: AggregationsStandardDeviationBounds](x: Self) {
    
    inline def setLower(value: double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerNull: Self = StObject.set(x, "lower", null)
    
    inline def setLower_population(value: double): Self = StObject.set(x, "lower_population", value.asInstanceOf[js.Any])
    
    inline def setLower_populationNull: Self = StObject.set(x, "lower_population", null)
    
    inline def setLower_sampling(value: double): Self = StObject.set(x, "lower_sampling", value.asInstanceOf[js.Any])
    
    inline def setLower_samplingNull: Self = StObject.set(x, "lower_sampling", null)
    
    inline def setUpper(value: double): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperNull: Self = StObject.set(x, "upper", null)
    
    inline def setUpper_population(value: double): Self = StObject.set(x, "upper_population", value.asInstanceOf[js.Any])
    
    inline def setUpper_populationNull: Self = StObject.set(x, "upper_population", null)
    
    inline def setUpper_sampling(value: double): Self = StObject.set(x, "upper_sampling", value.asInstanceOf[js.Any])
    
    inline def setUpper_samplingNull: Self = StObject.set(x, "upper_sampling", null)
  }
}
