package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsTransportType extends StObject {
  
  var default: String
}
object NodesInfoNodeInfoSettingsTransportType {
  
  inline def apply(default: String): NodesInfoNodeInfoSettingsTransportType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsTransportType]
  }
  
  extension [Self <: NodesInfoNodeInfoSettingsTransportType](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
