package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDiscoveryNode extends StObject {
  
  var attributes: Record[String, String]
  
  var ephemeral_id: Id
  
  var id: Id
  
  var name: Name
  
  var transport_address: TransportAddress
}
object MlDiscoveryNode {
  
  inline def apply(
    attributes: Record[String, String],
    ephemeral_id: Id,
    id: Id,
    name: Name,
    transport_address: TransportAddress
  ): MlDiscoveryNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], ephemeral_id = ephemeral_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDiscoveryNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDiscoveryNode] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setEphemeral_id(value: Id): Self = StObject.set(x, "ephemeral_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
  }
}
