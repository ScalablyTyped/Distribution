package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadEnabledStateUpdatedEvent extends StObject {
  
  var state: PreloadEnabledState
}
object PreloadEnabledStateUpdatedEvent {
  
  inline def apply(state: PreloadEnabledState): PreloadEnabledStateUpdatedEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadEnabledStateUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadEnabledStateUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setState(value: PreloadEnabledState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
