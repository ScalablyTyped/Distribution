package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsResponse extends StObject {
  
  var _all: IndicesStatsIndicesStats
  
  var _shards: ShardStatistics
  
  var indices: js.UndefOr[Record[String, IndicesStatsIndicesStats]] = js.undefined
}
object IndicesStatsResponse {
  
  inline def apply(_all: IndicesStatsIndicesStats, _shards: ShardStatistics): IndicesStatsResponse = {
    val __obj = js.Dynamic.literal(_all = _all.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: Record[String, IndicesStatsIndicesStats]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def set_all(value: IndicesStatsIndicesStats): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
