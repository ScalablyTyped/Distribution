package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardsOperationResponseBase extends StObject {
  
  var _shards: ShardStatistics
}
object ShardsOperationResponseBase {
  
  inline def apply(_shards: ShardStatistics): ShardsOperationResponseBase = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardsOperationResponseBase]
  }
  
  extension [Self <: ShardsOperationResponseBase](x: Self) {
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
