package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetMemoryStatsMemory extends StObject {
  
  var attributes: Record[String, String]
  
  var ephemeral_id: Id
  
  var jvm: MlGetMemoryStatsJvmStats
  
  var mem: MlGetMemoryStatsMemStats
  
  var name: Name
  
  var roles: js.Array[String]
  
  var transport_address: TransportAddress
}
object MlGetMemoryStatsMemory {
  
  inline def apply(
    attributes: Record[String, String],
    ephemeral_id: Id,
    jvm: MlGetMemoryStatsJvmStats,
    mem: MlGetMemoryStatsMemStats,
    name: Name,
    roles: js.Array[String],
    transport_address: TransportAddress
  ): MlGetMemoryStatsMemory = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], ephemeral_id = ephemeral_id.asInstanceOf[js.Any], jvm = jvm.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetMemoryStatsMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetMemoryStatsMemory] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setEphemeral_id(value: Id): Self = StObject.set(x, "ephemeral_id", value.asInstanceOf[js.Any])
    
    inline def setJvm(value: MlGetMemoryStatsJvmStats): Self = StObject.set(x, "jvm", value.asInstanceOf[js.Any])
    
    inline def setMem(value: MlGetMemoryStatsMemStats): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
  }
}
