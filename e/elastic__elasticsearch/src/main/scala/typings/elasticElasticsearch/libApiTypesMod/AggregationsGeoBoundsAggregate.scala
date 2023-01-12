package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoBoundsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var bounds: js.UndefOr[GeoBounds] = js.undefined
}
object AggregationsGeoBoundsAggregate {
  
  inline def apply(): AggregationsGeoBoundsAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGeoBoundsAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoBoundsAggregate] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: GeoBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
  }
}
