package typings.expoDevServer.anon

import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDebuggerConnected extends StObject {
  
  def isDebuggerConnected(): Boolean
  
  var server: Server[WebSocket]
}
object IsDebuggerConnected {
  
  inline def apply(isDebuggerConnected: () => Boolean, server: Server[WebSocket]): IsDebuggerConnected = {
    val __obj = js.Dynamic.literal(isDebuggerConnected = js.Any.fromFunction0(isDebuggerConnected), server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDebuggerConnected]
  }
  
  extension [Self <: IsDebuggerConnected](x: Self) {
    
    inline def setIsDebuggerConnected(value: () => Boolean): Self = StObject.set(x, "isDebuggerConnected", js.Any.fromFunction0(value))
    
    inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
