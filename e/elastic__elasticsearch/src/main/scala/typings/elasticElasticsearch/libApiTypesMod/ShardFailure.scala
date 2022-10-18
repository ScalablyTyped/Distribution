package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardFailure extends StObject {
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var node: js.UndefOr[String] = js.undefined
  
  var reason: ErrorCause
  
  var shard: integer
  
  var status: js.UndefOr[String] = js.undefined
}
object ShardFailure {
  
  inline def apply(reason: ErrorCause, shard: integer): ShardFailure = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardFailure]
  }
  
  extension [Self <: ShardFailure](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setReason(value: ErrorCause): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
