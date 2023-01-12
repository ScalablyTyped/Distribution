package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLifecycleEventsEnabledRequest extends StObject {
  
  /**
    * If true, starts emitting lifecycle events.
    */
  var enabled: Boolean
}
object SetLifecycleEventsEnabledRequest {
  
  inline def apply(enabled: Boolean): SetLifecycleEventsEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLifecycleEventsEnabledRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetLifecycleEventsEnabledRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
