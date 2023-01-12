package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoOSCPU extends StObject {
  
  var cache_size: String
  
  var cache_size_in_bytes: integer
  
  var cores_per_socket: integer
  
  var mhz: integer
  
  var model: String
  
  var total_cores: integer
  
  var total_sockets: integer
  
  var vendor: String
}
object NodesInfoNodeInfoOSCPU {
  
  inline def apply(
    cache_size: String,
    cache_size_in_bytes: integer,
    cores_per_socket: integer,
    mhz: integer,
    model: String,
    total_cores: integer,
    total_sockets: integer,
    vendor: String
  ): NodesInfoNodeInfoOSCPU = {
    val __obj = js.Dynamic.literal(cache_size = cache_size.asInstanceOf[js.Any], cache_size_in_bytes = cache_size_in_bytes.asInstanceOf[js.Any], cores_per_socket = cores_per_socket.asInstanceOf[js.Any], mhz = mhz.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], total_cores = total_cores.asInstanceOf[js.Any], total_sockets = total_sockets.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoOSCPU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoOSCPU] (val x: Self) extends AnyVal {
    
    inline def setCache_size(value: String): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setCache_size_in_bytes(value: integer): Self = StObject.set(x, "cache_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCores_per_socket(value: integer): Self = StObject.set(x, "cores_per_socket", value.asInstanceOf[js.Any])
    
    inline def setMhz(value: integer): Self = StObject.set(x, "mhz", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setTotal_cores(value: integer): Self = StObject.set(x, "total_cores", value.asInstanceOf[js.Any])
    
    inline def setTotal_sockets(value: integer): Self = StObject.set(x, "total_sockets", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
