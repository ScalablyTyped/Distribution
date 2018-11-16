package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapOverscan extends js.Object

/** ICAP_OVERSCAN values. */
@JSGlobal("EnumDWT_CapOverscan")
@js.native
object EnumDWT_CapOverscan extends js.Object {
  @js.native
  sealed trait TWOV_ALL
    extends dwtLib.EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_AUTO
    extends dwtLib.EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_LEFTRIGHT
    extends dwtLib.EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_NONE
    extends dwtLib.EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_TOPBOTTOM
    extends dwtLib.EnumDWT_CapOverscan
  
  /* 4 */ val TWOV_ALL: TWOV_ALL with scala.Double = js.native
  /* 1 */ val TWOV_AUTO: TWOV_AUTO with scala.Double = js.native
  /* 3 */ val TWOV_LEFTRIGHT: TWOV_LEFTRIGHT with scala.Double = js.native
  /* 0 */ val TWOV_NONE: TWOV_NONE with scala.Double = js.native
  /* 2 */ val TWOV_TOPBOTTOM: TWOV_TOPBOTTOM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapOverscan with scala.Double] = js.native
}

