package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecurity extends StObject {
  
  var authc: js.UndefOr[NodesInfoNodeInfoXpackSecurityAuthc] = js.undefined
  
  var enabled: String
  
  var http: NodesInfoNodeInfoXpackSecuritySsl
  
  var transport: js.UndefOr[NodesInfoNodeInfoXpackSecuritySsl] = js.undefined
}
object NodesInfoNodeInfoXpackSecurity {
  
  inline def apply(enabled: String, http: NodesInfoNodeInfoXpackSecuritySsl): NodesInfoNodeInfoXpackSecurity = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecurity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoXpackSecurity] (val x: Self) extends AnyVal {
    
    inline def setAuthc(value: NodesInfoNodeInfoXpackSecurityAuthc): Self = StObject.set(x, "authc", value.asInstanceOf[js.Any])
    
    inline def setAuthcUndefined: Self = StObject.set(x, "authc", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: NodesInfoNodeInfoXpackSecuritySsl): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: NodesInfoNodeInfoXpackSecuritySsl): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
