package typings.dockerode.mod

import typings.dockerode.anon.Arguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecInspectInfo extends StObject {
  
  var CanRemove: Boolean = js.native
  
  var ContainerID: String = js.native
  
  var DetachKeys: String = js.native
  
  var ExitCode: Double | Null = js.native
  
  var ID: String = js.native
  
  var OpenStderr: Boolean = js.native
  
  var OpenStdin: Boolean = js.native
  
  var OpenStdout: Boolean = js.native
  
  var Pid: Double = js.native
  
  var ProcessConfig: Arguments = js.native
  
  var Running: Boolean = js.native
}
object ExecInspectInfo {
  
  @scala.inline
  def apply(
    CanRemove: Boolean,
    ContainerID: String,
    DetachKeys: String,
    ID: String,
    OpenStderr: Boolean,
    OpenStdin: Boolean,
    OpenStdout: Boolean,
    Pid: Double,
    ProcessConfig: Arguments,
    Running: Boolean
  ): ExecInspectInfo = {
    val __obj = js.Dynamic.literal(CanRemove = CanRemove.asInstanceOf[js.Any], ContainerID = ContainerID.asInstanceOf[js.Any], DetachKeys = DetachKeys.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], OpenStderr = OpenStderr.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], OpenStdout = OpenStdout.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], ProcessConfig = ProcessConfig.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInspectInfo]
  }
  
  @scala.inline
  implicit class ExecInspectInfoMutableBuilder[Self <: ExecInspectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRemove(value: Boolean): Self = StObject.set(x, "CanRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerID(value: String): Self = StObject.set(x, "ContainerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachKeys(value: String): Self = StObject.set(x, "DetachKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeNull: Self = StObject.set(x, "ExitCode", null)
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStderr(value: Boolean): Self = StObject.set(x, "OpenStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStdout(value: Boolean): Self = StObject.set(x, "OpenStdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessConfig(value: Arguments): Self = StObject.set(x, "ProcessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
  }
}
