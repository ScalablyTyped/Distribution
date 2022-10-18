package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardLease extends StObject {
  
  var id: Id
  
  var retaining_seq_no: SequenceNumber
  
  var source: String
  
  var timestamp: long
}
object IndicesStatsShardLease {
  
  inline def apply(id: Id, retaining_seq_no: SequenceNumber, source: String, timestamp: long): IndicesStatsShardLease = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], retaining_seq_no = retaining_seq_no.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardLease]
  }
  
  extension [Self <: IndicesStatsShardLease](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRetaining_seq_no(value: SequenceNumber): Self = StObject.set(x, "retaining_seq_no", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
