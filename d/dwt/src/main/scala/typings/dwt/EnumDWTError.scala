package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTError extends js.Object

@JSGlobal("EnumDWT_Error")
@js.native
object EnumDWTError extends js.Object {
  @js.native
  sealed trait ModuleNotExists extends EnumDWTError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTError with Double] = js.native
  /* -2371 */ @js.native
  object ModuleNotExists extends TopLevel[ModuleNotExists with Double]
  
}

