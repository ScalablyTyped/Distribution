package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerVersionUpdatedEvent extends js.Object {
  
  var versions: js.Array[ServiceWorkerVersion] = js.native
}
object WorkerVersionUpdatedEvent {
  
  @scala.inline
  def apply(versions: js.Array[ServiceWorkerVersion]): WorkerVersionUpdatedEvent = {
    val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerVersionUpdatedEvent]
  }
  
  @scala.inline
  implicit class WorkerVersionUpdatedEventOps[Self <: WorkerVersionUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setVersionsVarargs(value: ServiceWorkerVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[ServiceWorkerVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
