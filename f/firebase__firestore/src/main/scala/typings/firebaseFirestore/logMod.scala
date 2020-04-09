package typings.firebaseFirestore

import typings.firebaseLogger.loggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  def getLogLevel(): LogLevel = js.native
  def logDebug(msg: String, obj: js.Any*): Unit = js.native
  def logError(msg: String, obj: js.Any*): Unit = js.native
  def setLogLevel(newLevel: LogLevel): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 0 */ val DEBUG: typings.firebaseLogger.loggerMod.LogLevel.DEBUG with Double = js.native
    /* 4 */ val ERROR: typings.firebaseLogger.loggerMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val INFO: typings.firebaseLogger.loggerMod.LogLevel.INFO with Double = js.native
    /* 5 */ val SILENT: typings.firebaseLogger.loggerMod.LogLevel.SILENT with Double = js.native
    /* 1 */ val VERBOSE: typings.firebaseLogger.loggerMod.LogLevel.VERBOSE with Double = js.native
    /* 3 */ val WARN: typings.firebaseLogger.loggerMod.LogLevel.WARN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.firebaseLogger.loggerMod.LogLevel with Double] = js.native
  }
  
}

