package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsNetwork extends StObject {
  
  var host: Host
}
object NodesInfoNodeInfoSettingsNetwork {
  
  inline def apply(host: Host): NodesInfoNodeInfoSettingsNetwork = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsNetwork]
  }
  
  extension [Self <: NodesInfoNodeInfoSettingsNetwork](x: Self) {
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
