package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainNodeAllocationExplanation extends StObject {
  
  var deciders: js.Array[ClusterAllocationExplainAllocationDecision]
  
  var node_attributes: Record[String, String]
  
  var node_decision: ClusterAllocationExplainDecision
  
  var node_id: Id
  
  var node_name: Name
  
  var store: js.UndefOr[ClusterAllocationExplainAllocationStore] = js.undefined
  
  var transport_address: TransportAddress
  
  var weight_ranking: integer
}
object ClusterAllocationExplainNodeAllocationExplanation {
  
  inline def apply(
    deciders: js.Array[ClusterAllocationExplainAllocationDecision],
    node_attributes: Record[String, String],
    node_decision: ClusterAllocationExplainDecision,
    node_id: Id,
    node_name: Name,
    transport_address: TransportAddress,
    weight_ranking: integer
  ): ClusterAllocationExplainNodeAllocationExplanation = {
    val __obj = js.Dynamic.literal(deciders = deciders.asInstanceOf[js.Any], node_attributes = node_attributes.asInstanceOf[js.Any], node_decision = node_decision.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], node_name = node_name.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any], weight_ranking = weight_ranking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainNodeAllocationExplanation]
  }
  
  extension [Self <: ClusterAllocationExplainNodeAllocationExplanation](x: Self) {
    
    inline def setDeciders(value: js.Array[ClusterAllocationExplainAllocationDecision]): Self = StObject.set(x, "deciders", value.asInstanceOf[js.Any])
    
    inline def setDecidersVarargs(value: ClusterAllocationExplainAllocationDecision*): Self = StObject.set(x, "deciders", js.Array(value*))
    
    inline def setNode_attributes(value: Record[String, String]): Self = StObject.set(x, "node_attributes", value.asInstanceOf[js.Any])
    
    inline def setNode_decision(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "node_decision", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_name(value: Name): Self = StObject.set(x, "node_name", value.asInstanceOf[js.Any])
    
    inline def setStore(value: ClusterAllocationExplainAllocationStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setWeight_ranking(value: integer): Self = StObject.set(x, "weight_ranking", value.asInstanceOf[js.Any])
  }
}
