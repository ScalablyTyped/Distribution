package typings.firebaseLogger.loggerMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 4 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 2 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 5 */ @js.native
  object SILENT extends TopLevel[SILENT with Double]
  
  /* 1 */ @js.native
  object VERBOSE extends TopLevel[VERBOSE with Double]
  
  /* 3 */ @js.native
  object WARN extends TopLevel[WARN with Double]
  
}

