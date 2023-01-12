package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMutualInformationHeuristic extends StObject {
  
  var background_is_superset: js.UndefOr[Boolean] = js.undefined
  
  var include_negatives: js.UndefOr[Boolean] = js.undefined
}
object AggregationsMutualInformationHeuristic {
  
  inline def apply(): AggregationsMutualInformationHeuristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMutualInformationHeuristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMutualInformationHeuristic] (val x: Self) extends AnyVal {
    
    inline def setBackground_is_superset(value: Boolean): Self = StObject.set(x, "background_is_superset", value.asInstanceOf[js.Any])
    
    inline def setBackground_is_supersetUndefined: Self = StObject.set(x, "background_is_superset", js.undefined)
    
    inline def setInclude_negatives(value: Boolean): Self = StObject.set(x, "include_negatives", value.asInstanceOf[js.Any])
    
    inline def setInclude_negativesUndefined: Self = StObject.set(x, "include_negatives", js.undefined)
  }
}
