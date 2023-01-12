package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsCluster extends StObject {
  
  var deprecation_indexing: js.UndefOr[NodesInfoDeprecationIndexing] = js.undefined
  
  var election: NodesInfoNodeInfoSettingsClusterElection
  
  var initial_master_nodes: js.UndefOr[String] = js.undefined
  
  var name: Name
  
  var routing: js.UndefOr[IndicesIndexRouting] = js.undefined
}
object NodesInfoNodeInfoSettingsCluster {
  
  inline def apply(election: NodesInfoNodeInfoSettingsClusterElection, name: Name): NodesInfoNodeInfoSettingsCluster = {
    val __obj = js.Dynamic.literal(election = election.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsCluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsCluster] (val x: Self) extends AnyVal {
    
    inline def setDeprecation_indexing(value: NodesInfoDeprecationIndexing): Self = StObject.set(x, "deprecation_indexing", value.asInstanceOf[js.Any])
    
    inline def setDeprecation_indexingUndefined: Self = StObject.set(x, "deprecation_indexing", js.undefined)
    
    inline def setElection(value: NodesInfoNodeInfoSettingsClusterElection): Self = StObject.set(x, "election", value.asInstanceOf[js.Any])
    
    inline def setInitial_master_nodes(value: String): Self = StObject.set(x, "initial_master_nodes", value.asInstanceOf[js.Any])
    
    inline def setInitial_master_nodesUndefined: Self = StObject.set(x, "initial_master_nodes", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRouting(value: IndicesIndexRouting): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
  }
}
