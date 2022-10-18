package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainCurrentNode extends StObject {
  
  var attributes: Record[String, String]
  
  var id: Id
  
  var name: Name
  
  var transport_address: TransportAddress
  
  var weight_ranking: integer
}
object ClusterAllocationExplainCurrentNode {
  
  inline def apply(
    attributes: Record[String, String],
    id: Id,
    name: Name,
    transport_address: TransportAddress,
    weight_ranking: integer
  ): ClusterAllocationExplainCurrentNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any], weight_ranking = weight_ranking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainCurrentNode]
  }
  
  extension [Self <: ClusterAllocationExplainCurrentNode](x: Self) {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setWeight_ranking(value: integer): Self = StObject.set(x, "weight_ranking", value.asInstanceOf[js.Any])
  }
}
