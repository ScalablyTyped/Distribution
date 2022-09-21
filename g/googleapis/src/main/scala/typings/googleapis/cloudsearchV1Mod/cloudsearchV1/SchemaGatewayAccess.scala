package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGatewayAccess extends StObject {
  
  /**
    * Whether third-party gateway accesses are enabled for this meeting space. If enabled, the actual access code can be retrieved by calling the GetGatewayAccess RPC method.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGatewayAccess {
  
  inline def apply(): SchemaGatewayAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewayAccess]
  }
  
  extension [Self <: SchemaGatewayAccess](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
