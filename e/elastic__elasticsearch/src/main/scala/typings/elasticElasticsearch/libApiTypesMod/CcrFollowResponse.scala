package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowResponse extends StObject {
  
  var follow_index_created: Boolean
  
  var follow_index_shards_acked: Boolean
  
  var index_following_started: Boolean
}
object CcrFollowResponse {
  
  inline def apply(
    follow_index_created: Boolean,
    follow_index_shards_acked: Boolean,
    index_following_started: Boolean
  ): CcrFollowResponse = {
    val __obj = js.Dynamic.literal(follow_index_created = follow_index_created.asInstanceOf[js.Any], follow_index_shards_acked = follow_index_shards_acked.asInstanceOf[js.Any], index_following_started = index_following_started.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowResponse]
  }
  
  extension [Self <: CcrFollowResponse](x: Self) {
    
    inline def setFollow_index_created(value: Boolean): Self = StObject.set(x, "follow_index_created", value.asInstanceOf[js.Any])
    
    inline def setFollow_index_shards_acked(value: Boolean): Self = StObject.set(x, "follow_index_shards_acked", value.asInstanceOf[js.Any])
    
    inline def setIndex_following_started(value: Boolean): Self = StObject.set(x, "index_following_started", value.asInstanceOf[js.Any])
  }
}
