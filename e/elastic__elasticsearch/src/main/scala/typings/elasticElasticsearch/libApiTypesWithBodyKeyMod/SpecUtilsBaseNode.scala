package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecUtilsBaseNode extends StObject {
  
  var attributes: Record[String, String]
  
  var host: Host
  
  var ip: Ip
  
  var name: Name
  
  var roles: js.UndefOr[NodeRoles] = js.undefined
  
  var transport_address: TransportAddress
}
object SpecUtilsBaseNode {
  
  inline def apply(
    attributes: Record[String, String],
    host: Host,
    ip: Ip,
    name: Name,
    transport_address: TransportAddress
  ): SpecUtilsBaseNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecUtilsBaseNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecUtilsBaseNode] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIp(value: Ip): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: NodeRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: NodeRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
  }
}
