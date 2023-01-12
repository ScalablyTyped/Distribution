package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsParentAggregation
  extends StObject
     with AggregationsAggregation {
  
  var `type`: js.UndefOr[RelationName] = js.undefined
}
object AggregationsParentAggregation {
  
  inline def apply(): AggregationsParentAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsParentAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsParentAggregation] (val x: Self) extends AnyVal {
    
    inline def setType(value: RelationName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
