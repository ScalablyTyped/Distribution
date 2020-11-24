package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.entryAdded
import typings.devtoolsProtocol.mod.Protocol.Log.EntryAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Log.StartViolationsReportRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogApi extends js.Object {
  
  /**
    * Clears the log.
    */
  def clear(): js.Promise[Unit] = js.native
  
  /**
    * Disables log domain, prevents further log entries from being reported to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables log domain, sends the entries collected so far to the client by means of the
    * `entryAdded` notification.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Issued when new message was logged.
    */
  @JSName("on")
  def on_entryAdded(event: entryAdded, listener: js.Function1[/* params */ EntryAddedEvent, Unit]): Unit = js.native
  
  /**
    * start violation reporting.
    */
  def startViolationsReport(params: StartViolationsReportRequest): js.Promise[Unit] = js.native
  
  /**
    * Stop violation reporting.
    */
  def stopViolationsReport(): js.Promise[Unit] = js.native
}
object LogApi {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LogApiOps[Self <: LogApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => js.Promise[Unit]): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (entryAdded, js.Function1[/* params */ EntryAddedEvent, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartViolationsReport(value: StartViolationsReportRequest => js.Promise[Unit]): Self = this.set("startViolationsReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopViolationsReport(value: () => js.Promise[Unit]): Self = this.set("stopViolationsReport", js.Any.fromFunction0(value))
  }
}
