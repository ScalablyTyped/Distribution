package typings.ethersprojectLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("@ethersproject/logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogLevel with String] = js.native
  
  @js.native
  sealed trait DEBUG extends LogLevel
  /* "DEBUG" */ @js.native
  object DEBUG extends TopLevel[DEBUG with String]
  
  @js.native
  sealed trait ERROR extends LogLevel
  /* "ERROR" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  @js.native
  sealed trait INFO extends LogLevel
  /* "INFO" */ @js.native
  object INFO extends TopLevel[INFO with String]
  
  @js.native
  sealed trait OFF extends LogLevel
  /* "OFF" */ @js.native
  object OFF extends TopLevel[OFF with String]
  
  @js.native
  sealed trait WARNING extends LogLevel
  /* "WARNING" */ @js.native
  object WARNING extends TopLevel[WARNING with String]
}
