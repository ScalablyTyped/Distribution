package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLocalFontsEnabledRequest extends StObject {
  
  /**
    * Whether rendering of local fonts is enabled.
    */
  var enabled: Boolean
}
object SetLocalFontsEnabledRequest {
  
  inline def apply(enabled: Boolean): SetLocalFontsEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLocalFontsEnabledRequest]
  }
  
  extension [Self <: SetLocalFontsEnabledRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
