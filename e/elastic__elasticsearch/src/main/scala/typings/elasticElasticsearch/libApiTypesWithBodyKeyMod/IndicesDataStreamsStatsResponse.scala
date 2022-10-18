package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamsStatsResponse extends StObject {
  
  var _shards: ShardStatistics
  
  var backing_indices: integer
  
  var data_stream_count: integer
  
  var data_streams: js.Array[IndicesDataStreamsStatsDataStreamsStatsItem]
  
  var total_store_size_bytes: integer
  
  var total_store_sizes: js.UndefOr[ByteSize] = js.undefined
}
object IndicesDataStreamsStatsResponse {
  
  inline def apply(
    _shards: ShardStatistics,
    backing_indices: integer,
    data_stream_count: integer,
    data_streams: js.Array[IndicesDataStreamsStatsDataStreamsStatsItem],
    total_store_size_bytes: integer
  ): IndicesDataStreamsStatsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], backing_indices = backing_indices.asInstanceOf[js.Any], data_stream_count = data_stream_count.asInstanceOf[js.Any], data_streams = data_streams.asInstanceOf[js.Any], total_store_size_bytes = total_store_size_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDataStreamsStatsResponse]
  }
  
  extension [Self <: IndicesDataStreamsStatsResponse](x: Self) {
    
    inline def setBacking_indices(value: integer): Self = StObject.set(x, "backing_indices", value.asInstanceOf[js.Any])
    
    inline def setData_stream_count(value: integer): Self = StObject.set(x, "data_stream_count", value.asInstanceOf[js.Any])
    
    inline def setData_streams(value: js.Array[IndicesDataStreamsStatsDataStreamsStatsItem]): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_streamsVarargs(value: IndicesDataStreamsStatsDataStreamsStatsItem*): Self = StObject.set(x, "data_streams", js.Array(value*))
    
    inline def setTotal_store_size_bytes(value: integer): Self = StObject.set(x, "total_store_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_store_sizes(value: ByteSize): Self = StObject.set(x, "total_store_sizes", value.asInstanceOf[js.Any])
    
    inline def setTotal_store_sizesUndefined: Self = StObject.set(x, "total_store_sizes", js.undefined)
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
