package typings.atFirebaseLogger.distSrcLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("@firebase/logger/dist/src/logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends LogLevel
  
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait SILENT extends LogLevel
  
  @js.native
  sealed trait VERBOSE extends LogLevel
  
  @js.native
  sealed trait WARN extends LogLevel
  
  /* 0 */ val DEBUG: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.DEBUG with Double = js.native
  /* 4 */ val ERROR: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.ERROR with Double = js.native
  /* 2 */ val INFO: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.INFO with Double = js.native
  /* 5 */ val SILENT: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.SILENT with Double = js.native
  /* 1 */ val VERBOSE: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE with Double = js.native
  /* 3 */ val WARN: typings.atFirebaseLogger.distSrcLoggerMod.LogLevel.WARN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
}

