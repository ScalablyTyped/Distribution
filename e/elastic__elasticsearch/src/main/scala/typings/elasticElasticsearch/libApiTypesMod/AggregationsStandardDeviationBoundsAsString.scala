package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStandardDeviationBoundsAsString extends StObject {
  
  var lower: String
  
  var lower_population: String
  
  var lower_sampling: String
  
  var upper: String
  
  var upper_population: String
  
  var upper_sampling: String
}
object AggregationsStandardDeviationBoundsAsString {
  
  inline def apply(
    lower: String,
    lower_population: String,
    lower_sampling: String,
    upper: String,
    upper_population: String,
    upper_sampling: String
  ): AggregationsStandardDeviationBoundsAsString = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], lower_population = lower_population.asInstanceOf[js.Any], lower_sampling = lower_sampling.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], upper_population = upper_population.asInstanceOf[js.Any], upper_sampling = upper_sampling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsStandardDeviationBoundsAsString]
  }
  
  extension [Self <: AggregationsStandardDeviationBoundsAsString](x: Self) {
    
    inline def setLower(value: String): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLower_population(value: String): Self = StObject.set(x, "lower_population", value.asInstanceOf[js.Any])
    
    inline def setLower_sampling(value: String): Self = StObject.set(x, "lower_sampling", value.asInstanceOf[js.Any])
    
    inline def setUpper(value: String): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpper_population(value: String): Self = StObject.set(x, "upper_population", value.asInstanceOf[js.Any])
    
    inline def setUpper_sampling(value: String): Self = StObject.set(x, "upper_sampling", value.asInstanceOf[js.Any])
  }
}
