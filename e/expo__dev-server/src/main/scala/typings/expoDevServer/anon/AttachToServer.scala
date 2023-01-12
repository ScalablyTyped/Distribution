package typings.expoDevServer.anon

import typings.expoBunyan.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToServer extends StObject {
  
  var attachToServer: Any
  
  var debuggerProxyEndpoint: IsDebuggerConnected
  
  var eventsSocketEndpoint: ReportEvent
  
  var logger: ^
  
  var messageSocketEndpoint: Broadcast
  
  var middleware: Any
  
  var websocketEndpoints: Debuggerproxy
}
object AttachToServer {
  
  inline def apply(
    attachToServer: Any,
    debuggerProxyEndpoint: IsDebuggerConnected,
    eventsSocketEndpoint: ReportEvent,
    logger: ^,
    messageSocketEndpoint: Broadcast,
    middleware: Any,
    websocketEndpoints: Debuggerproxy
  ): AttachToServer = {
    val __obj = js.Dynamic.literal(attachToServer = attachToServer.asInstanceOf[js.Any], debuggerProxyEndpoint = debuggerProxyEndpoint.asInstanceOf[js.Any], eventsSocketEndpoint = eventsSocketEndpoint.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], messageSocketEndpoint = messageSocketEndpoint.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], websocketEndpoints = websocketEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachToServer] (val x: Self) extends AnyVal {
    
    inline def setAttachToServer(value: Any): Self = StObject.set(x, "attachToServer", value.asInstanceOf[js.Any])
    
    inline def setDebuggerProxyEndpoint(value: IsDebuggerConnected): Self = StObject.set(x, "debuggerProxyEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEventsSocketEndpoint(value: ReportEvent): Self = StObject.set(x, "eventsSocketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMessageSocketEndpoint(value: Broadcast): Self = StObject.set(x, "messageSocketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setWebsocketEndpoints(value: Debuggerproxy): Self = StObject.set(x, "websocketEndpoints", value.asInstanceOf[js.Any])
  }
}
