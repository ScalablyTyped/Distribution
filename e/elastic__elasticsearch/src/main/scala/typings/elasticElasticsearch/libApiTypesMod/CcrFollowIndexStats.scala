package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowIndexStats extends StObject {
  
  var index: IndexName
  
  var shards: js.Array[CcrShardStats]
}
object CcrFollowIndexStats {
  
  inline def apply(index: IndexName, shards: js.Array[CcrShardStats]): CcrFollowIndexStats = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowIndexStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowIndexStats] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setShards(value: js.Array[CcrShardStats]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: CcrShardStats*): Self = StObject.set(x, "shards", js.Array(value*))
  }
}
