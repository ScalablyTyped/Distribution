package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSamplerAggregation
  extends StObject
     with AggregationsAggregation {
  
  var shard_size: js.UndefOr[integer] = js.undefined
}
object AggregationsSamplerAggregation {
  
  inline def apply(): AggregationsSamplerAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsSamplerAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsSamplerAggregation] (val x: Self) extends AnyVal {
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
  }
}
