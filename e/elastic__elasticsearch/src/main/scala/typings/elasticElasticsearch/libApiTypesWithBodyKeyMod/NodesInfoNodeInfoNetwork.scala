package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoNetwork extends StObject {
  
  var primary_interface: NodesInfoNodeInfoNetworkInterface
  
  var refresh_interval: integer
}
object NodesInfoNodeInfoNetwork {
  
  inline def apply(primary_interface: NodesInfoNodeInfoNetworkInterface, refresh_interval: integer): NodesInfoNodeInfoNetwork = {
    val __obj = js.Dynamic.literal(primary_interface = primary_interface.asInstanceOf[js.Any], refresh_interval = refresh_interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoNetwork]
  }
  
  extension [Self <: NodesInfoNodeInfoNetwork](x: Self) {
    
    inline def setPrimary_interface(value: NodesInfoNodeInfoNetworkInterface): Self = StObject.set(x, "primary_interface", value.asInstanceOf[js.Any])
    
    inline def setRefresh_interval(value: integer): Self = StObject.set(x, "refresh_interval", value.asInstanceOf[js.Any])
  }
}
