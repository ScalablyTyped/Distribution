package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.elasticElasticsearch.libApiTypesWithBodyKeyMod._AggregationsAggregate because Already inherited */ trait AggregationsExtendedStatsAggregate
  extends StObject
     with AggregationsStatsAggregate {
  
  var std_deviation: double | Null
  
  var std_deviation_as_string: js.UndefOr[String] = js.undefined
  
  var std_deviation_bounds: js.UndefOr[AggregationsStandardDeviationBounds] = js.undefined
  
  var std_deviation_bounds_as_string: js.UndefOr[AggregationsStandardDeviationBoundsAsString] = js.undefined
  
  var std_deviation_population: double | Null
  
  var std_deviation_sampling: double | Null
  
  var sum_of_squares: double | Null
  
  var sum_of_squares_as_string: js.UndefOr[String] = js.undefined
  
  var variance: double | Null
  
  var variance_as_string: js.UndefOr[String] = js.undefined
  
  var variance_population: double | Null
  
  var variance_population_as_string: js.UndefOr[String] = js.undefined
  
  var variance_sampling: double | Null
  
  var variance_sampling_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsExtendedStatsAggregate {
  
  inline def apply(count: long, sum: double): AggregationsExtendedStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null, std_deviation = null, std_deviation_population = null, std_deviation_sampling = null, sum_of_squares = null, variance = null, variance_population = null, variance_sampling = null)
    __obj.asInstanceOf[AggregationsExtendedStatsAggregate]
  }
  
  extension [Self <: AggregationsExtendedStatsAggregate](x: Self) {
    
    inline def setStd_deviation(value: double): Self = StObject.set(x, "std_deviation", value.asInstanceOf[js.Any])
    
    inline def setStd_deviationNull: Self = StObject.set(x, "std_deviation", null)
    
    inline def setStd_deviation_as_string(value: String): Self = StObject.set(x, "std_deviation_as_string", value.asInstanceOf[js.Any])
    
    inline def setStd_deviation_as_stringUndefined: Self = StObject.set(x, "std_deviation_as_string", js.undefined)
    
    inline def setStd_deviation_bounds(value: AggregationsStandardDeviationBounds): Self = StObject.set(x, "std_deviation_bounds", value.asInstanceOf[js.Any])
    
    inline def setStd_deviation_boundsUndefined: Self = StObject.set(x, "std_deviation_bounds", js.undefined)
    
    inline def setStd_deviation_bounds_as_string(value: AggregationsStandardDeviationBoundsAsString): Self = StObject.set(x, "std_deviation_bounds_as_string", value.asInstanceOf[js.Any])
    
    inline def setStd_deviation_bounds_as_stringUndefined: Self = StObject.set(x, "std_deviation_bounds_as_string", js.undefined)
    
    inline def setStd_deviation_population(value: double): Self = StObject.set(x, "std_deviation_population", value.asInstanceOf[js.Any])
    
    inline def setStd_deviation_populationNull: Self = StObject.set(x, "std_deviation_population", null)
    
    inline def setStd_deviation_sampling(value: double): Self = StObject.set(x, "std_deviation_sampling", value.asInstanceOf[js.Any])
    
    inline def setStd_deviation_samplingNull: Self = StObject.set(x, "std_deviation_sampling", null)
    
    inline def setSum_of_squares(value: double): Self = StObject.set(x, "sum_of_squares", value.asInstanceOf[js.Any])
    
    inline def setSum_of_squaresNull: Self = StObject.set(x, "sum_of_squares", null)
    
    inline def setSum_of_squares_as_string(value: String): Self = StObject.set(x, "sum_of_squares_as_string", value.asInstanceOf[js.Any])
    
    inline def setSum_of_squares_as_stringUndefined: Self = StObject.set(x, "sum_of_squares_as_string", js.undefined)
    
    inline def setVariance(value: double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVariance_as_string(value: String): Self = StObject.set(x, "variance_as_string", value.asInstanceOf[js.Any])
    
    inline def setVariance_as_stringUndefined: Self = StObject.set(x, "variance_as_string", js.undefined)
    
    inline def setVariance_population(value: double): Self = StObject.set(x, "variance_population", value.asInstanceOf[js.Any])
    
    inline def setVariance_populationNull: Self = StObject.set(x, "variance_population", null)
    
    inline def setVariance_population_as_string(value: String): Self = StObject.set(x, "variance_population_as_string", value.asInstanceOf[js.Any])
    
    inline def setVariance_population_as_stringUndefined: Self = StObject.set(x, "variance_population_as_string", js.undefined)
    
    inline def setVariance_sampling(value: double): Self = StObject.set(x, "variance_sampling", value.asInstanceOf[js.Any])
    
    inline def setVariance_samplingNull: Self = StObject.set(x, "variance_sampling", null)
    
    inline def setVariance_sampling_as_string(value: String): Self = StObject.set(x, "variance_sampling_as_string", value.asInstanceOf[js.Any])
    
    inline def setVariance_sampling_as_stringUndefined: Self = StObject.set(x, "variance_sampling_as_string", js.undefined)
  }
}
