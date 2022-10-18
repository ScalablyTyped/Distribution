package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecurityAuthcToken extends StObject {
  
  var enabled: String
}
object NodesInfoNodeInfoXpackSecurityAuthcToken {
  
  inline def apply(enabled: String): NodesInfoNodeInfoXpackSecurityAuthcToken = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecurityAuthcToken]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackSecurityAuthcToken](x: Self) {
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
