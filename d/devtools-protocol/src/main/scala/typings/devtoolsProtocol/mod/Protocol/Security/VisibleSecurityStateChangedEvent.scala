package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleSecurityStateChangedEvent extends StObject {
  
  /**
    * Security state information about the page.
    */
  var visibleSecurityState: VisibleSecurityState
}
object VisibleSecurityStateChangedEvent {
  
  inline def apply(visibleSecurityState: VisibleSecurityState): VisibleSecurityStateChangedEvent = {
    val __obj = js.Dynamic.literal(visibleSecurityState = visibleSecurityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleSecurityStateChangedEvent]
  }
  
  extension [Self <: VisibleSecurityStateChangedEvent](x: Self) {
    
    inline def setVisibleSecurityState(value: VisibleSecurityState): Self = StObject.set(x, "visibleSecurityState", value.asInstanceOf[js.Any])
  }
}
