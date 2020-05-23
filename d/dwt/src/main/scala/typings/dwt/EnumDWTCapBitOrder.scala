package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapBitOrder extends js.Object

/** ICAP_BITORDER values. */
@JSGlobal("EnumDWT_CapBitOrder")
@js.native
object EnumDWTCapBitOrder extends js.Object {
  @js.native
  sealed trait TWBO_LSBFIRST extends EnumDWTCapBitOrder
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST extends EnumDWTCapBitOrder
  
}

