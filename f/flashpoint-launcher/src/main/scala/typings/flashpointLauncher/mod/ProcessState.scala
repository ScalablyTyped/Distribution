package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessState extends StObject
/** State of a managed process. */
@JSImport("flashpoint-launcher", "ProcessState")
@js.native
object ProcessState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessState & Double] = js.native
  
  /** The process is being killed (it has been requested to terminate, but it hasn't been terminated yet). */
  @js.native
  sealed trait KILLING
    extends StObject
       with ProcessState
  /* 2 */ val KILLING: typings.flashpointLauncher.mod.ProcessState.KILLING & Double = js.native
  
  /** The process is running. */
  @js.native
  sealed trait RUNNING
    extends StObject
       with ProcessState
  /* 1 */ val RUNNING: typings.flashpointLauncher.mod.ProcessState.RUNNING & Double = js.native
  
  /** The process is not running. */
  @js.native
  sealed trait STOPPED
    extends StObject
       with ProcessState
  /* 0 */ val STOPPED: typings.flashpointLauncher.mod.ProcessState.STOPPED & Double = js.native
}
