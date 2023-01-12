package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterFileSystem extends StObject {
  
  var available_in_bytes: long
  
  var free_in_bytes: long
  
  var total_in_bytes: long
}
object ClusterStatsClusterFileSystem {
  
  inline def apply(available_in_bytes: long, free_in_bytes: long, total_in_bytes: long): ClusterStatsClusterFileSystem = {
    val __obj = js.Dynamic.literal(available_in_bytes = available_in_bytes.asInstanceOf[js.Any], free_in_bytes = free_in_bytes.asInstanceOf[js.Any], total_in_bytes = total_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterFileSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterFileSystem] (val x: Self) extends AnyVal {
    
    inline def setAvailable_in_bytes(value: long): Self = StObject.set(x, "available_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFree_in_bytes(value: long): Self = StObject.set(x, "free_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
  }
}
