package typings.dockerode.mod

import typings.dockerode.anon.Arguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecInspectInfo extends StObject {
  
  var CanRemove: Boolean
  
  var ContainerID: String
  
  var DetachKeys: String
  
  var ExitCode: Double | Null
  
  var ID: String
  
  var OpenStderr: Boolean
  
  var OpenStdin: Boolean
  
  var OpenStdout: Boolean
  
  var Pid: Double
  
  var ProcessConfig: Arguments
  
  var Running: Boolean
}
object ExecInspectInfo {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(CanRemove = CanRemove.asInstanceOf[js.Any], ContainerID = ContainerID.asInstanceOf[js.Any], DetachKeys = DetachKeys.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], OpenStderr = OpenStderr.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], OpenStdout = OpenStdout.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], ProcessConfig = ProcessConfig.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], ExitCode = null)
    __obj.asInstanceOf[ExecInspectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecInspectInfo] (val x: Self) extends AnyVal {
    
    inline def setCanRemove(value: Boolean): Self = StObject.set(x, "CanRemove", value.asInstanceOf[js.Any])
    
    inline def setContainerID(value: String): Self = StObject.set(x, "ContainerID", value.asInstanceOf[js.Any])
    
    inline def setDetachKeys(value: String): Self = StObject.set(x, "DetachKeys", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeNull: Self = StObject.set(x, "ExitCode", null)
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setOpenStderr(value: Boolean): Self = StObject.set(x, "OpenStderr", value.asInstanceOf[js.Any])
    
    inline def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    inline def setOpenStdout(value: Boolean): Self = StObject.set(x, "OpenStdout", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setProcessConfig(value: Arguments): Self = StObject.set(x, "ProcessConfig", value.asInstanceOf[js.Any])
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
  }
}
