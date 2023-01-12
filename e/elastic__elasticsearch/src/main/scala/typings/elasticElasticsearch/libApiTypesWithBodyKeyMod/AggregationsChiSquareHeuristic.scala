package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsChiSquareHeuristic extends StObject {
  
  var background_is_superset: Boolean
  
  var include_negatives: Boolean
}
object AggregationsChiSquareHeuristic {
  
  inline def apply(background_is_superset: Boolean, include_negatives: Boolean): AggregationsChiSquareHeuristic = {
    val __obj = js.Dynamic.literal(background_is_superset = background_is_superset.asInstanceOf[js.Any], include_negatives = include_negatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsChiSquareHeuristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsChiSquareHeuristic] (val x: Self) extends AnyVal {
    
    inline def setBackground_is_superset(value: Boolean): Self = StObject.set(x, "background_is_superset", value.asInstanceOf[js.Any])
    
    inline def setInclude_negatives(value: Boolean): Self = StObject.set(x, "include_negatives", value.asInstanceOf[js.Any])
  }
}
