package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.entryAdded
import typings.devtoolsProtocol.mod.Protocol.Log.EntryAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Log.StartViolationsReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogApi extends StObject {
  
  /**
    * Clears the log.
    */
  def clear(): js.Promise[Unit]
  
  /**
    * Disables log domain, prevents further log entries from being reported to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables log domain, sends the entries collected so far to the client by means of the
    * `entryAdded` notification.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Issued when new message was logged.
    */
  @JSName("on")
  def on_entryAdded(event: entryAdded, listener: js.Function1[/* params */ EntryAddedEvent, Unit]): Unit
  
  /**
    * start violation reporting.
    */
  def startViolationsReport(params: StartViolationsReportRequest): js.Promise[Unit]
  
  /**
    * Stop violation reporting.
    */
  def stopViolationsReport(): js.Promise[Unit]
}
object LogApi {
  
  inline def apply(
    clear: () => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (entryAdded, js.Function1[/* params */ EntryAddedEvent, Unit]) => Unit,
    startViolationsReport: StartViolationsReportRequest => js.Promise[Unit],
    stopViolationsReport: () => js.Promise[Unit]
  ): LogApi = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on), startViolationsReport = js.Any.fromFunction1(startViolationsReport), stopViolationsReport = js.Any.fromFunction0(stopViolationsReport))
    __obj.asInstanceOf[LogApi]
  }
  
  extension [Self <: LogApi](x: Self) {
    
    inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setOn(value: (entryAdded, js.Function1[/* params */ EntryAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setStartViolationsReport(value: StartViolationsReportRequest => js.Promise[Unit]): Self = StObject.set(x, "startViolationsReport", js.Any.fromFunction1(value))
    
    inline def setStopViolationsReport(value: () => js.Promise[Unit]): Self = StObject.set(x, "stopViolationsReport", js.Any.fromFunction0(value))
  }
}
