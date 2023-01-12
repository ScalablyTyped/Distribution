package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsCacheStatsResponse extends StObject {
  
  var nodes: Record[String, SearchableSnapshotsCacheStatsNode]
}
object SearchableSnapshotsCacheStatsResponse {
  
  inline def apply(nodes: Record[String, SearchableSnapshotsCacheStatsNode]): SearchableSnapshotsCacheStatsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsCacheStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchableSnapshotsCacheStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Record[String, SearchableSnapshotsCacheStatsNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
