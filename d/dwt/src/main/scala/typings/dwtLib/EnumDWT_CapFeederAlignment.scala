package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFeederAlignment extends js.Object

/** CAP_FEEDERALIGNMENT values. */
@JSGlobal("EnumDWT_CapFeederAlignment")
@js.native
object EnumDWT_CapFeederAlignment extends js.Object {
  /** The alignment is centered. This means that the paper will be fed in the middle of the ICAP_PHYSICALWIDTH of the
       *  device. If this is set, then the Application should calculate any frames with a left offset of zero.
       */
  @js.native
  sealed trait TWFA_CENTER
    extends dwtLib.EnumDWT_CapFeederAlignment
  
  /** The alignment is to the left. */
  @js.native
  sealed trait TWFA_LEFT
    extends dwtLib.EnumDWT_CapFeederAlignment
  
  /** The alignment is free-floating. Applications should assume that the origin for frames is on the left. */
  @js.native
  sealed trait TWFA_NONE
    extends dwtLib.EnumDWT_CapFeederAlignment
  
  /** The alignment is to the right. */
  @js.native
  sealed trait TWFA_RIGHT
    extends dwtLib.EnumDWT_CapFeederAlignment
  
  /* 2 */ val TWFA_CENTER: TWFA_CENTER with scala.Double = js.native
  /* 1 */ val TWFA_LEFT: TWFA_LEFT with scala.Double = js.native
  /* 0 */ val TWFA_NONE: TWFA_NONE with scala.Double = js.native
  /* 3 */ val TWFA_RIGHT: TWFA_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapFeederAlignment with scala.Double] = js.native
}

