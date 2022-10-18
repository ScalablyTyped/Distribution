package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecurityAuthc extends StObject {
  
  var realms: NodesInfoNodeInfoXpackSecurityAuthcRealms
  
  var token: NodesInfoNodeInfoXpackSecurityAuthcToken
}
object NodesInfoNodeInfoXpackSecurityAuthc {
  
  inline def apply(realms: NodesInfoNodeInfoXpackSecurityAuthcRealms, token: NodesInfoNodeInfoXpackSecurityAuthcToken): NodesInfoNodeInfoXpackSecurityAuthc = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecurityAuthc]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackSecurityAuthc](x: Self) {
    
    inline def setRealms(value: NodesInfoNodeInfoXpackSecurityAuthcRealms): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setToken(value: NodesInfoNodeInfoXpackSecurityAuthcToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
