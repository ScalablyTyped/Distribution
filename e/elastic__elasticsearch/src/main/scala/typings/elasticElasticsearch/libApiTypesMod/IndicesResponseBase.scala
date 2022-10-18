package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResponseBase
  extends StObject
     with AcknowledgedResponseBase {
  
  var _shards: js.UndefOr[ShardStatistics] = js.undefined
}
object IndicesResponseBase {
  
  inline def apply(acknowledged: Boolean): IndicesResponseBase = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResponseBase]
  }
  
  extension [Self <: IndicesResponseBase](x: Self) {
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    inline def set_shardsUndefined: Self = StObject.set(x, "_shards", js.undefined)
  }
}
