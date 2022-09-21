package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkSettings extends StObject {
  
  /**
    * The ingress settings for version or service.
    */
  var ingressTrafficAllowed: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkSettings {
  
  inline def apply(): SchemaNetworkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkSettings]
  }
  
  extension [Self <: SchemaNetworkSettings](x: Self) {
    
    inline def setIngressTrafficAllowed(value: String): Self = StObject.set(x, "ingressTrafficAllowed", value.asInstanceOf[js.Any])
    
    inline def setIngressTrafficAllowedNull: Self = StObject.set(x, "ingressTrafficAllowed", null)
    
    inline def setIngressTrafficAllowedUndefined: Self = StObject.set(x, "ingressTrafficAllowed", js.undefined)
  }
}
