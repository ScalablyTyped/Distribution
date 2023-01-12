package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGoogleNormalizedDistanceHeuristic extends StObject {
  
  var background_is_superset: js.UndefOr[Boolean] = js.undefined
}
object AggregationsGoogleNormalizedDistanceHeuristic {
  
  inline def apply(): AggregationsGoogleNormalizedDistanceHeuristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGoogleNormalizedDistanceHeuristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGoogleNormalizedDistanceHeuristic] (val x: Self) extends AnyVal {
    
    inline def setBackground_is_superset(value: Boolean): Self = StObject.set(x, "background_is_superset", value.asInstanceOf[js.Any])
    
    inline def setBackground_is_supersetUndefined: Self = StObject.set(x, "background_is_superset", js.undefined)
  }
}
