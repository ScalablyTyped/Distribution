package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceStatus extends js.Object {
  
  var CompletedTasks: Double = js.native
  
  var DesiredTasks: Double = js.native
  
  var RunningTasks: Double = js.native
}
object ServiceStatus {
  
  @scala.inline
  def apply(CompletedTasks: Double, DesiredTasks: Double, RunningTasks: Double): ServiceStatus = {
    val __obj = js.Dynamic.literal(CompletedTasks = CompletedTasks.asInstanceOf[js.Any], DesiredTasks = DesiredTasks.asInstanceOf[js.Any], RunningTasks = RunningTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
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
    def setCompletedTasks(value: Double): Self = this.set("CompletedTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredTasks(value: Double): Self = this.set("DesiredTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTasks(value: Double): Self = this.set("RunningTasks", value.asInstanceOf[js.Any])
  }
}
