package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ConverMode extends js.Object

@JSGlobal("EnumDWT_ConverMode")
@js.native
object EnumDWT_ConverMode extends js.Object {
  @js.native
  sealed trait CM_DEFAULT
    extends dwtLib.EnumDWT_ConverMode
  
  @js.native
  sealed trait CM_RENDERALL
    extends dwtLib.EnumDWT_ConverMode
  
  /* 0 */ val CM_DEFAULT: CM_DEFAULT with scala.Double = js.native
  /* 1 */ val CM_RENDERALL: CM_RENDERALL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_ConverMode with scala.Double] = js.native
}

