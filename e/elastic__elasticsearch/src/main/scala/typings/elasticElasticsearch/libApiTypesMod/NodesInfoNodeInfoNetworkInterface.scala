package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoNetworkInterface extends StObject {
  
  var address: String
  
  var mac_address: String
  
  var name: Name
}
object NodesInfoNodeInfoNetworkInterface {
  
  inline def apply(address: String, mac_address: String, name: Name): NodesInfoNodeInfoNetworkInterface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], mac_address = mac_address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoNetworkInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoNetworkInterface] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setMac_address(value: String): Self = StObject.set(x, "mac_address", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
