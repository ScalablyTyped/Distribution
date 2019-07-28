package typings.dwt

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
  sealed trait TWBO_LSBFIRST extends EnumDWT_CapBitOrder
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST extends EnumDWT_CapBitOrder
  
  /* 0 */ val TWBO_LSBFIRST: typings.dwt.EnumDWT_CapBitOrder.TWBO_LSBFIRST with Double = js.native
  /* 1 */ val TWBO_MSBFIRST: typings.dwt.EnumDWT_CapBitOrder.TWBO_MSBFIRST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapBitOrder with Double] = js.native
}

