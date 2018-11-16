package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("ftpd", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG
    extends ftpdLib.ftpdMod.LogLevel
  
  @js.native
  sealed trait ERROR
    extends ftpdLib.ftpdMod.LogLevel
  
  @js.native
  sealed trait INFO
    extends ftpdLib.ftpdMod.LogLevel
  
  @js.native
  sealed trait TRACE
    extends ftpdLib.ftpdMod.LogLevel
  
  @js.native
  sealed trait WARN
    extends ftpdLib.ftpdMod.LogLevel
  
  /* 3 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val INFO: INFO with scala.Double = js.native
  /* 4 */ val TRACE: TRACE with scala.Double = js.native
  /* 1 */ val WARN: WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ftpdLib.ftpdMod.LogLevel with scala.Double] = js.native
}

