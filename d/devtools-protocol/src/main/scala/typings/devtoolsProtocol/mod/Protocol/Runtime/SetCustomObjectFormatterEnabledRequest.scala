package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCustomObjectFormatterEnabledRequest extends StObject {
  
  var enabled: Boolean
}
object SetCustomObjectFormatterEnabledRequest {
  
  inline def apply(enabled: Boolean): SetCustomObjectFormatterEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCustomObjectFormatterEnabledRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetCustomObjectFormatterEnabledRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
