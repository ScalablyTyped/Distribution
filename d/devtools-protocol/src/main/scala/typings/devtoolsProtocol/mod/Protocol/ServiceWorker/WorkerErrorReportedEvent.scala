package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerErrorReportedEvent extends js.Object {
  
  var errorMessage: ServiceWorkerErrorMessage = js.native
}
object WorkerErrorReportedEvent {
  
  @scala.inline
  def apply(errorMessage: ServiceWorkerErrorMessage): WorkerErrorReportedEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerErrorReportedEvent]
  }
  
  @scala.inline
  implicit class WorkerErrorReportedEventOps[Self <: WorkerErrorReportedEvent] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: ServiceWorkerErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
  }
}
