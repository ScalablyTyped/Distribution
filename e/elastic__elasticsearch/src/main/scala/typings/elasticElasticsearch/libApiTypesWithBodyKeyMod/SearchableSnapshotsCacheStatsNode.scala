package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsCacheStatsNode extends StObject {
  
  var shared_cache: SearchableSnapshotsCacheStatsShared
}
object SearchableSnapshotsCacheStatsNode {
  
  inline def apply(shared_cache: SearchableSnapshotsCacheStatsShared): SearchableSnapshotsCacheStatsNode = {
    val __obj = js.Dynamic.literal(shared_cache = shared_cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsCacheStatsNode]
  }
  
  extension [Self <: SearchableSnapshotsCacheStatsNode](x: Self) {
    
    inline def setShared_cache(value: SearchableSnapshotsCacheStatsShared): Self = StObject.set(x, "shared_cache", value.asInstanceOf[js.Any])
  }
}
