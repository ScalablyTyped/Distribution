package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRecoveryStatus extends StObject {
  
  var shards: js.Array[IndicesRecoveryShardRecovery]
}
object IndicesRecoveryRecoveryStatus {
  
  inline def apply(shards: js.Array[IndicesRecoveryShardRecovery]): IndicesRecoveryRecoveryStatus = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryRecoveryStatus]
  }
  
  extension [Self <: IndicesRecoveryRecoveryStatus](x: Self) {
    
    inline def setShards(value: js.Array[IndicesRecoveryShardRecovery]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: IndicesRecoveryShardRecovery*): Self = StObject.set(x, "shards", js.Array(value*))
  }
}
