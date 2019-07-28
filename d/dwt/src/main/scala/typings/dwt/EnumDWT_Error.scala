package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_Error extends js.Object

@JSGlobal("EnumDWT_Error")
@js.native
object EnumDWT_Error extends js.Object {
  @js.native
  sealed trait ModuleNotExists extends EnumDWT_Error
  
  /* -2371 */ val ModuleNotExists: typings.dwt.EnumDWT_Error.ModuleNotExists with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_Error with Double] = js.native
}

