package typings.ethersprojectLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("@ethersproject/logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends LogLevel
  
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait OFF extends LogLevel
  
  @js.native
  sealed trait WARNING extends LogLevel
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogLevel with String] = js.native
  /* "DEBUG" */ @js.native
  object DEBUG extends TopLevel[DEBUG with String]
  
  /* "ERROR" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "INFO" */ @js.native
  object INFO extends TopLevel[INFO with String]
  
  /* "OFF" */ @js.native
  object OFF extends TopLevel[OFF with String]
  
  /* "WARNING" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
  
}

