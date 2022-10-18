package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSegmentsIndexSegment extends StObject {
  
  var shards: Record[String, IndicesSegmentsShardsSegment | js.Array[IndicesSegmentsShardsSegment]]
}
object IndicesSegmentsIndexSegment {
  
  inline def apply(shards: Record[String, IndicesSegmentsShardsSegment | js.Array[IndicesSegmentsShardsSegment]]): IndicesSegmentsIndexSegment = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSegmentsIndexSegment]
  }
  
  extension [Self <: IndicesSegmentsIndexSegment](x: Self) {
    
    inline def setShards(value: Record[String, IndicesSegmentsShardsSegment | js.Array[IndicesSegmentsShardsSegment]]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
  }
}
