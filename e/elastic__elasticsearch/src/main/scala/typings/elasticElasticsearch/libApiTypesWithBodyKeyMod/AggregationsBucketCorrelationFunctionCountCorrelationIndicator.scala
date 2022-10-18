package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBucketCorrelationFunctionCountCorrelationIndicator extends StObject {
  
  var doc_count: integer
  
  var expectations: js.Array[double]
  
  var fractions: js.UndefOr[js.Array[double]] = js.undefined
}
object AggregationsBucketCorrelationFunctionCountCorrelationIndicator {
  
  inline def apply(doc_count: integer, expectations: js.Array[double]): AggregationsBucketCorrelationFunctionCountCorrelationIndicator = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], expectations = expectations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsBucketCorrelationFunctionCountCorrelationIndicator]
  }
  
  extension [Self <: AggregationsBucketCorrelationFunctionCountCorrelationIndicator](x: Self) {
    
    inline def setDoc_count(value: integer): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setExpectations(value: js.Array[double]): Self = StObject.set(x, "expectations", value.asInstanceOf[js.Any])
    
    inline def setExpectationsVarargs(value: double*): Self = StObject.set(x, "expectations", js.Array(value*))
    
    inline def setFractions(value: js.Array[double]): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
    
    inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
    
    inline def setFractionsVarargs(value: double*): Self = StObject.set(x, "fractions", js.Array(value*))
  }
}
