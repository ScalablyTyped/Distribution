package typings.expoDevServer.anon

import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportEvent extends StObject {
  
  def reportEvent(event: Any): Unit
  
  var server: Server[WebSocket]
}
object ReportEvent {
  
  inline def apply(reportEvent: Any => Unit, server: Server[WebSocket]): ReportEvent = {
    val __obj = js.Dynamic.literal(reportEvent = js.Any.fromFunction1(reportEvent), server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportEvent] (val x: Self) extends AnyVal {
    
    inline def setReportEvent(value: Any => Unit): Self = StObject.set(x, "reportEvent", js.Any.fromFunction1(value))
    
    inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
