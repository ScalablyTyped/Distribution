package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapBitOrder extends js.Object

/** ICAP_BITORDER values. */
@JSGlobal("EnumDWT_CapBitOrder")
@js.native
object EnumDWT_CapBitOrder extends js.Object {
  @js.native
  sealed trait TWBO_LSBFIRST
    extends dwtLib.EnumDWT_CapBitOrder
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST
    extends dwtLib.EnumDWT_CapBitOrder
  
  /* 0 */ val TWBO_LSBFIRST: TWBO_LSBFIRST with scala.Double = js.native
  /* 1 */ val TWBO_MSBFIRST: TWBO_MSBFIRST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapBitOrder with scala.Double] = js.native
}

