package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSegmentsResponse extends StObject {
  
  var _shards: ShardStatistics
  
  var indices: Record[String, IndicesSegmentsIndexSegment]
}
object IndicesSegmentsResponse {
  
  inline def apply(_shards: ShardStatistics, indices: Record[String, IndicesSegmentsIndexSegment]): IndicesSegmentsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSegmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSegmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: Record[String, IndicesSegmentsIndexSegment]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
