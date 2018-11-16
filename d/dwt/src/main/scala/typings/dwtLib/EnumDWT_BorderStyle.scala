package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_BorderStyle extends js.Object

/** Border Styles */
@JSGlobal("EnumDWT_BorderStyle")
@js.native
object EnumDWT_BorderStyle extends js.Object {
  /** No border. */
  @js.native
  sealed trait TWBS_NONE
    extends dwtLib.EnumDWT_BorderStyle
  
  /** 3D border.   */
  @js.native
  sealed trait TWBS_SINGLE3D
    extends dwtLib.EnumDWT_BorderStyle
  
  /** Flat border. */
  @js.native
  sealed trait TWBS_SINGLEFLAT
    extends dwtLib.EnumDWT_BorderStyle
  
  /* 0 */ val TWBS_NONE: TWBS_NONE with scala.Double = js.native
  /* 2 */ val TWBS_SINGLE3D: TWBS_SINGLE3D with scala.Double = js.native
  /* 1 */ val TWBS_SINGLEFLAT: TWBS_SINGLEFLAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_BorderStyle with scala.Double] = js.native
}

