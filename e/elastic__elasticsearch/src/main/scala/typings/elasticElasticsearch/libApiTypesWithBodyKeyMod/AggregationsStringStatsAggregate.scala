package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringStatsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var avg_length: double | Null
  
  var avg_length_as_string: js.UndefOr[String] = js.undefined
  
  var count: long
  
  var distribution: js.UndefOr[(Record[String, double]) | Null] = js.undefined
  
  var entropy: double | Null
  
  var max_length: integer | Null
  
  var max_length_as_string: js.UndefOr[String] = js.undefined
  
  var min_length: integer | Null
  
  var min_length_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsStringStatsAggregate {
  
  inline def apply(count: long): AggregationsStringStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], avg_length = null, entropy = null, max_length = null, min_length = null)
    __obj.asInstanceOf[AggregationsStringStatsAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsStringStatsAggregate] (val x: Self) extends AnyVal {
    
    inline def setAvg_length(value: double): Self = StObject.set(x, "avg_length", value.asInstanceOf[js.Any])
    
    inline def setAvg_lengthNull: Self = StObject.set(x, "avg_length", null)
    
    inline def setAvg_length_as_string(value: String): Self = StObject.set(x, "avg_length_as_string", value.asInstanceOf[js.Any])
    
    inline def setAvg_length_as_stringUndefined: Self = StObject.set(x, "avg_length_as_string", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDistribution(value: Record[String, double]): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionNull: Self = StObject.set(x, "distribution", null)
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setEntropy(value: double): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
    
    inline def setEntropyNull: Self = StObject.set(x, "entropy", null)
    
    inline def setMax_length(value: integer): Self = StObject.set(x, "max_length", value.asInstanceOf[js.Any])
    
    inline def setMax_lengthNull: Self = StObject.set(x, "max_length", null)
    
    inline def setMax_length_as_string(value: String): Self = StObject.set(x, "max_length_as_string", value.asInstanceOf[js.Any])
    
    inline def setMax_length_as_stringUndefined: Self = StObject.set(x, "max_length_as_string", js.undefined)
    
    inline def setMin_length(value: integer): Self = StObject.set(x, "min_length", value.asInstanceOf[js.Any])
    
    inline def setMin_lengthNull: Self = StObject.set(x, "min_length", null)
    
    inline def setMin_length_as_string(value: String): Self = StObject.set(x, "min_length_as_string", value.asInstanceOf[js.Any])
    
    inline def setMin_length_as_stringUndefined: Self = StObject.set(x, "min_length_as_string", js.undefined)
  }
}
