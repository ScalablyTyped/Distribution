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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsNetwork] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
