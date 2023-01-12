package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardSequenceNumber extends StObject {
  
  var global_checkpoint: long
  
  var local_checkpoint: long
  
  var max_seq_no: SequenceNumber
}
object IndicesStatsShardSequenceNumber {
  
  inline def apply(global_checkpoint: long, local_checkpoint: long, max_seq_no: SequenceNumber): IndicesStatsShardSequenceNumber = {
    val __obj = js.Dynamic.literal(global_checkpoint = global_checkpoint.asInstanceOf[js.Any], local_checkpoint = local_checkpoint.asInstanceOf[js.Any], max_seq_no = max_seq_no.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardSequenceNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsShardSequenceNumber] (val x: Self) extends AnyVal {
    
    inline def setGlobal_checkpoint(value: long): Self = StObject.set(x, "global_checkpoint", value.asInstanceOf[js.Any])
    
    inline def setLocal_checkpoint(value: long): Self = StObject.set(x, "local_checkpoint", value.asInstanceOf[js.Any])
    
    inline def setMax_seq_no(value: SequenceNumber): Self = StObject.set(x, "max_seq_no", value.asInstanceOf[js.Any])
  }
}
