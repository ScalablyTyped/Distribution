package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_Error extends js.Object

@JSGlobal("EnumDWT_Error")
@js.native
object EnumDWT_Error extends js.Object {
  @js.native
  sealed trait ModuleNotExists
    extends dwtLib.EnumDWT_Error
  
  /* -2371 */ val ModuleNotExists: ModuleNotExists with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_Error with scala.Double] = js.native
}

