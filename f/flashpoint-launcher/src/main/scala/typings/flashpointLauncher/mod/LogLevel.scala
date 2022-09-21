package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
/** Severity level of a Log */
@JSImport("flashpoint-launcher", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  /* 1 */ val DEBUG: typings.flashpointLauncher.mod.LogLevel.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  /* 4 */ val ERROR: typings.flashpointLauncher.mod.LogLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  /* 2 */ val INFO: typings.flashpointLauncher.mod.LogLevel.INFO & Double = js.native
  
  @js.native
  sealed trait SILENT
    extends StObject
       with LogLevel
  /* 5 */ val SILENT: typings.flashpointLauncher.mod.LogLevel.SILENT & Double = js.native
  
  @js.native
  sealed trait TRACE
    extends StObject
       with LogLevel
  /* 0 */ val TRACE: typings.flashpointLauncher.mod.LogLevel.TRACE & Double = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
  /* 3 */ val WARN: typings.flashpointLauncher.mod.LogLevel.WARN & Double = js.native
}
