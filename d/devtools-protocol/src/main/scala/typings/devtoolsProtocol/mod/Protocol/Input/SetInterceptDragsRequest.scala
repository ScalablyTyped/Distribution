package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInterceptDragsRequest extends StObject {
  
  var enabled: Boolean
}
object SetInterceptDragsRequest {
  
  inline def apply(enabled: Boolean): SetInterceptDragsRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInterceptDragsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetInterceptDragsRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
