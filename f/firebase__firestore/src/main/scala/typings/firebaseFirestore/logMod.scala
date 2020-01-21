package typings.firebaseFirestore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    /* 0 */ @js.native
    object DEBUG extends TopLevel[DEBUG with Double]
    
    /* 1 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 2 */ @js.native
    object SILENT extends TopLevel[SILENT with Double]
    
  }
  
}

