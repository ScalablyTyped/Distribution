package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrForgetFollowerResponse extends StObject {
  
  var _shards: ShardStatistics
}
object CcrForgetFollowerResponse {
  
  inline def apply(_shards: ShardStatistics): CcrForgetFollowerResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrForgetFollowerResponse]
  }
  
  extension [Self <: CcrForgetFollowerResponse](x: Self) {
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
