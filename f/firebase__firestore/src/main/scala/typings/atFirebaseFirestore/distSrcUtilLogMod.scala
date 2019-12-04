package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcUtilLogMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/log", JSImport.Namespace)
@js.native
object distSrcUtilLogMod extends js.Object {
  @js.native
  sealed trait LogLevel extends js.Object
  
  def debug(tag: String, msg: String, obj: js.Any*): Unit = js.native
  def error(msg: String, obj: js.Any*): Unit = js.native
  def getLogLevel(): LogLevel = js.native
  def setLogLevel(newLevel: LogLevel): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait DEBUG extends LogLevel
    
    @js.native
    sealed trait ERROR extends LogLevel
    
    @js.native
    sealed trait SILENT extends LogLevel
    
    /* 0 */ val DEBUG: typings.atFirebaseFirestore.distSrcUtilLogMod.LogLevel.DEBUG with Double = js.native
    /* 1 */ val ERROR: typings.atFirebaseFirestore.distSrcUtilLogMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val SILENT: typings.atFirebaseFirestore.distSrcUtilLogMod.LogLevel.SILENT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  }
  
}

