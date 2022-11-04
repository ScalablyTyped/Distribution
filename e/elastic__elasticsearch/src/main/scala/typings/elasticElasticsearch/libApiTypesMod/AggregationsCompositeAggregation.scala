package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeAggregation
  extends StObject
     with AggregationsAggregation {
  
  var after: js.UndefOr[AggregationsCompositeAggregateKey] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sources: js.UndefOr[js.Array[Record[String, AggregationsCompositeAggregationSource]]] = js.undefined
}
object AggregationsCompositeAggregation {
  
  inline def apply(): AggregationsCompositeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsCompositeAggregation]
  }
  
  extension [Self <: AggregationsCompositeAggregation](x: Self) {
    
    inline def setAfter(value: AggregationsCompositeAggregateKey): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSources(value: js.Array[Record[String, AggregationsCompositeAggregationSource]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: (Record[String, AggregationsCompositeAggregationSource])*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
