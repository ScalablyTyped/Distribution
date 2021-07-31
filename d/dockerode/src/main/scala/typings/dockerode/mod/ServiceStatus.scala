package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceStatus extends StObject {
  
  var CompletedTasks: Double
  
  var DesiredTasks: Double
  
  var RunningTasks: Double
}
object ServiceStatus {
  
  @scala.inline
  def apply(CompletedTasks: Double, DesiredTasks: Double, RunningTasks: Double): ServiceStatus = {
    val __obj = js.Dynamic.literal(CompletedTasks = CompletedTasks.asInstanceOf[js.Any], DesiredTasks = DesiredTasks.asInstanceOf[js.Any], RunningTasks = RunningTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusMutableBuilder[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedTasks(value: Double): Self = StObject.set(x, "CompletedTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredTasks(value: Double): Self = StObject.set(x, "DesiredTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTasks(value: Double): Self = StObject.set(x, "RunningTasks", value.asInstanceOf[js.Any])
  }
}
