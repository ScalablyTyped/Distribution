package typings.expoDevServer.anon

import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debuggerproxy extends StObject {
  
  @JSName("/debugger-proxy")
  var `Slashdebugger-proxy`: Server[WebSocket]
  
  @JSName("/events")
  var Slashevents: Server[WebSocket]
  
  @JSName("/message")
  var Slashmessage: Server[WebSocket]
}
object Debuggerproxy {
  
  inline def apply(
    `Slashdebugger-proxy`: Server[WebSocket],
    Slashevents: Server[WebSocket],
    Slashmessage: Server[WebSocket]
  ): Debuggerproxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/debugger-proxy")(`Slashdebugger-proxy`.asInstanceOf[js.Any])
    __obj.updateDynamic("/events")(Slashevents.asInstanceOf[js.Any])
    __obj.updateDynamic("/message")(Slashmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debuggerproxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Debuggerproxy] (val x: Self) extends AnyVal {
    
    inline def `setSlashdebugger-proxy`(value: Server[WebSocket]): Self = StObject.set(x, "/debugger-proxy", value.asInstanceOf[js.Any])
    
    inline def setSlashevents(value: Server[WebSocket]): Self = StObject.set(x, "/events", value.asInstanceOf[js.Any])
    
    inline def setSlashmessage(value: Server[WebSocket]): Self = StObject.set(x, "/message", value.asInstanceOf[js.Any])
  }
}
