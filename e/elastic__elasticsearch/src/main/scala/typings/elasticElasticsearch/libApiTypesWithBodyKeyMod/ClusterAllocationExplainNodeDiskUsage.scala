package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainNodeDiskUsage extends StObject {
  
  var least_available: ClusterAllocationExplainDiskUsage
  
  var most_available: ClusterAllocationExplainDiskUsage
  
  var node_name: Name
}
object ClusterAllocationExplainNodeDiskUsage {
  
  inline def apply(
    least_available: ClusterAllocationExplainDiskUsage,
    most_available: ClusterAllocationExplainDiskUsage,
    node_name: Name
  ): ClusterAllocationExplainNodeDiskUsage = {
    val __obj = js.Dynamic.literal(least_available = least_available.asInstanceOf[js.Any], most_available = most_available.asInstanceOf[js.Any], node_name = node_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainNodeDiskUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAllocationExplainNodeDiskUsage] (val x: Self) extends AnyVal {
    
    inline def setLeast_available(value: ClusterAllocationExplainDiskUsage): Self = StObject.set(x, "least_available", value.asInstanceOf[js.Any])
    
    inline def setMost_available(value: ClusterAllocationExplainDiskUsage): Self = StObject.set(x, "most_available", value.asInstanceOf[js.Any])
    
    inline def setNode_name(value: Name): Self = StObject.set(x, "node_name", value.asInstanceOf[js.Any])
  }
}
