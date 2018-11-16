package typings
package atFirebaseLoggerLib.distSrcLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("@firebase/logger/dist/src/logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  @js.native
  sealed trait ERROR
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  @js.native
  sealed trait INFO
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  @js.native
  sealed trait SILENT
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  @js.native
  sealed trait VERBOSE
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  @js.native
  sealed trait WARN
    extends atFirebaseLoggerLib.distSrcLoggerMod.LogLevel
  
  /* 0 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 4 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val INFO: INFO with scala.Double = js.native
  /* 5 */ val SILENT: SILENT with scala.Double = js.native
  /* 1 */ val VERBOSE: VERBOSE with scala.Double = js.native
  /* 3 */ val WARN: WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atFirebaseLoggerLib.distSrcLoggerMod.LogLevel with scala.Double] = js.native
}

