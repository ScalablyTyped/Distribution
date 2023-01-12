package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamsStatsDataStreamsStatsItem extends StObject {
  
  var backing_indices: integer
  
  var data_stream: Name
  
  var maximum_timestamp: EpochTime[UnitMillis]
  
  var store_size: js.UndefOr[ByteSize] = js.undefined
  
  var store_size_bytes: integer
}
object IndicesDataStreamsStatsDataStreamsStatsItem {
  
  inline def apply(
    backing_indices: integer,
    data_stream: Name,
    maximum_timestamp: EpochTime[UnitMillis],
    store_size_bytes: integer
  ): IndicesDataStreamsStatsDataStreamsStatsItem = {
    val __obj = js.Dynamic.literal(backing_indices = backing_indices.asInstanceOf[js.Any], data_stream = data_stream.asInstanceOf[js.Any], maximum_timestamp = maximum_timestamp.asInstanceOf[js.Any], store_size_bytes = store_size_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDataStreamsStatsDataStreamsStatsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDataStreamsStatsDataStreamsStatsItem] (val x: Self) extends AnyVal {
    
    inline def setBacking_indices(value: integer): Self = StObject.set(x, "backing_indices", value.asInstanceOf[js.Any])
    
    inline def setData_stream(value: Name): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setMaximum_timestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "maximum_timestamp", value.asInstanceOf[js.Any])
    
    inline def setStore_size(value: ByteSize): Self = StObject.set(x, "store_size", value.asInstanceOf[js.Any])
    
    inline def setStore_sizeUndefined: Self = StObject.set(x, "store_size", js.undefined)
    
    inline def setStore_size_bytes(value: integer): Self = StObject.set(x, "store_size_bytes", value.asInstanceOf[js.Any])
  }
}
