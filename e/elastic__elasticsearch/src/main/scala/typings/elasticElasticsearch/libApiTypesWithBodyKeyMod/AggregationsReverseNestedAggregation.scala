package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsReverseNestedAggregation
  extends StObject
     with AggregationsAggregation {
  
  var path: js.UndefOr[Field] = js.undefined
}
object AggregationsReverseNestedAggregation {
  
  inline def apply(): AggregationsReverseNestedAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsReverseNestedAggregation]
  }
  
  extension [Self <: AggregationsReverseNestedAggregation](x: Self) {
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
