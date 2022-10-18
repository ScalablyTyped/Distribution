package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSegmentsShardsSegment extends StObject {
  
  var num_committed_segments: integer
  
  var num_search_segments: integer
  
  var routing: IndicesSegmentsShardSegmentRouting
  
  var segments: Record[String, IndicesSegmentsSegment]
}
object IndicesSegmentsShardsSegment {
  
  inline def apply(
    num_committed_segments: integer,
    num_search_segments: integer,
    routing: IndicesSegmentsShardSegmentRouting,
    segments: Record[String, IndicesSegmentsSegment]
  ): IndicesSegmentsShardsSegment = {
    val __obj = js.Dynamic.literal(num_committed_segments = num_committed_segments.asInstanceOf[js.Any], num_search_segments = num_search_segments.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSegmentsShardsSegment]
  }
  
  extension [Self <: IndicesSegmentsShardsSegment](x: Self) {
    
    inline def setNum_committed_segments(value: integer): Self = StObject.set(x, "num_committed_segments", value.asInstanceOf[js.Any])
    
    inline def setNum_search_segments(value: integer): Self = StObject.set(x, "num_search_segments", value.asInstanceOf[js.Any])
    
    inline def setRouting(value: IndicesSegmentsShardSegmentRouting): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: Record[String, IndicesSegmentsSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
