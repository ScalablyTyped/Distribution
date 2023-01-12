package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsChildrenAggregation
  extends StObject
     with AggregationsAggregation {
  
  var `type`: js.UndefOr[RelationName] = js.undefined
}
object AggregationsChildrenAggregation {
  
  inline def apply(): AggregationsChildrenAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsChildrenAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsChildrenAggregation] (val x: Self) extends AnyVal {
    
    inline def setType(value: RelationName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
