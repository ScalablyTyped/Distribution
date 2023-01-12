package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dead extends StObject {
  
  var Dead: Boolean
  
  var Error: String
  
  var ExitCode: Double
  
  var FinishedAt: String
  
  var Health: js.UndefOr[FailingStreak] = js.undefined
  
  var OOMKilled: Boolean
  
  var Paused: Boolean
  
  var Pid: Double
  
  var Restarting: Boolean
  
  var Running: Boolean
  
  var StartedAt: String
  
  var Status: String
}
object Dead {
  
  inline def apply(
    Dead: Boolean,
    Error: String,
    ExitCode: Double,
    FinishedAt: String,
    OOMKilled: Boolean,
    Paused: Boolean,
    Pid: Double,
    Restarting: Boolean,
    Running: Boolean,
    StartedAt: String,
    Status: String
  ): Dead = {
    val __obj = js.Dynamic.literal(Dead = Dead.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], FinishedAt = FinishedAt.asInstanceOf[js.Any], OOMKilled = OOMKilled.asInstanceOf[js.Any], Paused = Paused.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], Restarting = Restarting.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dead] (val x: Self) extends AnyVal {
    
    inline def setDead(value: Boolean): Self = StObject.set(x, "Dead", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: String): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    inline def setHealth(value: FailingStreak): Self = StObject.set(x, "Health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "Health", js.undefined)
    
    inline def setOOMKilled(value: Boolean): Self = StObject.set(x, "OOMKilled", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "Paused", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setRestarting(value: Boolean): Self = StObject.set(x, "Restarting", value.asInstanceOf[js.Any])
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: String): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
