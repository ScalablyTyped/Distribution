package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketKsAggregation
  extends StObject
     with AggregationsBucketPathAggregation {
  
  var alternative: js.UndefOr[js.Array[String]] = js.undefined
  
  var fractions: js.UndefOr[js.Array[double]] = js.undefined
  
  var sampling_method: js.UndefOr[String] = js.undefined
}
object AggregationsBucketKsAggregation {
  
  inline def apply(): AggregationsBucketKsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBucketKsAggregation]
  }
  
  extension [Self <: AggregationsBucketKsAggregation](x: Self) {
    
    inline def setAlternative(value: js.Array[String]): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
    
    inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
    
    inline def setAlternativeVarargs(value: String*): Self = StObject.set(x, "alternative", js.Array(value*))
    
    inline def setFractions(value: js.Array[double]): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
    
    inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
    
    inline def setFractionsVarargs(value: double*): Self = StObject.set(x, "fractions", js.Array(value*))
    
    inline def setSampling_method(value: String): Self = StObject.set(x, "sampling_method", value.asInstanceOf[js.Any])
    
    inline def setSampling_methodUndefined: Self = StObject.set(x, "sampling_method", js.undefined)
  }
}
